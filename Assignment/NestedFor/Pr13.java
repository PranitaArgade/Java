/*
 14   15   16   17
 15   16   17   18
 16   17   18   19
 17   18   19   20
*/
class Pr13{
	public static void main(String[]args){
		int num=14;
		for(int i=1; i<=4;i++){
                      int itr=num;
			for(int j=1; j<=4;j++)
			{
				System.out.print(itr++ +"   ");
			}
			System.out.println();
		     num++;      	
		}
		
	}
}
