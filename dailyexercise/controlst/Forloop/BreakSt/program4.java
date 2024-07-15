//Write a java program,if 1 to 40 numbers,numbers in 1 to 40 which is divisible by 3 and 5 or not then print it.

class Divisible{
	public static void main(String[]args){
		int i=1;
		int N=40;
		for(i=1; i<=N; i++){
			if(i%3==0 && i%5==0){
				break;
			}
			System.out.println(i);
		}
	}
}


