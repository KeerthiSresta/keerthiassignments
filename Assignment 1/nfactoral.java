/* 7
 * Calculate Factorial of N = 1*2*3*4…..n. and print the same along with the number.
   The output should be :
   The factorial of the number <no_entered> is <factorial_calcuted>

 */


package assignment1;
import java.util.Scanner;
public class nfactoral {
   public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int factorial,i,result=1;
		System.out.println("Enter number");
		int number=kb.nextInt();
		//loop for iterating the factorial to the next number
		for( factorial=1; factorial<=number; factorial++)
		{
			//inner loop for calculating the factorial of the number
			for(i= factorial;i>=1;i--)
			{
				//performs multiplication operation
				result=result*i;
			}
			//prints the result of the factorial and the number
			System.out.println( factorial+ "!=" +result);
			result=1;
		}

	}

}
