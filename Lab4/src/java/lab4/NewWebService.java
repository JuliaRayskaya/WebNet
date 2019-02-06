package Lab4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "NewWebService")
public class NewWebService {
    @WebMethod(operationName = "findPerson")
    public String findUser(@WebParam(name = "name") String name) throws IOException {
        File file = new File("Users/user/Documents/NetBeansProjects/students.txt");       
          try {
            FileInputStream fi = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fi));
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {   
                String[] wordFields = line.split(",");
                if (wordFields[0].equals(name)) {
                    return name + " found!";
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
return "qqq";}
    @WebMethod(operationName = "registerOnFlight")
    public String registerOnFlight(@WebParam(name = "name") String name) {
        File file = new File("Users/user/Documents/NetBeansProjects/students.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.newLine();
            bw.write (name);
            bw.flush();
            return name + " has registered on flight!";
        } catch (IOException ex) {
            System.out.println("Error on the server #1");
        }        
        return "No entry written. Try again.";
    }
}

