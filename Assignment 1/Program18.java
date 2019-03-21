/*
 * 18	Accept 100 positive numbers, one at a time and find the smallest and the greatest of the 100 given numbers
 *  and print them together with the range of the 100 numbers. (range = (the greatest) – (the smallest))
*/

package assignment1;
import java.util.Scanner;
public class Program18 {

	public static void main(String[] args) {
    int array[] = new int[100] ;//an array for storing 100 numbers 
    int smallest = 99999;
	int greatest = 0;//assuming the geatest number as 0
	Scanner s = new Scanner(System.in);
    System.out.println("Enter 100 numbers to find the range of greatest and smallest");
    //iterate for loop among the give size of the array from index
	for(int i=0;i<5;i++) 
	{
		array[i]=s.nextInt();
		// checks whether the condition satisfies or not for the numbers in the array 
		if (array[i] > greatest) 
		{
			greatest = array[i];
		}
		if (array[i] < smallest) 
		{
			smallest = array[i];
		}
   
	}
	//prints the greatest and smallest numbers 
    System.out.println(" The greatest " +greatest);
    System.out.println(" The smallest " +smallest);
    System.out.print("range = ");
    //range for the greatest and smallest numbers is calculated 
    System.out.print(+greatest - +smallest);
    }
    	
}

