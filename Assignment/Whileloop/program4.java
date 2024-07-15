/* 
 -Write a program to count the Odd digits of the given number.
 -input:942111423
 -output:count of Odd digits= 5
 */

class OddCount4{
	public static void main(String[]args){
		int digit=942111423;
		int count=0;
		while(digit!=0){
			int rem=digit%10;
			if(rem%2==1){
				count++;
			}
			digit=digit/10;
		}
		System.out.println("Count of Odd digits ="+ count);
	}
}


