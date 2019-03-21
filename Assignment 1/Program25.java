/*A bank has the following policy on deposits. 
*If the amount of the deposit is Rs. 5000 or above and for 3 years and above interest is 12%.
*On deposit of Rs. 5000 and above for less than 3 years interest rate is 10%. On deposits below Rs. 5000 
*regardless of the period interest rate is 9%. Write a program to input A/C number, Name, Amount of deposit 
*and years.Print all account details along with maturity amount for 100 A/C holders.
*/
package assignment1;
import java.util.Scanner;
public class Program25 {
	public static void main(String[] args) {
		// An array for storing the details of the account holders in bank
		int accountNumbers[]=new int[100]; //an array for storing the account number details
		int numberOfYears[]=new int[100]; //An array for storing the details of the number of years
		String names[]=new String[100]; // An array for storing the names of the account holders 
		double depositAmount[]=new double[100]; // An array for storing the deposit amount
		double totalAmount[]=new double[100]; // An array for storing the total amount
		int number;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter details");
		for(number=0;number<100;number++)
		{
			accountNumbers[number]=kb.nextInt();
			numberOfYears[number]=kb.nextInt();
			names[number]=kb.next();
			depositAmount[number]=kb.nextDouble(); 
			// checking whether the condition is correct or not
			if(depositAmount[number]>5000 && numberOfYears[number]>3)
				totalAmount[number]=totalAmount[number]+totalAmount[number]*0.12;
			if(depositAmount[number]>5000 && numberOfYears[number]<=3)
				totalAmount[number]=totalAmount[number]+totalAmount[number]*0.10;
			if(depositAmount[number]<=5000 && numberOfYears[number]<3)
				totalAmount[number]=totalAmount[number]+totalAmount[number]*0.09;	
		}
		//printing the output in the given format
		System.out.println("Account Number      Name     Deposit amount     total amount    ");
		for(number=0;number<100;number++)
		{
			System.out.println(accountNumbers[number]   +"    "+names[number]   +"    "+depositAmount[number]   +"   "+totalAmount[number]+" ");
		}
		

	}

}