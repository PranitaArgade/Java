/* WAP to take size from user and also take integer element from user and print the odd index element product.
 output
 Enter Size
10
Enter array element
1
2
3
4
5
6
7
8
9
1
Product of odd index element:  384*/
import java.io.*;
class Pr3{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array element");
		int Pro=1;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2!=0){
				Pro=Pro*arr[i];
			}
		}
		System.out.println("Product of odd index element:  "+Pro);
	}
}
	         
