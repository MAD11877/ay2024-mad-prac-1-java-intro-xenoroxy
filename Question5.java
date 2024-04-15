import java.util.HashMap;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /**
         * Prompt the user for number. This input indicates the number of integers the user will be entering next.
         * Print out the mode (highest occurrence) from the set of integers.
         * e.g. > 5 > 2 > 4 > 1 > 3 > 4 4
         * e.g. > 4 > 2 > 2 > 3 > 3 2
         * Hint: Use a loop to get input. Use another 2 loops to find the mode
         */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int mode = 0;
        int maxCount = 0;

        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            if (count > maxCount) {
                mode = num;
                maxCount = count;
            }
        }

        System.out.println(mode);
    }
}
