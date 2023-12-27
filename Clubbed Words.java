Clubbed Words

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ClubbedWords {
    public static List<String> findClubbedWords(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }
        for (String word : words) {
            if (isClubbedWord(word, wordSet)) {
                result.add(word);
            }
        }

        return result;
    }
    private static boolean isClubbedWord(String word, Set<String> wordSet) {
        if (wordSet.contains(word)) {
            return false; // A word cannot be formed by itself
        }
        int n = word.length();
        for (int i = 1; i < n; i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);

            if (wordSet.contains(prefix) && (wordSet.contains(suffix) || isClubbedWord(suffix, wordSet))) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String[] words = {"mat", "mate", "matbellmates", "bell", "bellmatesbell", "butterribbon", "butter", "ribbon"};
        List<String> clubbedWords = findClubbedWords(words);
        System.out.println(clubbedWords);
    }
}