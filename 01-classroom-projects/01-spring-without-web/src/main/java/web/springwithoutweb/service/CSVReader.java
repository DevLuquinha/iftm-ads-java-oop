package web.springwithoutweb.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;
import web.springwithoutweb.model.SalesRecord;

@Component
public class CSVReader implements FileReader {

    @Override
    public List<SalesRecord> read(File file) {
        List<SalesRecord> sales = new ArrayList<SalesRecord>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                if (data.length == 2) {
                    SalesRecord sale = new SalesRecord();
                    sale.setProduct(data[0].trim());
                    sale.setValor(Double.parseDouble(data[1].trim()));
                    sales.add(sale);
                }
            }
        } catch (Exception e) {
            System.err.println("Error on read file: " + e.getMessage());
        }

        return sales;
    }

    @Override
    public boolean allowFormat(String fileName) {
        return fileName.toLowerCase().endsWith(".csv");
    }
}
