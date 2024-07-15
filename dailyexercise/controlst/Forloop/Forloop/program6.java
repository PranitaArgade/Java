/*
 - Take N as input ,count all its factors and print count.
 -input1:6
 -output1:4
 - input2:24
 - output:8
 */

class Count6{
	public static void main(String[]args){
		int N=24;
		int count=0;
		for(int i=1; i<=N; i++){
			if(N%i==0){
				count++;
			}
		}
		System.out.println("Count="+count);
	}
}
