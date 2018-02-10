package sda.documents;

import sda.documents.reader.IFileReaderException;
import sda.documents.writer.FileWriterException;

import java.io.FileWriter;

public class App
{
    public static void main( String[] args ) throws IFileReaderException, FileWriterException {
        String inputFilePath = "C:\\Users\\chris\\IdeaProjects\\sda_j5_documentconverter\\in.csv";
        String outputFilePath = "C:\\Users\\chris\\IdeaProjects\\sda_j5_documentconverter\\out.csv";

        IDocumentConverter documentConverter = new DocumentConverter();
        try {
            documentConverter.convert(inputFilePath, outputFilePath);
        } catch (FileWriterException e) {
            e.printStackTrace();
        } catch (IFileReaderException e){
            e.printStackTrace();
        }


    }
}
