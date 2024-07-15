//write java program,if numbers 1 to 40.if Number is divisible by 3 ,if not then print it

class Divisible3{
	public static void main(String[]args){
		int N=40;
		for(int i=1; i<=40; i++){
			if(i%3==0){
				break;
			}
			System.out.println(i);
		}
	}
}
