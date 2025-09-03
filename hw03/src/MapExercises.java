import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            int num = c - 'a' + 1;
            map.put(c, num);
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.size(); i++) {
            int newNumber = nums.get(i);
            int squared = newNumber * newNumber;
            map.put(newNumber, squared);

        }

        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            int newNum = 0;
            for (int j = 0; j < words.size(); j++) {
                String newChar = words.get(i);
                String otherChar = words.get(j);
                if (newChar == otherChar) {
                    newNum += 1;
                }
                map.put(newChar, newNum);
            }
        }
        return map;
    }
}
