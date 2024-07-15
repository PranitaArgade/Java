/*
 - Write a program to print the square of even digits of the given number.
 = input:942111423
 - output:4 16 4 16
 */

class SquareEvenDigit6{
	public static void main(String[]args){
		int N=942111423;
	        while(N!=0){
			int rem=N%10;
			if(rem%2==0){
			  int Square=rem*rem;
			  System.out.print(Square+ " ");
			}
			N=N/10;
		}
		System.out.println();
		
	}
}
