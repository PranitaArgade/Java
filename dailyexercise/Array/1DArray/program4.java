//Acessing element by using for loop
import java.io.*;
class ArrayDemo4{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[5];
		for(int i=0; i<5;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0; i<5; i++){
			System.out.println(arr[i]);
		}
	}
}
