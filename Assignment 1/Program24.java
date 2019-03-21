/*Wage Calculations for 10 employees :

Weekly wages are based on hours of work are as follows:
On first 40 hours, Rs. 10 per hour.
On next 20 house, Rs. 15 per hour.
Remaining hours, Rs. 20 per hour.

Based on hours of work, wages are to be calculated as per above schedule. Printing to be done in 5 columns,
hours, part of wages at 10 Rs. per hour, at 15 Rs. per hour,at 20 Rs. per hour and total wages.Appropriate 
headings are to be given to each column and the total of wages in each column are also to be printed.*/

package assignment1;
import java.util.Scanner;
public class Program24 {
public static void main(String args[])
{
	// an array for storing the details of employees
	String Employeename[]=new String[10];// declaration of string array to store the name of the employee
	int temp;
	int hoursOfwork[]=new int[10]; //integer array for storing the hours of work
	int first[]=new int [10];//integer array for storing the details of employees who worked 40 hours  
	int grandfirst=0; 
	int grandsecond=0;
	int second[]=new int[10];//integer array for storing the details of employees who worked for 20 hours
	int third[]=new int[10];// integer array for storing the details of employees who worked for remaining hours
	int grandthird=0;
	Scanner kb=new Scanner(System.in);
	System.out.println("ENTER THE DETAILS OF EMPLOYEES");
	for(int i=0;i<10;i++)
	{
		Employeename[i]=kb.next();
		hoursOfwork[i]=kb.nextInt();
		//checking the given conditions and performing operations based on it
		if(hoursOfwork[i]>=40)
		{
			temp=hoursOfwork[i]-40;
			first[i]=first[i]+(40*10);
			grandfirst=grandfirst+first[i];
			if(temp>=20)
			{
				temp=temp-20;
				second[i]=second[i]+(20*15);
				grandsecond=grandsecond+second[i];
				if(temp>0)
				{
					third[i]=third[i]+(temp*20);
					grandthird=grandthird+third[i];
				}
			}
		}
	}
	//printing the output for the given details of the employee
	System.out.println("name"+" "+"hours"+"first_40"+" "+"next_20"+" "+"Remaining" );
	for(int i=0;i<10;i++)
	{
		System.out.println(Employeename[i]+" "+hoursOfwork[i]+" "+first[i]+" "+second[i]+" "+third[i]);
	}
	//printing the grand total of wages for the first employees who worked for 40 hours
	System.out.println("First column total: "+grandfirst);
	//printing the grand total of wages for employees who worked for next_20 hours
	System.out.println("Second column total: "+grandsecond);
	//printing the grand total of wages for the employees who worked for remaining hours
	System.out.println("Third column total: "+grandthird);
}
}

