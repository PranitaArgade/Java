/*
 - Take N as input ,print whether its prime or not.
 */
class Prime7{
	public static void main(String[]args){
		int N=2;
		int count=0;
		for(int i=1; i<=N; i++){
			if(N%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("Prime No");
		}else{
			System.out.println("Not Prime");
		}
	}
}
