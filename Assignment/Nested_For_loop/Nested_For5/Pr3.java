/*
 5  4  3  2  1
 8  6  4  2
 9  6  3
 8  4
 5
*/
import java.io.*;
class Pr3{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int num=i;
			for(int j=row;j>=i;j--){
				System.out.print((j-num)*num+num +"  ");
			}
			
			System.out.println();
			
			
			
		}
	
	}
}
