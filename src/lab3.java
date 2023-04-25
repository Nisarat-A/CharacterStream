import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab3 {
    public static void main(String[] args) {
        try  {PrintWriter out = new PrintWriter("data.txt");

            out.println("Nisarat");
            out.println(18);
            out.println(61);
            out.println(173.5);
            out.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, e);
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
