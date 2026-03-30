import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter number 2: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter number 3: ");
        double num3 = scanner.nextDouble();

        Math math = new Math(num1, num2, num3);

        System.out.println("Addition Result: " + math.add());
        System.out.println("Division Result: " + math.divide());
        System.out.println("Multiplication Result: " + math.multiply());

        scanner.close();
    }
}