/*
 -Write a program to reverse the given number.
 */
class Pr20{
	public static void main(String[]args){
		int N=123456789;
		int temp=N;
		int rev=0;
		while(N!=0){
			int rem=N%10;
			rev=rev*10+rem;
			N=N/10;
			}
		System.out.println(rev);
	
		
	}
}
