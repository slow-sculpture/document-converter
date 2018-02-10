package sda.documents.reader;

public class FileReaderFactory {
    public IFileReader produce(String filePath) {

        if (filePath.endsWith(".csv")) {

            return new CsvFileReader(filePath);
        } else if (filePath.endsWith(".xml")) {
            return new XmlFileReader(filePath);
        }
        return null;
    }
}

