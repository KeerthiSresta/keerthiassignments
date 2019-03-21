/*
 * 9 Find the sum and product of 10 input numbers
 */
package assignment1;
import java.util.Scanner;
public class SumProd10 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int index,Sum=0,Product=1;//initializing the sum and product
		System.out.println("Enter the elements of array");
		//invoking 10 input numbers
		int arr[]=new int[10];
		//iterating the for loop from index in an array
		for(index=0;index<10;index++)
		{
			arr[index]=kb.nextInt();
		}
		for(index=0;index<10;index++)
		{
			//performs the addition and multiplication operations with the array elements
			Sum=Sum+arr[index];
			Product=Product*arr[index];
		}
		//prints the sum and product of input numbers
		System.out.println("Sum of 10 input numbers: "+ Sum);
		System.out.println("Product of 10 input numbers: "+ Product);	

	}

}
