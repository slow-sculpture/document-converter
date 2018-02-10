package sda.documents;

import sda.documents.reader.FileReaderFactory;
import sda.documents.reader.IFileReader;
import sda.documents.reader.IFileReaderException;
import sda.documents.writer.FileWriterException;
import sda.documents.writer.FileWriterFactory;
import sda.documents.writer.IFileWriter;

import java.util.List;
import java.util.Map;

public class DocumentConverter implements IDocumentConverter {
    @Override
    public void convert(String inputFilePath, String outputFilePath) throws IFileReaderException, FileWriterException {
        FileReaderFactory fileReaderFactory = new FileReaderFactory();
        IFileReader fileReader = fileReaderFactory.produce(inputFilePath);
        List<Map<String, String>> data = fileReader.read(inputFilePath);

        FileWriterFactory fileWriterFactory = new FileWriterFactory();
        IFileWriter fileWriter = fileWriterFactory.produce(outputFilePath);
        fileWriter.write(outputFilePath, data);
    }
}
