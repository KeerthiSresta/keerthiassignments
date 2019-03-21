/*Accept the marks of 100 students and find the number of students who have passed and the number of
 *  those who have failed.
 */

package assignment1;
import java.util.Scanner;
public class Program13
{
    public static void main(String[] args)
    {
		int studentsmarks,pass=0,fail=0;
		Scanner kb= new Scanner(System.in);
		//marks of 100 students is taken
		System.out.println("Enter the marks of 100 students");
		int ar[]=new int[100];
		{
		for(studentsmarks=0;studentsmarks<100;studentsmarks++)
		{
			ar[studentsmarks]=kb.nextInt();
			//checking whether the students grade is greater than 50
			if(ar[studentsmarks]>50)
				//increments the count of students if there an increase 
				//in the count of number of students who passed
				pass++;  
			else
				//increments the count of students if there an increase 
				//in the count of number of students who failed
				fail++;
		}
		//prints the count of number of students who passed and who failed
		System.out.println("number of students passed" +  pass);
		System.out.println("number of students failed" +  fail);
		}
    }
}