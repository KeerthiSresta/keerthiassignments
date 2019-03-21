/*To calculate the commission payable to the salesman based on the total monthly sales.
*For the first Rs. 10,000/- of sales, commission is NIL. For the next Rs. 20,000/- at 2.5%.
*For the next Rs. 20,000/- at 5%. For the next Rs. 30,000/- at 7.5%. For the excess at 10%.
*/ 
package assignment1;
import java.util.Scanner;
public class Program22 {
public static void main(String args[])
	{
		int SalesAmount,temp;
		double commissionPayable=0;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the amount of sales");
		SalesAmount=kb.nextInt();
		//Checking the condition satisfies or not
		//if yes it prints the total commissionPayable 
		//if no then the condition is again checked
		if(SalesAmount>=10000)
		{
		temp=SalesAmount-10000;
		if(temp>=20000)
		{
			commissionPayable=commissionPayable+(float)(20000*0.025);
		    temp=temp-20000;
		}
		else if(temp>=20000)
		{
			commissionPayable=commissionPayable+(float)(20000*0.05);
			temp=temp-20000;
		}
		else if(temp>=20000)
		{
			commissionPayable=commissionPayable+(float)(20000*0.05);
			temp=temp-20000;
		}
		else if(temp>=30000)
		{
			commissionPayable=commissionPayable+(float)(30000*0.075);
			temp=temp-30000;
		}
		else
		{
			commissionPayable=commissionPayable+(float)(temp*0.1);
		}
		}
		else
		{
			commissionPayable=commissionPayable+(float)(SalesAmount*0.1);
		}//end of else
		//Prints the Total commission payable to the salesman based on total monthly sales are
		System.out.println("Total commission payable to the salesman based on total monthly sales are "+ commissionPayable);
	}
}

