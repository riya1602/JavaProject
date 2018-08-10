import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

/**
 * Created by expert on 9/8/18.
 */
public class SaxParserDemo {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        try{
            File inputFile=new File("input.txt");
            SAXParserFactory factory=SAXParserFactory.newInstance();
            SAXParser saxParser=factory.newSAXParser();
            UserHandler userHandler=new UserHandler();
            saxParser.parse(inputFile,userHandler);
        }catch(Exception e) {
        }
        }

    }
    class UserHandler extends DefaultHandler{
        boolean Name=false;
        boolean price=false;
        boolean description=false;
        boolean calories=false;
        @Override
        public void startElement (String uri, String localname,
                                  String qName, Attributes attributes)throws SAXException{
            //attributes=label,qname=food
            if(qName.equalsIgnoreCase("food")){
                String label=attributes.getValue("label");
                System.out.println("label: "+label);

            }else if(qName.equalsIgnoreCase("name")){
                Name=true;
            }else if(qName.equalsIgnoreCase("price")) {
                price = true;
            }else if(qName.equalsIgnoreCase("description")) {
                description = true;
            }else if(qName.equalsIgnoreCase("calories")) {
                calories = true;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if(qName.equalsIgnoreCase("food")) {
                System.out.println("end element : "+qName);

            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if(Name){
                System.out.println("name: "+new String(ch,start,length));
                Name=false;
            }else if(price) {
                System.out.println("price: " + new String(ch, start, length));
                price = false;
            }else if(description) {
                System.out.println("description: " + new String(ch, start, length));
                description = false;
            }if(calories) {
                System.out.println("calories: " + new String(ch, start, length));
                calories = false;
            }
        }
    }

