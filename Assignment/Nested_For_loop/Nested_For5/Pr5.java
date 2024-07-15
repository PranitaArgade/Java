import java.io.*;
class Pr5{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int row=Integer.parseInt(br.readLine());
		int num=0;
		int sum=0;
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=i;j++){
				sum=num+num;
				System.out.print(sum+"  ");
				
			}
			num++;
			
		   System.out.println();
		}
	}
}

