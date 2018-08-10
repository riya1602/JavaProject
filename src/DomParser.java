import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * Created by expert on 8/8/18.
 */
public class DomParser {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        try {
            File inputFile = new File("input.txt");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList =doc.getElementsByTagName("food");
            System.out.println("---------");
            for(int temp=0;temp<nList.getLength();temp++){
                Node nNode=nList.item(temp);
                System.out.println("\ncurrent element: "+nNode.getNodeName());
                if(nNode.getNodeType()==Node.ELEMENT_NODE){
                    Element eElement =(Element) nNode;
                    System.out.println("name: "+
                            eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("price: "+
                            eElement.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("description: "+
                            eElement.getElementsByTagName("description").item(0).getTextContent());
                } }

        } catch (Exception e) {  }
    }
}
