/*
 * Given : Monthly Basic Salary.
 *D.A. Calculations :
 *On first 1000 Rs. of Basic, 60% of Basic.
 *On next 1000 Rs. of Basic, 50% of Basic.
 *On the remaining Basic, 40% of Basic.
 *Subject to minimum 300 Rs. and maximum 1500 Rs. D.A.
 *Profession Tax Calculations:
 *Upto Rs. 800 of Gross Income : NilAbove 800 but upto 1200 : 15
 *Above 1200 : 20
 *Income Tax Calculation based on yearly income are as follows:
 *Standard deduction is 25 % of annual income subject to minimum Rs. 10,000/- After  deduction, 
 *yearly income tax is calculated as follows :
 *Taxable Income           Income Tax
 *
 *Upto Rs. 18,000           Nil
 *18,000 to 25,000          25% of income exceeding Rs. 18,000
 *25,000 to 50,000          1,750 + 30% of income over Rs. 25,000
 *50,000 to 1,00,000       9,250 + 40% of income over Rs. 50,000
 *above Rs. 1,00,000       29,250 + 50% of income over Rs. 1,00,000 

 *Gross income is calculated as Basic + D.A. Yearly income tax and profession tax are to be deducted from the 
 *Gross Salary to arrive at Net Payable Salary.
*/
package assignment1;
import java.util.Scanner;
public class Program23 {

	public static void main(String[] args) {
		//Initialization
		double basic,gross;
		double gross_income,income_tax=0;
		double personal_tax,da=0;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the basic salary");
		basic = kb.nextDouble();
		if(basic<1000)
		{
			da = basic*0.6;
		}
		else
		{
			da = da+1000*0.6;
			if(basic<2000)
				da+=1000*0.5;
			else
			{
				da+=1000*0.5;
				da+= basic-2000*0.4; 
			}
		}
		gross = da+basic;
		if(gross<300)
			gross=300;
		else
			if(gross>1500)
			{
				gross=1500;
			}
		//Calculate personal tax 
		if(gross<800)
		{
			personal_tax = 0;
		}
		if(gross>=800 && gross<1200)
		{
			personal_tax = 15;
		}
		else
			personal_tax = 20;
		//gross income calculation
		 gross_income = gross*12;
		// calculation of income tax
		// checks whether the conditions satisfied or not
		if(gross_income<1800)
		{
			income_tax = 0;
		}
		if(gross_income>=18000 && gross<25000)
		{
			income_tax = 0.25*gross_income;
		}
		if(gross_income>=25000 && gross<50000)
		{
			income_tax = 1750+0.30*gross_income;
		}
		if(gross_income>=5000 && gross<100000)
		{
			income_tax = 9250+0.40*gross_income;
		}
		if(gross_income>100000)
		{
			income_tax = 29250+0.50*gross_income;
		}
		
		//calculation of net payable salary
		double net_salary = (basic+da)*12 -income_tax-personal_tax;
		System.out.println("Net payble salary is per year: " +net_salary);

	}

}
