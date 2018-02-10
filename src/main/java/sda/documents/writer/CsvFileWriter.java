package sda.documents.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CsvFileWriter implements IFileWriter {


    public CsvFileWriter(String filePath) {

    }

    @Override
    public void write(String filePath, List<Map<String, String>> list) throws FileWriterException {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

         List<String> rows = new ArrayList<>();

         for(String row : rows){
             bufferedWriter.write(row+"\n");
         }

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private List<String> prepareRows(List<Map<String, String>> data){
        List<String> result = new ArrayList<>();
        //TODO: utworzyc liste zawierajaca wiesze nowego pliku CSV
        //wybrac dowolny el z list data
        //utworzyc z tego liste naglowkow -> keySet();
        //
        return result;
    }
}
