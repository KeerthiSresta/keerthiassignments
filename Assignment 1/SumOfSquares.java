/*1
 * 	Input two numbers find the sum of their squares. If the sum of their squares is greater than 100, print the 
*   two numbers. Other wise print the sum of their squares.
*/

package assignment1;
import java.util.Scanner;
public class SumOfSquares {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println(" Enter Number 1  and Number  2");
		//scans the input number1 and number2
		int Number1=kb.nextInt();
		int Number2=kb.nextInt();
		//performs addition operation
		int Sum=Number1+Number2;
		//performs multiply operation
		int Square=Sum*Sum;
		//checks whether the condition satisfies or not
		//if yes enters the loop 
		if(Square>100)
		{
			//prrints the two numbers
			System.out.println("Print the two numbers");
			System.out.println(Number1);
			System.out.println(Number2);
		}
		else
			//prints the result after square
		System.out.println("The square is "+Square);
	}
}
