import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    System.out.println("Enter your height:");
    Scanner h = new Scanner(System.in);
    double height = h.nextDouble();

    System.out.println("Enter your weight: ");
    Scanner w = new Scanner(System.in);
    double weight = w.nextDouble();

    double bmi = weight / (height * height);
    System.out.println(bmi);
  }
}
