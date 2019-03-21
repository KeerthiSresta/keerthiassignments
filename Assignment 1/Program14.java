/* Accept the marks of n students and find the number and percentage of students getting first class,
 *   second-class, pass class and failing.
 */

package assignment1;
import java.util.Scanner;
import java.io.*;
public class Program14 {
public static void main(String args[])
{
	int number;
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter number of students");
	number=kb.nextInt();
	//an integer array for storing the marks for n number of students
	int marks[]=new int[number]; 
	float percent[]=new float[4];
	int first_class=0;
	int second_class=0;
	int pass_class=0;
	int fail_class=0;
	//to give input of n number of students 
	//marks ranging from 0 to 100 
	System.out.println("Enter marks obtaind by student(0-100)");
	for(int i=0;i<number;i++)
	{
		marks[i]=kb.nextInt();
		//checking whether the condition satisfies for any class in loop   
		if(marks[i]>=80 && marks[i]<=100)
		{
			//increments the count if there is increase in number of first class students
			first_class++;
		}
		else if(marks[i]>=60 && marks[i]<80)
		{
			//increments the count if there is increase in number of second class students
			second_class++;
		}
		else if(marks[i]>=40 && marks[i]<80)
		{
			//increments the count if there is increase in number of pass class students
			pass_class++;
		}
		else if(marks[i]>0 && marks[i]<40)
		{
			//increments the count if there is increase in number of fail class students
			fail_class++;
		}
		else
		{
			//this prints if the value given is invalid 
			System.out.println("Invalid input");
			break;
		}
	}
	percent[0]=(float)((first_class*100)/number);
	percent[1]=(float)((second_class*100)/number);
	percent[2]=(float)((pass_class*100)/number);
	percent[3]=(float)((fail_class*100)/number);
	//prints the class and number of students 
	System.out.printf("First class students count :%d",first_class);
	System.out.printf("  Percentage:%.2f",percent[0]);
	System.out.print("%");
	System.out.println();
	System.out.printf("second class students count:%d",second_class);
	System.out.printf("  Percentage:%.2f",percent[1]);
	System.out.print("%");
	System.out.println();
	System.out.printf("pass class students count:%d",pass_class);
	System.out.printf("  Percentage:%.2f",percent[2]);
	System.out.print("%");
	System.out.println();
	System.out.printf("fail students count        :%d",fail_class);
	System.out.printf("  Percentage:%.2f",percent[3]);
	System.out.print("%");
	System.out.println();
}
}