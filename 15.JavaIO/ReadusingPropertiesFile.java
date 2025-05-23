// * 9.Write a program to read data from properties file

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadusingPropertiesFile {
 public static void main(String[] args) {
        Properties props = new Properties();

        try {
            // Load the properties file
            FileInputStream fis = new FileInputStream("properties.txt");
            props.load(fis);

            // Read properties
            String username = props.getProperty("username");
            String password = props.getProperty("password");
            String url = props.getProperty("url");

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("URL: " + url);

        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        }
    }
    
}