/*WAP to find an prime number from an array and return its index.
 Enter size
5
Enter array Elements
1
2
3
10
5
Prime number
1
2
4
*/

import java.io.*;
class PrimeNum{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Prime number");
		for(int i=0;i<arr.length;i++){
			int N=arr[i];
			int count=0;
			for(int j=1;j<=N;j++){
				if(N%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i);
		}
	}
}
