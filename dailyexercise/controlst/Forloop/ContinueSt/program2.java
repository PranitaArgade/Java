//Take an integer number from 1 to 50 numbers,Number divisible by 3 and 5 or 4 then print it.

class Continue2{
	public static void main(String[]args){
		int N=50;
		for(int i=1; i<=50; i++){
			if((i%3==0 && i%5==0)&&(i%4==0)){
				continue;
			}
			System.out.println(i);
		}
	}
}
