import java.util.ArrayList;
import java.util.List;

public class ListExercises {
    /**
     * Returns the total sum in a list of integers
     */
    public static int sum(List<Integer> L) {
        Integer sum = 0;
        for (Integer number : L) {
            sum += number;
        }
        return sum;
    }

    /**
     * Returns a list containing the even numbers of the given list
     */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < L.size(); i++) {
            if (L.get(i) % 2 == 0) {
                newList.add(L.get(i));
            }
        }
        return newList;

    }

    /**
     * Returns a list containing the common item of the two given lists
     */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < L1.size(); i++) {
            for (int j = 0; j < L2.size(); j++) {
                if (L1.get(i) == L2.get(j)) {
                    newList.add(L1.get(i));
                }
            }
        }
        return newList;
    }

    public static int countOccurrencesOfWord(List<String> words, String w) {
        return 0;
    }

    /**
     * Returns the number of occurrences of the given character in a list of strings.
     */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int n = 0;
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == c) {
                    n += 1;
                }
            }
        }
        return n;
    }
}



