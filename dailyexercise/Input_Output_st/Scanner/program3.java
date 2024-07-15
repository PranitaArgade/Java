/* Write a program to take mall name and address
 */

import java.util.Scanner;
class Mall3{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Mall Names:");
		String st1=sc.next();
		String st2=sc.next();
		String st3=sc.next();
		String st4=sc.next();

	       System.out.println("Enter Mall Address");
	       String Add1=sc.next();
               String Add2=sc.next();
	       String Add3=sc.next();
	       String Add4=sc.next();
	       System.out.println("Mall1="+st1+"    "+"Address="+" "+Add1);
              System.out.println("Mall2="+st2+"    "+"Address="+" "+Add2);
	      System.out.println("Mall3="+st3+"    "+"Address="+" "+Add3);
               System.out.println("Mall4="+st4+"    "+"Address="+" "+Add4);
	}
}
