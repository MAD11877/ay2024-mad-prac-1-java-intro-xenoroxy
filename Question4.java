import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    for (int j = i; j > 0; j--) {
      for (int k = 0; k < j; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
