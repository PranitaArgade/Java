/*
 A  b  C  d
 E  f  G  h
 I  j  K  l
 M  n  O  p
*/
class Pr18{
	public static void main(String[]args){
		char ch='A';
		char ch2='a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0){
					System.out.print(ch2 +"  ");
					
				}else{
					System.out.print(ch +"  ");
					
				}
				ch2++;
				ch++;
				
				
			}
			System.out.println();
		}
	}
}

