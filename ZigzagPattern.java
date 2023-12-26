import java.util.Scanner;

public class ZigzagPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        printZigzagPattern(input);

        scanner.close();
    }

    private static void printZigzagPattern(String input) {
        int n = input.length();
        int diagonalCount = n + (n - 2);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < diagonalCount; j++) {
                if (j == diagonalCount / 2 || (i + j) % diagonalCount == 0) {
                    System.out.print(input.charAt(i) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
