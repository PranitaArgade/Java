/*
 10
 9  8
 7  6  5
 4  3  2  1
*/

class Pr23{
	public static void main(String[]args){
		int rows=4;
		int num=10;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num--+"  ");
			}
			System.out.println();
		}
	}
}
