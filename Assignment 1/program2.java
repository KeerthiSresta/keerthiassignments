/* 2
 * A company manufactures two products A & B. It gives a discount of 5% on A if orders for A exceed Rs. 5000 and 
 * 7% on B if the orders for B exceed Rs. 10000, otherwise no discount. Write a program to input order amount for 
 * A & B and print the discount for each product.
 */
package assignment1;
import java.util.Scanner;
public class program2 {

	public static void main(String[] args) {
		// initializing the values for products A and B on discount
		double prodA_discount=0,prodB_discount=0;
		Scanner kb=new Scanner(System.in);
        System.out.println("Enter the cost of products A and B");
        int productA=kb.nextInt();//scans the cost of product A
        int productB=kb.nextInt();//scans the cost of product B
        //checking whether condition satisfies for the product cost
        //if yes the discount is applied
        if(productA>5000)
        {
        	prodA_discount=0.05*productA;
        }
        //checking whether condition satisfies for the product cost
        //if yes the discount is applied
        if(productB>10000)
        {
        	prodB_discount=0.07*productB;
        }
        //prints the values after the calculation of discount
        System.out.println("Discount for product A: " +prodA_discount);
        System.out.println("Discount for product B: " +prodB_discount);
	}

}
