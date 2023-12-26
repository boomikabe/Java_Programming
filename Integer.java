a)Integer

import java.util.Scanner;
public class ReadIntegerFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int enteredInteger = scanner.nextInt();
        System.out.println("You entered: " + enteredInteger);
        scanner.close();
    }
}


b)Floating-Point Number
import java.util.Scanner;
public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();
        double average = (num1 + num2) / 2;
        System.out.printf("The average is: %.2f%n", average);
        scanner.close();
    }
}

