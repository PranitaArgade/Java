/*
 - Write a program to count the digits of the given number.
 -input:942111423
 -output:count of digits=9
 */
class Count3{
	public static void main(String[]args){
		int digits=942111423;
		int count=0;
	        while(digits!=0){
			count++;
			digits=digits/10;
		}
		System.out.println("count of digits= "+count);
	}
}


