package lesson18.task2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {
    private String firstName, lastName, title;
    private StringBuilder result = new StringBuilder();
    private StringBuilder buf = new StringBuilder();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("line")) {
            buf.setLength(0);
        } else if (qName.equals("firstName")) {
            buf.setLength(0);
        } else if (qName.equals("lastName")) {
            buf.setLength(0);
        } else if (qName.equals("title")) {
            buf.setLength(0);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equals("line")) {
            result.append(buf.toString()).append("\n");
        } else if (qName.equals("firstName")) {
            firstName = buf.toString();
        } else if (qName.equals("lastName")) {
            lastName = buf.toString();
        } else if (qName.equals("title")) {
            title = buf.toString();
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        buf.append(ch, start, length);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public StringBuilder getResult() {
        return result;
    }
}
