package sda.documents.writer;

public class FileWriterFactory {
    public IFileWriter produce(String filePath){
        if(filePath.endsWith(".csv")){
            return new CsvFileWriter(filePath);
        }
        return null;
    }
}
