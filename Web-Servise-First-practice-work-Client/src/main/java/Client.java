import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import javax.security.sasl.SaslException;
import java.io.File;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Client {
    private static String Server_Adress = "localhost";
    private static int Server_port = 8080;
    private static String Output_File = "received_data.xml";

    public static void main(String[] args) throws SaslException {
        try (Socket socket = new Socket(Server_Adress, Server_port);
             ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());) {

            System.out.println("Server is alive: " + Server_Adress + "He's hearth port: " + Server_port);

            Company company = (Company)objectInputStream.readObject();
            System.out.println("Received object: " + company);

            JAXBContext context = JAXBContext.newInstance(Company.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("jaxb.formatted.output", true);

            File outputFile = new File(Output_File);
            marshaller.marshal(company, outputFile);

            System.out.println("He's give me a XML file. It's work!!!");
        } catch (Exception e) {
            System.out.println("Nooooo!!! Server don't want to work!!! " + e.getMessage());
        }
    }

    public Client() {
    }

    public static String getServer_Adress() {
        return Server_Adress;
    }
    public static void setServer_Adress(String server_Adress) {
        Server_Adress = server_Adress;
    }

    public static int getServer_port() {
        return Server_port;
    }
    public static void setServer_port(int server_port) {
        Server_port = server_port;
    }

    public static String getOutput_File() {
        return Output_File;
    }
    public static void setOutput_File(String output_File) {
        Output_File = output_File;
    }
}
