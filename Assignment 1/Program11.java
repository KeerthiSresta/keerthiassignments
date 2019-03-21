/*	Given names and hours worked in a month by 10 employees. Each employee is paid at an hourly rate of Rs. 4.50.
*If the Gross Salary is greater than Rs. 720/- an employee gets an additional incentive of 5% of Gross Salary. 
*iGenerate a report to print all employee details (Name, Hours Worked, Gross Salary , Incentive).
*At the end of report print total incentive paid, total gross salary and how many employees getting incentive.
*/
package assignment1;
import java.util.Scanner;
public class Program11 {
       public static void main(String args[])
			{
				int count=0;
				float totalGrossSalary=0;
				float totalIncentive=0;
				Scanner kb=new Scanner(System.in);
				System.out.println("Enter the details of all the employees");
				//Storing the details of the employees
				String[] EmployeeName=new String[10];//an array for storing the name of the employee
				int[] hoursworked=new int[10];//an integer array for storing the hours worked by an employee
				float[] grossSalary=new float[10];//An array for storing the gross salary of an employee
				float[] Incentive=new float[10];// An array for storing the incentive of an employee
				for(int inputDetails=0;inputDetails<10;inputDetails++)
				{
					EmployeeName[inputDetails]=kb.next();//Scans the employee name
					hoursworked[inputDetails]=kb.nextInt();//Scans the number of hours worked by an employee 
					grossSalary[inputDetails]=(float) (hoursworked[inputDetails]*4.50);// calculates the groos Salary
					totalGrossSalary=totalGrossSalary+grossSalary[inputDetails];
					//checking whether the condition satisfies or not
					if(grossSalary[inputDetails]>=720)
					{
						Incentive[inputDetails]=(float) (grossSalary[inputDetails]*0.05);
					}
					else
					{
						Incentive[inputDetails]=0;
					}
					if(Incentive[inputDetails]>0)
					{
						count++;//count increments if the employees with incentives are more
					}
					totalIncentive=totalIncentive+Incentive[inputDetails];
				}
				for(int inputDetails=0;inputDetails<10;inputDetails++)
				{
					System.out.println(EmployeeName[inputDetails]+" "+hoursworked[inputDetails]+" "+grossSalary[inputDetails]+" "+Incentive[inputDetails]);
				}
				System.out.println("Total salary: "+totalGrossSalary);
				System.out.println("Total incentive paid: "+totalIncentive);
				System.out.println("Number of employees getting incentive:"+count);
			}

	}

