/* 1
   1   2
   1   2   3
   1   2   3   4
   -print above patten      */


class Patten12{
	public static void main(String[]args){
		int N=4;
		for(int i=1; i<=N; i++){
			int num=1;
			for(int j=1; j<=i; j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}
