/*
 - Write a program to check whether the number is a palindrome number or not.(2332)
 -output: 2332 is a palindrome number
 - Plindrome is when After reverse,the reverse Num is the same as that of the Original Number.
 */

class Palindrome11{
	public static void main(String[]args){
		int Num=2332;
		int rev=0;
		int temp=Num;
		int rem=0;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(Num==rev){
			System.out.println(Num+" is a palindrome number");
		}else{
			System.out.println(Num+ " is not a palindrome number");
		}
	}
}
