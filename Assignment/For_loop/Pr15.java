//Write a program to count the odd digits of the given number.
//output:odd digit count:5
class Pr15{
	public static void main(String[]args){
		int N=942111423;
		int count=0;
		while(N!=0){
			
		  int rem=N%10;
		  if(rem%2!=0){
			  count++;
			  System.out.println(rem);
		  }
		  N=N/10;
		}
		System.out.println("odd digit count:"+count);
		System.out.println(N);
	}
}
