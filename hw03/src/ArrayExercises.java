public class ArrayExercises {
    /** Returns the second to last item in the given array.
     *  Assumes the array has at least 2 elements. */
    public static String secondToLastItem(String[] items) {
        int n = items.length - 2;
        return items[n];
    }    

    /** Returns the difference between the minimum and maximum item in the given array */
    public static int minMaxDifference(int[] items) {
        int max = items[0]; {
            for (int i = 0; i < items.length; i++) {
                if (items[i] > max) {
                    max = items[i];
                }
            }
        }
        int min = items[0]; {
            for (int i = 0; i < items.length; i++) {
                if (items[i] < min) {
                    min = items[i];
                }
            }
        }
        int diff = max - min;
        return diff;
    }
}
