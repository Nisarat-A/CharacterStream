import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class characterstream3 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World!");
            output.write("welcome to java");
            output.close();
        } catch (IOException e) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, e);
        }
        try{
            FileReader file = new FileReader("data.txt");
            BufferedReader in = new BufferedReader(file);
            String line;
            while ((line =in.readLine()) != null){
                System.out.println(line); }
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
