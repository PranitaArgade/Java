/*WAP to print the elements whose addition of digits is even.
 Enter Size
10
Enter array Elements
1
2
3
4
15
14
28
17
123
29
Addition of digits even
2
4
15
28
17
123
 */

import java.io.*;
class Pr10{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		
		}
		System.out.println("Addition of digits even");
	      
			for(int j=0;j<arr.length;j++){
			int N=arr[j];
			int sum=0;
			while(N!=0){
				int digit=N%10;
				sum=sum+digit;
				N=N/10;
			}
			if(sum%2==0){
				System.out.println(arr[j]);
			}
		}
	}
}
