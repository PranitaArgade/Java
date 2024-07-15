/*
10  10  10  10
11  11  11
12  12
13
*/

class Pr25{
	public static void main(String[]args){
		int num=10;
		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){
				System.out.print(num+ "  ");
			}
			System.out.println();
			num++;
		}
	}
}
