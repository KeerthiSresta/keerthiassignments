/* 10a
 * An organization has collected data for 200 sales orders during last one day. The record includes data items of :
 * CUST NO, PROD NO, QTY and RATE. Accept the records one by one to compute sales value and then 
 * print all details in one line per record. Also print total sales value at the end.
 */

package assignment1;

public class Program10a {
	int cust_no;
	int prod_no;
	int qty;
	int rate;
	//creating the constructors with the above fields
	public Program10a(int cust_no, int prod_no, int qty, int rate) {
		//this is used for distinguishing the parameters
		this.cust_no = cust_no; 
		this.prod_no = prod_no;
		this.qty = qty;
		this.rate = rate;
	}
}
