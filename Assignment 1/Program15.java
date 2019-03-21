/* Suppose the population of countries A & B are 60 and 90 millions respectively and the rate of population
 * growth for A & B are 5.8% and 4.2 respectively per year. Write a program to print the population of A & B
 * each year until the population of A exceeds that of B and also print the number of years for the population
 * of A to exceed the population of B.
 */

package assignment1;
import java.math.*;
public class Program15 {
	public static void main(String args[])
	{
		int count=0;
		long country_a=60000000L;
		long country_b=90000000L;
		double temp1;
		double temp2;
		temp1=(double)(country_a*0.058);
		country_a=country_a+Math.round(temp1);
		System.out.println(country_a);
		while(true)
		{
			temp1=(double)(country_a*0.058);
			temp2=(double)(country_b*0.042);
			country_a=country_a+Math.round(temp1);
			country_b=country_a+Math.round(temp2);
			//checking whether the condition satisfies or not 
			if(country_a<=country_b)
			{
				//count of number of years increases if the population of A exceed population of B
				count++;
			}
			else
			{
				break;
			}
		}
		//printing the values of population 
		//and number of Years taken by country A to exceed Country B
		System.out.println("Country A have population:" + country_a);
		System.out.println("country B have population:" + country_b);
		System.out.println("Number of Years taken by country A to exceed Country B:" + count+1);
	}
}