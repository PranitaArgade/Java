//Take an integer N as input
//Print perfect squares till N
//Perfect square :An integer whose square root is an integer
//25=5:yes
//81=9:yes
//1=1:yes
//10=3.13:no
//input:30
//output:1 4 9 16 25
//platform code

class Square{
	public static void main(String[]args){
		int N=30;
		int i=1;
		while(i*i<=N){
			System.out.println(i*i);
			i++;
		}
	}
}
