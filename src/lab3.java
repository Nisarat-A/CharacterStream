import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab3 {
    public static void main(String[] args) {
        try  {PrintWriter out = new PrintWriter("data.txt");
            out.println("Hello World!");
            out.println("Welcome to java");
            out.println("Harry Potter");
            out.println(19);
            out.println(60.5);
            out.println(175.0);
            out.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
