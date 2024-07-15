//Take an integer value from user and perform addition,substraction,multiplication,division operation.

import java.util.*;
class MethodDemo4{

        static void add(int x,int y){
		int ans=x+y;
		System.out.println("Add="+ans);
	}
	static void sub(int x,int y){
		int ans=x-y;
		System.out.println(ans);
	}
	static void mult(int x,int y){
		int ans= x*y;
		System.out.println(ans);
	}
	static void div(int x,int y){
		int ans=x/y;
		System.out.println(ans);
        }


	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int x= sc.nextInt();
		int y=sc.nextInt();
		add(x,y);
		sub(x,y);
		mult(x,y);
		div(x,y);
	}
}
