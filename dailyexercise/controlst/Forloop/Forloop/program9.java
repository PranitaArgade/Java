/*
 - Take N as input .
 -Print whether N is Armstrong number or not.
 -input1:23
 -output1:Not a Armstrong No.
 -input2:153
 -output:Armstrong number.
 */

class Armstrong91{
	public static void main(String[]args){
		int N=153;
		int Sum=0;
		int temp=N;
		while(N!=0){
			int rem=N%10;
			Sum=Sum+(rem*rem*rem);
			N=N/10;
		}
	   if(temp==Sum){
		   System.out.println("Armstrong Number");
	   }else
		   System.out.println("Not Armstrong Number");
	   }
}
