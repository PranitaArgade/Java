//Take N as input ,print its factorial.
//input:5
//output:120

class Factorial{
	public static void main(String[]args){
		int N=5;
		int fact=1;
		for(int i=1; i<=5;i++){
			fact=fact*i;
		}
	         System.out.println(fact);
	}
}
