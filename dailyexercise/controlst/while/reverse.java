//Give an integer N
//Print all the digits
//input:6531
//output:1 3 5 6
 class Reverse{
	 public static void main(String[]args){
		 int N=6531;
		 while(N!=0){
			 System.out.println(N%10);
			 N=N/10;
		 }
	 }
 }
