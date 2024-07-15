/*
 D4  C3  B2  A1
 A1  B2  C3  D4
 D4  C3  B2  A1
 A1  B2  C3  D4
*/
import java.io.*;
class Pr1{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int num1=row;
			char ch2='A';
			char ch1=(char)(ch2+row-1);
			int num2=1;
			
			for(int j=1;j<=row;j++){
				if(i%2==0){
					System.out.print(ch2 +""+num2 +"  ");
					ch2++;
					num2++;
				}else{
					System.out.print(ch1 +""+num1 +"  ");
					ch1--;
					num1--;
				}


			}
			System.out.println();
		}
	}
}

			
