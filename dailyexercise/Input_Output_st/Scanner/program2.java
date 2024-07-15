//Write a program to user Dream company name and Package

import java.util.Scanner;
class Scanner2{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your DreamCompany Name:");
		String name=sc.next();
		System.out.println("Enter your Package:");
		Double Package= sc.nextDouble();
	   System.out.println("Company Name:"+name);
	   System.out.println("Package:"+Package);
	}
}


