/*WAP to search a specific elements from an array and return its index.
 5
Enter array element
1
2
3
4
5
Enter element in array to search
4
index of element :3
*/

import java.io.*;
class Pr4{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter element in array to search:");
		int ele=Integer.parseInt(br.readLine());

		for(int j=0;j<arr.length;j++){
			if(arr[j]==ele){
				System.out.println("index of element :"+ j);
			}
		}
	}
}

