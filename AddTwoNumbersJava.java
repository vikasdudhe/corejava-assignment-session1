import java.util.Scanner;

public class AddTwoNumbersJava {
 
	public static void main(String args[])

        {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter the numbers to be added:");

            int x = input.nextInt();

            int y = input.nextInt();

            System.out.println("The Summation is: "+add(x, y));

            input.close();

        }

    public static int add(int a, int b)
		{
			if(b == 0) return a;
			int sum = a ^ b; //SUM of two integer is A XOR B
			int carry = (a & b) << 1;  //CARRY of two integer is A AND B
			return add(sum, carry);
		}
}