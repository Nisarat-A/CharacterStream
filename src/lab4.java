import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab4 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            Scanner in = new Scanner(file);
            String nickname = in.nextLine();
            System.out.println(nickname);
            int age = in.nextInt();
            System.out.println(age);
            System.out.println(in.nextLine());
            System.out.println(in.nextInt());
            System.out.println(in.nextDouble());
            System.out.println(in.nextDouble());
        } catch (FileNotFoundException e) {
            Logger.getLogger(lab4.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
