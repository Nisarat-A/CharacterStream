import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = input.nextLine();
        System.out.println("Your name is: " + s);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);
        System.out.print("Enter your height: ");
        double height = input.nextDouble();
        System.out.println("Your height is: " + height);
    }
}
