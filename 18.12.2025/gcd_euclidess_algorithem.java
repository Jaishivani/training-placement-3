import java.util.Scanner;
public class Main
{
  //long devision                                    
  //greatest commen devisor between 2 numbers
  //the answer is devisor
  // 12 - 1,2,3,4,6,12
  // 18 - 1,2,3,6,9,18
	public static void main(String[] args) {
	   int a,b,temp;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the a : ");
	       a = sc.nextInt();
	   System.out.print("Enter the b : ");
	       b = sc.nextInt();
	       while(a!=0){  //while devisior is 0 , it will run
	           temp = a;  //after the formula ,the reminder is store in the temp 
	           a = b%a;  //the reminder is stored in the divisior 
	           b = temp; //if the condition is out,befor value want to display soo b = twmp ,the temp is already the reminder;
	       }
	       
	    System.out.println(b);
	}
}
//output 
//Enter the a : 12
//Enter the b : 18
//6
