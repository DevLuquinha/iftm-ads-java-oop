package web.springwithoutweb.service;

import java.io.File;
import java.util.List;

import web.springwithoutweb.model.SalesRecord;

public interface FileReader {
    List<SalesRecord> read(File file);

    boolean allowFormat(String fileName);
}
