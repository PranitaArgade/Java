//Write a java program,if numbers ares 1 to 20 which is divisible by 3,print those no which is not divisble by 3.

class Continue1{
	public static void main(String[]args){
		int N=20;
		int i=1;
		for(i=1; i<=N; i++){
			if(i%3==0){
				continue;
			}
			System.out.println(i);
		}
	}
}
