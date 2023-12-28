public class PalPrime {
    private int number;
    private String message;

    public PalPrime(int number, String message) {
        this.number = number;
        this.message = message;
        System.out.println("Number " + number + " is " + message);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 34543, 565, 727, 10099};

        for (int num : numbers) {
            if (isPalPrime(num)) {
                new PalPrime(num, "PalPrime");
            } else if (isPrime(num)) {
                new PalPrime(num, "Prime");
            } else if (isPalindrome(num)) {
                new PalPrime(num, "Palindrome");
            } else {
                System.out.println("Number " + num + " is neither Prime nor Palindrome.");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return originalNum == reverse;
    }

    public static boolean isPalPrime(int num) {
        return isPrime(num) && isPalindrome(num);
    }
}