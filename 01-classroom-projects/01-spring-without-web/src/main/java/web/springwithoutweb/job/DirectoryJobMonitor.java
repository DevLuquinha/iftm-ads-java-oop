package web.springwithoutweb.job;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import web.springwithoutweb.model.SalesRecord;
import web.springwithoutweb.service.ImporterService;

@Component
public class DirectoryJobMonitor {
    private final ImporterService importerService;

    @Value("${app.system.input-directory}")
    private String inputDirectory;

    public DirectoryJobMonitor(ImporterService importerService) {
        this.importerService = importerService;
    }

    @Scheduled(fixedDelayString = "${app.system.read-interval}")
    public void verifyDirectory() {
        System.out.println("\n=== Initing the Routine Verification ===");

        File directory = new File(inputDirectory);

        if (!directory.exists()) {
            boolean directoryIsCreated = directory.mkdirs();
            if (directoryIsCreated) {
                System.out.println("The Input directory was created successfully!");
            }
        }

        try {
            System.out.println("Watching directory: " + directory.getCanonicalPath());
        } catch (Exception e) {
            System.out.println("Watching directory: " + directory.getAbsolutePath());
        }

        File[] files = directory.listFiles();

        boolean anyFileIsProcessed = false;

        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isFile() && !file.getName().endsWith(".processed")) {
                    importerService.processarArquivo(file);
                    anyFileIsProcessed = true;
                }
            }
        }

        if (anyFileIsProcessed) {
            System.out.println("Processing finished. Updating screen...");
            List<SalesRecord> allSales = importerService.getAllSales();

            if (allSales.isEmpty()) {
                System.out.println("The database is null on moment.");
            } else {
                System.out.println("---------- SALES REPORT ----------");
                System.out.printf("%-5s | %-20s | %-10s%n", "ID", "PRODUCT", "VALUE");
                System.out.println("--------------------------------------------------");

                for (SalesRecord sale : allSales) {
                    System.out.printf("%-5d | %-20s | R$ %-10.2f%n", sale.getId(), sale.getProduct(), sale.getValor());
                }

                System.out.println("--------------------------------------------------");
            }
        } else {
            System.out.println("Any new file to process.");
        }
    }
}
