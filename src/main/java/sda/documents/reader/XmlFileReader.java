package sda.documents.reader;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * nieskonczone
 */
public class XmlFileReader implements IFileReader {
    private String path;

    public XmlFileReader(String path) {
        this.path = path;
    }

    @Override
    public List<Map<String, String>> read(String filePath) throws IFileReaderException {
        List<Map<String, String>> result = new ArrayList<>();
        try {
            JAXBContext context = JAXBContext.newInstance();
            Unmarshaller u =context.createUnmarshaller();
            Object o = u.unmarshal(new java.io.File(filePath));

            return result;
        } catch (JAXBException e) {
            e.printStackTrace();

            return null;
        }
    }
}
