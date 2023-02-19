package practise;
import java.util.*;

public class Loops {
	public static void main (String args[])
	{
		int i,a=0,sum=0;
		
		{
			System.out.println("Enter the sum of 5 numbers: ");
		}
		for(i=0;i<5;i++)
		{
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			sum +=a;
		}
		System.out.println("The sum of 5 no is "+sum);
		System.out.println("Thank you");

		}
	}



