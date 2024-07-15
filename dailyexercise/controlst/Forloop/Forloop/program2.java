//Take N as input,print odd integers from 1 to N.
//input:6
//output:1 3 5

class Odd1{
	public static void main(String[]args){
		int N=6;
		for(int i=1; i<=N; i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}
}
