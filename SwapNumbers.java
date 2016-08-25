import java.util.Scanner;
 
public class SwapNumbers
{
   public static void main(String args[])
   {
      int x, y;
      System.out.println("Enter x and y");
      Scanner input = new Scanner(System.in);
 
      x = input.nextInt();
      y = input.nextInt();
 
      System.out.println("Before Swapping\nx = "+x+"\n y = "+y);
 
        x = x + y;
        y = x - y;
        x = x - y;
        
      System.out.println("After Swapping\nx = "+x+"\n y = "+y);
   }
}