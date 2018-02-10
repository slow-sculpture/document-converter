package sda.documents;

import sda.documents.reader.IFileReaderException;
import sda.documents.writer.FileWriterException;

public interface IDocumentConverter {
    void convert(String inputFilePath, String outputFilePath) throws IFileReaderException, FileWriterException;
}
