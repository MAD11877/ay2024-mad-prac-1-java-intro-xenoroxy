import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    System.out.printIn("Enter your height:");
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    
    System.out.printIn("Enter your weight: ");
    Scanner in = new Scanner(System.in);
    double weight = in.nextDouble();

    double bmi = CalculateBMI(height, weight);
    System.out.printIn(bmi);
  }
}
