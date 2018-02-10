package sda.documents.writer;

import java.util.List;
import java.util.Map;

public interface IFileWriter {
    void write(String filePath, List<Map<String,String>> list) throws FileWriterException;
}
