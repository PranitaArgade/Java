//Take a integer number and print the addition of each number.

import java.io.*;
class MethodDemo6{
  static int rem=0;
         static void Sum(int a){
		 int sum=0;
		 int temp=a;
		 
		 while(a!=0){
		   rem =a%10;
		  System.out.print(rem);
		  sum=sum+rem;
	       
	       a=a/10;
	 }
          
	 System.out.println();
	 if(temp==rem){
		 System.out.println("Pallindrome");
	 }else
		 System.out.println("Not pallindrome");
	 System.out.println("Sum of digits="+sum);
         
	 }



	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		int a=Integer.parseInt(br.readLine());
		Sum(a);
	}
	
}

