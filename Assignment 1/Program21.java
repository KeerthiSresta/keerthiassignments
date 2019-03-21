/*	A survey of 100 students was conducted. For each student the input is Sex (Female or Male) and status 
 * (Continued and or Dropouts). Find and print with appropriate title the percentage of female dropouts an the
 *  percentage of male dropouts.
 */
package assignment1;
import java.util.Scanner;
public class Program21 {
public static void main(String[] args) {
		int maledropouts=0,femaledropouts=0;
		boolean dropout[]=new boolean[100];
		//if boolean is true the student drop out otherwise continued
		String gender[]=new String[100];
		System.out.println("Enter the Status and Gender");
		Scanner kb = new Scanner(System.in);
		for(int input=1;input<100;input++)//Survey  taken from 100 members
		{
			gender[input] =kb.nextLine();
			dropout[input] = kb.nextBoolean();
			if(gender[input].equalsIgnoreCase("male") && dropout[input]==true)
			{
				maledropouts++;
			}
			if(gender[input].equalsIgnoreCase("female") && dropout[input]==true)
			{
				femaledropouts++;
			}
				
		}
		System.out.println("The percentage of female dropouts: "+femaledropouts+"\n The percentage of male dropouts:"+maledropouts);
		

	}

}