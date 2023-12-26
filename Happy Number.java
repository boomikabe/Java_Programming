Happy Number

import java.util.HashSet;
import java.util.Set;
public class HappyNumber {
    public static void main(String[] args) {
        int n = 19; 
        boolean isHappy = isHappyNumber(n);
        System.out.println("Is " + n + " a happy number? " + isHappy);
    }
    private static boolean isHappyNumber(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getNextSum(n);
        }
        return n == 1;
    }
    private static int getNextSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
