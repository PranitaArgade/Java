/*WAP to find an composite number (more than two factors or not prime)from an array
 Enter size
5
Enter array elements
1
2
3
6
7
Composite number
3
*/

import java.io.*;
class CompositeNum{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Composite number");
		for(int i=0;i<arr.length;i++){
			int count=0;
			int N=arr[i];
			for(int j=1;j<=N;j++){
		                 if(N%j==0)
					 count++;
			}
			if(count>2){
				System.out.println(i);
			}
		}
	}
}
			
