/*
 * 19  Accept n Salesman numbers and total weekly sales in Rupees by them. End of data is indicated by a dummy entry 
 * in which salesman number is zero. Find out the salesman number who has the highest and lowest weekly sales and
 * the amount of the highest weekly sales and the lowest weekly sales.
*/
package assignment1;
import java.util.Scanner;
public class Program19 {
public static void main(String[] args) {
		int highest,highestid,lowest,lowestid;
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter salesmen id and sales in rupees");
		System.out.println("Enter 0 to terminate the entry of salesman id");
		int salesmanid=kb.nextInt();//initial salesmen id
		int salesrupees=kb.nextInt();//initial sales  in rupees
		highest = lowest = salesrupees;
		highestid = lowestid = salesmanid;
		//while loop for checking the multiple conditions
		while(true)
		{
			
			salesmanid=kb.nextInt();
			salesrupees = kb.nextInt();
			// if loop for checking whether the condition satisfies or not
			if(salesmanid==0)
			{
				break;//breaks the loop if the salesman id is given 0
			}
			if(salesrupees<lowest)
			{
				lowest = salesrupees;
				lowestid=salesmanid;
			}
			if(salesrupees>highest)
			{
				highest=salesrupees;
				highestid=salesmanid;
			}
		}
		//prints the highest and the salesman id who is having highest
		System.out.println("The highest weakly sales "+highest+" the salesmen id : "+highestid);
		//prints the lowest and the salesman id who is having lowest
		System.out.println("The lowest weakly sales "+lowest+" the salesmen id : "+lowestid);
	}

}