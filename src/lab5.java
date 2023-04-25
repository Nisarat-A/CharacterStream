import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab5 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader in = new BufferedReader(file);
            String name = in.readLine();
            System.out.println(name);
            int age = input.nextInt();
            System.out.println(age);
//            Scanner in = new Scanner(file);
//            String nickname = in.nextLine();
//            System.out.println(nickname);
//            int age = in.nextInt();
//            System.out.println(age);
//            double weight = in.nextDouble();
//            System.out.println(weight);
//            double height = in.nextDouble();
//            System.out.println(height);

        } catch (FileNotFoundException e) {
            Logger.getLogger(lab4.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
