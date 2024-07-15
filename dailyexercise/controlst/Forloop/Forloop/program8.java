/*
 -Take integer N as input.
 -print whether N is perfect number or not.
 -input:4
 - output:Not a perfect number
 */
class Perfect8{
	public static void main(String[]args){
		int N=4;
		int sum=0;
		for(int i=1; i<=N; i++){
			if(N%i==0){
				sum=sum+i;
			}
		}
		if(sum==N){
			System.out.println("Perfect Number");
		}else
			System.out.println("Not perfect Number");
		}
}
