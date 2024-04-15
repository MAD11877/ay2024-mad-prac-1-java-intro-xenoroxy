import java.util.Scanner;

public class Question5 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numbers = new int[num];
      
        for (int i = 0; i < num;) {
            System.out.println("Enter integer " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        int mode = 0;
        int maxCount = 0;

        // Find the mode (integer with the highest occurrence)
        for (int i = 0; i < num;) {
            int count = 0;
            for (int j = 0; j < num; j++) {
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
