/*
 1  2  3  4
 2  3  4
 3  4
 4
*/
class Pr34{
	public static void main(String[]args){
		int row=4;
		int num=1;
		for(int i=1;i<=row;i++){
			int itr=num;
			for(int j=1;j<=row-i+1;j++){
				System.out.print(itr++ +"  ");
			}
			System.out.println();
			num++;
			
			
		}
		
	}
}

