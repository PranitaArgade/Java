//Write a program to count the digit of the given number.

class Pr13{
	public static void main(String[]args){
		int N=1234567890;
		int count=0;
		for(;N!=0;){
			count++;
			N=N/10;
		}
		System.out.println("count the digit ="+count);
	
	}
}
