package sda.documents.reader;

import java.util.List;
import java.util.Map;

public interface IFileReader {
    List<Map<String,String>> read(String filePath) throws IFileReaderException;
}
