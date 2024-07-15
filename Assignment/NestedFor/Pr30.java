/*
 1  2  3  4
 4  5  6
 6  7
 7
*/
class Pr30{
	public static void main(String[]args){
		int num=1;
		int itr=4;
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=itr;j++){
				System.out.print(num+"  ");
				num++;
			}
			num=num-1;
			System.out.println();
			itr--;
		}
	}
}
