/* 10b
 * An organization has collected data for 200 sales orders during last one day. The record includes data items of :
 * CUST NO, PROD NO, QTY and RATE. Accept the records one by one to compute sales value and then 
 * print all details in one line per record. Also print total sales value at the end.
 */
package assignment1;

import java.util.Scanner;
import java.util.ArrayList;

public class Program10b{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		int sales;
		float total_sales=0;
		int cust_no, prod_no,qty, rate;
		ArrayList <Program10a> al=new ArrayList <Program10a>();// creating arraylist
		System.out.println("Enter customer number ,product number, quantity, rate, sales");
		//do-while loop execution
		do
		{
			 cust_no=kb.nextInt();
		     if(cust_no==0)
			 {
			      break;//terminates the loop if given 0 as input
			        
			 }
			 else {
				 prod_no=kb.nextInt();
			     qty=kb.nextInt();
				 rate=kb.nextInt();
				 //adding new object in arraylist
				 al.add(new Program10a(cust_no,prod_no,qty,rate));
			 }
		}while(cust_no!=0);
		//giving input of data items
	 System.out.println("CUST NO"+"  "+" PROD NO"+"   "+ " QTY"+"      "+"RATE"+"        "+"SALES");
	 //for loop using collections
    for(Program10a s : al)
    {
    	sales=s.qty*s.rate;
    	//addition operation between sales
    	total_sales=total_sales+sales;
    	System.out.println(s.cust_no+"       "+s.prod_no+"      "+s.qty+"        "+s.rate+"          "+sales);
    	
    }
    //invoking arraylist
    System.out.println();
    // prints the total sales of the organisation 
    System.out.println("Total sales of the Oranization is    :"+total_sales);
     
		}

}