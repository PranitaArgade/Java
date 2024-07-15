/*
 Write a program in which user should enter two numbers if both the numbers are positive
multiply them and provide to switch case to verify number is even or odd, if user enters any
negative number program should terminate saying “Sorry negative numbers not allowed”
*/

import java.io.*;
class OddEven{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
                if(num1<0 || num2<0){
			System.out.println("Sorry negative numbers not allowed");
		}else{
			int num=num1*num2;
			if(num%2==0){
				num=2;
			}else
				num=1;

		 switch(num){
			 case 1:
				 System.out.println("Number is odd");
				 break;
		         case 2:
				 System.out.println("Number is even");
				 break;
		         }
		 }
	}
}

		         
	
