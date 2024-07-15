/*
  - Write a program to print the following pattern.
   C2W  C2W  C2W
   C2W  C2W  C2W
   C2W  C2W  C2W

  */

class Patten1{
	public static void main(String[]args){
		int N=3;
		for(int i=1; i<=N; i++){
			for(int j=1; j<=N; j++){
				System.out.print("C2W" +"  ");
			}
			System.out.println();
		}
		
	}
}
