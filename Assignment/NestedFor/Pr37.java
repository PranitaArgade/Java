/*
 F
 E  1
 D  2   E
 C  3   D  4
 B  5   C  6   D
 A  7   B  8   C  9
*/
class Pr37{
	public static void main(String[]args){
		int row=6;
		int num=1;
		char ch1='F';
		for(int i=1;i<=row;i++){
			char ch2=ch1;
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(ch2 + "  ");
					ch2++;
					
				}else{
					System.out.print(num+"   ");
					num++;
				}
				
			}
			System.out.println();
			ch1--;
			
		}
	}
}
