import javax.security.sasl.SaslException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import java.io.File;

public class XML_Validation_check {
    private String XML_file;
    private String XSD_schema;

    public void XML_validator() throws SaslException
    {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(XSD_schema));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(XML_file)));
            System.out.println("XML validation work correct");
        } catch (Exception e) {
            System.out.println("Ahtung ALLARM!!! Code:  " + e.getMessage());
        }
    }

    public XML_Validation_check() {
        this.XML_file = XML_file;
        this.XSD_schema = XSD_schema;
    }

    public String getXML_file() { return XML_file; }
    public void setXML_file(String XML_file) { this.XML_file = XML_file; }

    public String getXSD_schema() { return XSD_schema; }
    public void setXSD_schema(String XSD_schema) { this.XSD_schema = XSD_schema; }
}
