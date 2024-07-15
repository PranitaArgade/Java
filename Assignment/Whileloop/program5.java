/* -Write a program to count the even digits of the given number.
  -input:942111423
  - output:Count of even digits =4
  */

class EvenCount5{
	public static void main(String[]args){
		int digit=942111423;
		int count=0;
		while(digit!=0){
			int rem=digit%10;
			if(rem%2==0){
				count++;
			}
			digit=digit/10;
		}
		System.out.println("Count of even digits =" +count);
	}
}
