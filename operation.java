import java.util.Scanner;
import java.io.*;
public class operation
{
  public static void main (String[]args)
  {
    
    System.out.println("Enter the value of x:");
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt();
    System.out.println("Enter the value of y:");
    int y = sc.nextInt();

      System.out.println ("The addition of " + x + " and " + y + " is : " +
			  (Add (x, y)));
      System.out.println ("The Subtraction of " + x + " and " + y + " is : " +
			  (Subtract (x, y)));
      System.out.println ("The Multiplication of " + x + " and " + y +
			  " is : " + (Multiply (x, y)));
      System.out.println ("The Divison of " + x + " and " + y + " is : " +
			  (Divison (x, y)));
      System.out.println ("The Power of " + x + " and " + y + " is : " +
			  (Power (x, y)));
      System.out.println ("The Modulus of " + x + " and " + y + " is : " +
			  (Modulus (x, y)));


  }
  static int Add (int x, int y)
  {
    int sum;
    sum = x + y;
    return sum;
  }
  static int Subtract (int x, int y)
  {
    int sub = 0;
    sub = x - y;
    return sub;
  }
  static int Multiply (int x, int y)
  {
    int product;
    product = x * y;
    return product;
  }
  static int Divison (int x, int y)
  {
    int quotient;
    quotient = x / y;
    return quotient;
  }
  static int Modulus (int x, int y)
  {
    int rem;
    rem = x % y;
    return rem;
  }
  static double Power (int x, int y)
  {
    double power;
    power = Math.pow (x, y);
    return power;
  }
}
