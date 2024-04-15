import java.util.Scanner;

public class Question5 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        int numIntegers = scanner.nextInt();
        int[] numbers = new int[numIntegers];
        for (int i = 0; i < numIntegers; i++) {
            System.out.println("Enter integer " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        int mode = 0;
        int maxCount = 0;

        // Find the mode (integer with the highest occurrence)
        for (int i = 0; i < numIntegers; i++) {
            int count = 0;
            for (int j = 0; j < numIntegers; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                mode = numbers[i];
                maxCount = count;
            }
        }

        // Print the mode
        System.out.println("Mode: " + mode);
    }
}
