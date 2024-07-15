/*
 1
 8  9
 27  16   125
 64  25   216  49
*/

class Pr39{
	public static void main(String[]args){
		
		int rows=4;
		for(int i=1;i<=rows;i++){
			int num=i;
			for(int j=1;j<=i;j++){
				
				if(j%2==0){
					System.out.print(num*num+"   ");
				}else{
					System.out.print(num*num*num+"  ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
