package sda.documents;

public class App 
{
    public static void main( String[] args ) {
        String inputFilePath = "C:\\Users\\chris\\IdeaProjects\\sda_j5_documentconverter\\in.csv";
        String outputFilePath = "C:\\Users\\chris\\IdeaProjects\\sda_j5_documentconverter\\out.csv";

        IDocumentConverter documentConverter = new DocumentConverter();
        documentConverter.convert(inputFilePath, outputFilePath);
    }
}
