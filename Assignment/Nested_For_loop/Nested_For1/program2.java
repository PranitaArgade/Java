/*
 - Write a program to print the following pattern.
  4  5  6  7
  4  5  6  7
  4  5  6  7
  4  5  6  7

  */

class Pattern2{
	public static void main(String[]args){
		for(int i=1; i<=4; i++){
			int N=4;
			for(int j=1; j<=4; j++){
				System.out.print(N++ +"  ");
			}
			System.out.println();
		}
	}
}
