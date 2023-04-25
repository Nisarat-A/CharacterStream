import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab5 {
    public static void main(String[] args) {
   InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(in); //สร้าง obj class

        try{
            System.out.print("Enter your name: ");
        String s = input.readLine();
            System.out.println(s);
            System.out.print("Enter your age: ");
            String age = input.readLine();
            System.out.println(age);
            //buffer อ่านได้แค่ String
        } catch (IOException e) {
            Logger.getLogger(lab5.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
