//Write a program to calculate the factorial of the given number

class Pr12{
	public static void main(String[]args){
	    int N=6;
		int fact=1;
		for(int i=1;i<=N;i++){
			fact=fact*i;
		System.out.println(fact);
		}
		System.out.println("Factorial of 6 is "+ fact);
	}
}

