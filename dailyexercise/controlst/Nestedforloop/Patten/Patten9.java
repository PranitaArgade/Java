/* 10
   9   8
   7   6   5
   4   3   2   1   
   - print the above patten */

class Patten9{
	public static void main(String[]args){
		int num=10;
		int N=4;
		for(int i=1; i<=N; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num-- +" ");
			}
			System.out.println();
		}
	}
	
}
     
