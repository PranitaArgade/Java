/*
 A  B  C  D
 B  C  D
 C  D
 D
*/

class Pr35{
	public static void main(String[]args){
		int rows=4;
		char ch='A';
		for(int i=1;i<=rows;i++){
			char ch2=ch;
			for(int j=1;j<=rows-i+1; j++){
				System.out.print(ch2+"  ");
				ch2++;
			}
			System.out.println();
			ch++;
		}
	}
}
