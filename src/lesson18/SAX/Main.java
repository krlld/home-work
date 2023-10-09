package lesson18.SAX;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

//  Задача *:
//  Дополнительно реализовать следующий функционал: если с консоли введено значение 1
//  - распарсить документ с помощью SAX, если с консоли введено значение 2 - распарсить
//  документ с помощью DOM.
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        saxParserFactory.setNamespaceAware(true);
        SAXParser saxParser = saxParserFactory.newSAXParser();
        Handler handler = new Handler();
        saxParser.parse("/Users/kirilldikun/Desktop/tasks/src/lesson18/text.xml", handler);
        File result = new File("/Users/kirilldikun/Desktop/tasks/src/lesson18/SAX/" +
                handler.getFirstName() + "_" + handler.getLastName() + "_" + handler.getTitle() + ".txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(result))) {
            bw.write(handler.getResult().toString());
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
