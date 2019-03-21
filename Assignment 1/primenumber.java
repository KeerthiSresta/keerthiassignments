/* 5	
 * Write a program to check whether given number is prime number
 */

package assignment1;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int temp=0;
		System.out.println("Enter the number to be checked");
		//scans the number
		int number=kb.nextInt();
		//iteration starts from 2 from prime number check as 
		//0 and 1 are not prime numbers. The 2 is the only even prime number 
		//because all the other even numbers can be divided by 2.
		for(int index=2;index<=number-1;index++)
		{
			 if(number%index==0)
			 {
				 temp++;
			 }
		}
		//if loop to check whether the condition satisfies or not
		if(temp==0)
		{
			//prints the number if it is prime
	    	System.out.println(number +" is prime number");

		}
		else
		{
			//prints not a prime number if it is not
		    System.out.println("not a prime number");
		    
		}//end of else
	}
}
