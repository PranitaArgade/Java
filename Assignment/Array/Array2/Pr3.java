/* Write a java program to find the sum of even and odd numbers in an array.
 5
Enter array element
11
12
13
14
15
Even number sum:26
Odd number sum:39
*/

import java.io.*;
class Pr3{
	public static void main(String[]arg)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int sum1=0;
		int sum2=0;
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				sum1=sum1+arr[i];
			}else{
				sum2=sum2+arr[i];
			}
		}
		System.out.println("Even number sum:"+sum1);
		System.out.println("Odd number sum:"+sum2);
	}
}
