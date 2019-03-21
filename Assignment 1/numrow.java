/* 3
 * 	Print numbers 11 to 100 with 10 numbers in a row.
 */


package assignment1;
import java.util.Scanner;
public class numrow 
{
    public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		int index,count=0;//initializes the count with zero
		//for-loop iteration starting from index to the end of the loop
		for(index=11;index<=100;index++)
		{
			System.out.print(index+" ");
			count++;
			//this condition checks till the 10 numbers are printed in a single row
			//if yes then the numbers shifts to the next new line
			if(count==10)
			{
				//prints the numbers in a row
				System.out.println();
				count=0;
			}
		}
	}

}
