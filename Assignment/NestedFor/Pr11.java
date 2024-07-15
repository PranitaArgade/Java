/*
  C2W1   C2W2   C2W3
  C2W1   C2W2   C2W3
  C2W1   C2W2   C2W3
*/

class Pr11{
	public static void main(String[]args){
		for(int i=1;i<=3;i++){
			int num=1;
			for(int j=1; j<=3; j++){
				System.out.print("C2W"+num++ +"   ");
			}
			System.out.println();
		}
	}
}
