/* 8	
 * Write a program to find the sum 1^2 + 2^3 + 3^4 ….. N^n+1
 */

package assignment1;
import java.util.Scanner;
import java.lang.Math;
public class Program8
{
    public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter number");
    //allows to invoke a value 
     int number=kb.nextInt();
     double number1,power=2,result;
     double sum=0;//initializing sum with zero
     // iteration of for loop till the end of the given number
     for(number1=1;number1<=number;number1++)
     {
    	 //calculating the power 
         result=(Math.pow(number1,power++));
         // prints all the results of the number of iterations
         System.out.println(result);
         sum=sum+result;
    }
   //  prints the total sum of the result
        System.out.println("sum is " +sum);
    }
}