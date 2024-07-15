//write a program to check whether the number is a palindrome number or not(2332).
//output:2332 is a pallindrome number

class Pallindrome{
	public static void main(String[]args){
		int N=2332;
		int rev=0;
		int temp=N;
		while(N!=0){
			int rem=N%10;
			rev=rev*10+rem;
			N=N/10;
		}
		if(temp==rev){
			System.out.println("number is pallindrom");
		}else
			System.out.println("Number is not pallindrom");
	}
}

