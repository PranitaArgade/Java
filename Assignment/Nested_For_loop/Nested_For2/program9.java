/*
  - Write a  program to print the following pattern.
   1C3    4B2     9A1
   16C3   25B2    36A1
   49C3   64B2    81A1

   */


class Pattern9{
	public static void main(String[]args){
                int num2=1;
		for(int i=1; i<=3; i++){
			char ch='C';
			int num=3;
	               
			for(int j=1; j<=3; j++){
				System.out.print(num2*num2 +""+ ch +num+ "    ");
				ch--;
				num--;
				num2++;
	
			}
		System.out.println();
		}
	}
}
