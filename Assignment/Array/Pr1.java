/* WAP to take size from user and also take integer element from user and print sum of add element.
   10
Enter the Element
1
2
3
4
1
2
3
4
1
2
Sum of odd number:9
*/

import java.io.*;
class Pr1{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int sum=0;
		System.out.println("Enter the Element");
		for(int i=0;i<arr.length;i++){
			
			arr[i]=Integer.parseInt(br.readLine());
			 if(arr[i]%2!=0){
				 sum=sum+arr[i];
			 }
		}
		System.out.println("Sum of odd number:"+sum);
	}
}


