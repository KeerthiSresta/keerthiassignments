/*
 * 17 Find the largest of N positive numbers.
 */
package assignment1;
import java.util.Scanner;
public class LargestOfN 
{
    public static void main(String[] args) 
    {
        int Largest;
        Scanner kb = new Scanner(System.in);
        //size of the array required
        System.out.print("Enter number of elements");
        int array = kb.nextInt();
        //initializing the array of size number1
        int arr[] = new int[array];
        // entering the required elements
        System.out.println("Enter elements of array:");
        for(int numbers = 0; numbers < array; numbers++)
        {
            arr[numbers] = kb.nextInt();
        }
        // Initialize largest element
        Largest = arr[0];
        // Traverse array elements from second and 
        // compare every element with current max
        for(int number2 = 0; number2 < array; number2++)
        {
        	//checks if the condition satisfies or not
            if(Largest < arr[number2])
            {
                Largest = arr[number2];
            }
        }
        System.out.println("Largest of N = "+Largest);
    }
}
