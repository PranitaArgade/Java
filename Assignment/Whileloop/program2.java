/* 
 -Write a program to calculate the factorial of the given number.
 - input:6
 -output:factorial 6 is 720
 */
class Factorial2{
	public static void main(String[]args){
		int N=6;
		int i=1;
		int fact=1;
		while(i<=N){
			fact=fact*i;
		 i++;
		}
		System.out.println("factorial "+ N+ " is "+fact);
	}
}
