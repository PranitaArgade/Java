/* WAP to find the perfect number from an array and return its index.
 Enter Size
5
Enter array in elements
1
2
6
26
496
Perfect Number
2
4
*/

import java.io.*;
class PerfectNum{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array in elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Perfect Number");
		for(int i=0;i<arr.length;i++){
			int N=arr[i];
			int sum=0;
			for(int j=1;j<N;j++){
				if(arr[i]%j==0){
					sum=sum+j;
				}
			}
			if(arr[i]==sum){
				System.out.println(i);
			}
		}
	}
}

