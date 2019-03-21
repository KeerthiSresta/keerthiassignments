/* 
 * 6	Write a program to calculate and print the sum S and product P of 1,2,3,4……n
 */

package assignment1;
import java.util.Scanner;
public class SumProdN {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int Sum=0,Prod=1;//initializing the values of sum and product
		System.out.println("Enter numbers for sum and product");
		int numbers=kb.nextInt();//scans the numbers invoked
		//iteration of forloop from index
		for(int index=1;index<=numbers;index++)
		{
			//performs addition and multiplication operations 
			Sum=Sum+index;
			Prod=Prod*index;
		}
		//prints the sum and product of given numbers
		System.out.println("Sum " +Sum);
		System.out.println("Prod " +Prod);
		

	}

}
