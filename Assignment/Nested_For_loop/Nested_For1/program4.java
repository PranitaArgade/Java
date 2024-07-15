/*
 -Write a program to print the following pattern
   1A   1A   1A
   1A   1A   1A
   1A   1A   1A

   */

class Pattern4{
	public static void main(String[]args){
		int N=3;
		for(int i=1; i<=N; i++){
			for(int j=1; j<=N; j++){
				System.out.print("1A" +"   ");
			}
		     System.out.println();
		}
	}
}

