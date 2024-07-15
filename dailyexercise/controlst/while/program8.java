//Given an integer N
//Pint sum of all digits
//input:6531
//output:15

class Sum{
	public static void main(String[]args){
		int N=6531;
		int sum=0;
		while(N!=0){
			int rem=N%10;
			sum=sum+rem;
	                N=N/10;
		}
	System.out.println(sum);
	}
}
