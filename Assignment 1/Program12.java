/*Input ‘N’ values of X, one at a time, find and print the number of positive values; the number of zero values
*and the number of negative values.
*/
package assignment1;

import java.util.Scanner;
public class Program12{
public static void main(String[] args) {
		int Value,number,positiveCount=0,zeroesCount=0,negativeCount=0;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of values to be given");
		number = kb.nextInt();
		System.out.println("Enter the values");
		int ar[]=new int[number];
		//loop checks whether the values given in the array are
		//Positive , negative or zero
		for(Value=0;Value<number;Value++)
		{
			ar[Value]=kb.nextInt();
			if(ar[Value]>0)//check the values greater than zero or not
				positiveCount++;//Counts and increments if there is an increase number of positive values 
			else
				if(ar[Value]<0)//checks the value less than zero or not
				{
					negativeCount++;//Counts and increments if there is an increase number of negative values
		        }
				else
					zeroesCount++;//Counts and increments if there is an increase number of zeroes
		}
		//prints the output distinguished according to the given values
		System.out.println("Number of positive numbers:" + positiveCount);
		System.out.println("Number of negitive numbers" + negativeCount);
		System.out.println("Number of zero numbers" + zeroesCount);
	}

}