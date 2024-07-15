/*
 F
 E  F
 D  E  F
 C  D  E  F
 B  C  D  E  F
 A  B  C  D  E  F
*/

class Pr27{
	public static void main(String[]args){
		
                int rows=6;
		char ch1='F';
		for(int i=1;i<=rows;i++){
			char ch2=ch1;
			for(int j=1;j<=i;j++){
				System.out.print(ch2+"  ");
				ch2++;
			}
			System.out.println();
			ch1--;
		}
	}
}
		   
