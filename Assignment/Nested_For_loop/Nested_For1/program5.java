/*
  -Write a program to print the following pattern.
  12  12  12
  11  11  11
  10  10  10

  */

class Pattern5{
	public static void main(String[]args){
		int Num=12;
		int N=3;
		for(int i=1; i<=N; i++){
			for(int j=1; j<=N; j++){
				System.out.print(Num +"  ");
			}
			Num--;
			System.out.println();
		}
	}
}
