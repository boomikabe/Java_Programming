import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        compressString(input);

        scanner.close();
    }

    private static void compressString(String input) {
        StringBuilder compressedString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressedString.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        compressedString.append(input.charAt(input.length() - 1)).append(count);

        System.out.println("Input: " + input);
        System.out.println("Output: " + compressedString);
    }
}
