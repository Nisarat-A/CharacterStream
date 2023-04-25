import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab1 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World");
            output.write("welcome to java");
            output.close();
        } catch (IOException e) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            FileReader input = new FileReader("data.txt");
            int ch ;
            while ((ch = input.read()) != -1) {
                System.out.println((char)ch);
            }
               input.close();


        } catch (FileNotFoundException e) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
