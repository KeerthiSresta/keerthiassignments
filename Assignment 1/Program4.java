/*4
 * 	A company pays its employees on a “piece-work” basis. The company produces three products.
 *   The “piece-rate” for the items is Rs. 1.20, Rs. 1.80 and Rs. 2.25 respectively. Read from the input 
 *   unit employee number, units of products 1,2 and 3 respectively. Calculate the wages and 
 *  print employee number and gross wages of each employee. The employee number Zero indicates the end of data.
 */

package assignment1;
import java.util.Scanner;
public class Program4 {
public static void main(String args[])
{
	int Employee[][]=new int[100][4];// 2 dimensional array to invoke the data
	float wages[]=new float[100];
	int ENumber=0;
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter the data of employee number and piecework for three products");
	while(true)
	{
		Employee[ENumber][0]=kb.nextInt();
		//if loop to check whether the condition satisfies or not
		if(Employee[ENumber][0]==0)
		{
			break;//breaks invoking the employee data id employee number is given 0
		}
		else
		{
			Employee[ENumber][1]=kb.nextInt();
			Employee[ENumber][2]=kb.nextInt();
			Employee[ENumber][3]=kb.nextInt();
			//calculation of wages of an employee for three products
			wages[ENumber]=(((float)(Employee[ENumber][1]*1.20))+((float)(Employee[ENumber][2]*1.80))+((float)(Employee[ENumber][3]*2.25)));
			ENumber++;//increments the employee number 
		}//end of else
	}
	System.out.println("Employee number     gross wage");
	//iterating the for loop to print the output to the number of employee numbers
	for(int j=0;j<ENumber;j++)
	{
		// prints the employee number and gross wage of employees
		System.out.format("%5d%28f",Employee[j][0],wages[j]);
		System.out.println();
	}
   }
}

