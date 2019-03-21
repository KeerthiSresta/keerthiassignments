/*16	Find the smallest of 100 given positive numbers.
*/
package assignment1;
import java.util.Scanner;
public class SmallestOf100 {
public static void main(String[] args) {
		// smallest number in given array of length 100
		int array[] = new int[100];//am array to store the length of 100 number 
		int number,minimum=array[0]; 
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter 100 numbers to check the smallest");
		//loop of 100 takes 100 numbers while checking the smallest 
		for(number=0;number<100;number++)
		{
			array[number]=kb.nextInt();
			//condition to check the least minimum number in the given array of 100 numbers 
			if(array[number]<minimum)
			{
				minimum = array[number];
			}
		}
		// prints the minimum number depending on the above condition
		System.out.println("The smallest of the given array of numbers is " + minimum);

	}

}