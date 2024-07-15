/*
 - Write a program to print the sum of all even numbers and multiplication of odd numbers Between 1 to 10.
 - output:Sum of even numbers between 1 to 10 =30
          Multiplication of Odd numbers between 1 to 10=945
*/

class Solution7{
	public static void main(String[]args){
		int i=1;
		int N=10;
		int Sum=0;
		int Mult=1;
		while(i<=N){
			if(i%2==0){
				Sum=Sum+i;
			}
			else{
				Mult=Mult*i;
			}
			i++;
		}
		System.out.println("Sum of even numbers between 1 to 10 ="+ Sum);
		System.out.println("Multiplication of Odd numbers between 1 to 10 ="+ Mult);
	}
}

