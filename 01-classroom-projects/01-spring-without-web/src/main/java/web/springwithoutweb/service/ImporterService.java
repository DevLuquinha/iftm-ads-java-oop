package web.springwithoutweb.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.springwithoutweb.model.SalesRecord;
import web.springwithoutweb.repository.SalesRecordRepository;

@Service
public class ImporterService {
    private final SalesRecordRepository repository;
    private final List<FileReader> readers;

    public ImporterService(SalesRecordRepository recordRepository, List<FileReader> readers) {
        System.out.println("File readers founded: " + readers);

        this.repository = recordRepository;
        this.readers = readers;
    }

    @Transactional
    public void processarArquivo(File file) {
        for (FileReader reader : readers) {
            if (reader.allowFormat(file.getName())) {
                List<SalesRecord> records = reader.read(file);
                repository.saveAll(records);

                System.out.println("Succesfully: " + records.size() + " itens salvos do arquivo " + file.getName());

                File fileWithName = new File(file.getParent(), file.getName() + ".processed");

                boolean isRenamed = file.renameTo(fileWithName);

                if (isRenamed) {
                    System.out.println("File stored on history as: " + fileWithName.getName());
                } else {
                    System.out.println("Warning: Can't rename the file " + file.getName());
                }

                return;
            }
        }

        System.out.println("Any supported reader to file: " + file.getName());
    }

    public List<SalesRecord> getAllSales() {
        return repository.findAll();
    }
}
