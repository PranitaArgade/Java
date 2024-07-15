/*
 -write a program to check whether the number is a pallindrome number or not.*/

class Pr21{
	public static void main(String[]args){
		int N=121;
		int rev=0;
		int temp=N;
		while(N!=0){
			int rem=N%10;
			rev=rev*10+rem;
			N=N/10;
		}
		if(rev==temp){
			System.out.println(temp+" Pallindrome no");
		}else{
			System.out.println(temp+" Not a pallindrome no");
		}
	}
	}
