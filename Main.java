import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    // Problem 1
    System.out.println("Enter in a number");
    double target = 12.345;
    double user_input = scan.nextDouble();

    if (user_input == target)
    {
      System.out.println("YES!");
    }

  // Problem 2
  System.out.println("Please enter an integer");
  int targInt = 48;
  int Num = scan.nextInt();
  if(Num == targInt)
  {
    System.out.println("YES!");
  }
    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
