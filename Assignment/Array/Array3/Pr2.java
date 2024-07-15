/*WAP to reverse each element in an array.Take size and elements from user.
 Enter Size
5
Enter array elements
123
23
45
90
12
output
321
32
54
9
21
 */

import java.io.*;
class Reverse{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("output");
		for(int i=0;i<arr.length;i++){
			int N=arr[i];
			int rev=0;
			while(N!=0){
				int rem=N%10;
				rev=rev*10+rem;
				N=N/10;
			}
			System.out.println(rev);
		}
	}
}
