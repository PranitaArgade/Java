/* -Write a program to print the following pattern
   1A   2B   3C
   1A   2B   3C
   1A   2A   3C

   */

class Pattern4{
	public static void main(String[]args){
		for(int i=1;i<=3; i++){
		int num=1;
		char ch='A';
		 for(int j=1; j<=3; j++){
			 System.out.print(num +""+ ch +"   ");
			 num++;
			 ch++;

		 }
		 System.out.println();
		}
	}
}

