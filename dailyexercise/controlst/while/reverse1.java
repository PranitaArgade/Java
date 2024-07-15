//Write a program to reverse the given number
//input:123
//output:321

class Reverse1{
	public static void main(String[]args){
		int N=123;
		int rev=0;
		while(N!=0){
			int rem=N%10;
			rev=rev*10+rem;
			N=N/10;
		}
		System.out.println(rev);
	}
}
