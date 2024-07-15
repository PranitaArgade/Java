// Write a program to take user name and age.

import java.util.Scanner;

class Scanner1{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name:");
		String name= sc.next();
		System.out.println("Enter your Age:");
		int age= sc.nextInt();
		System.out.println("Name="+name);
		System.out.println("Age="+age);

	}
}

