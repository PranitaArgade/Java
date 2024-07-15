/*WAP to find the common elements between two arrays.
 Enter Size of array 1
4
Enter Size of array 2
4
Enter array1 Element
1
2
3
4
Enter array2 Element
1
3
8
9
Common elements  1
Common elements  3
 */

import java.io.*;
class Pr7{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size of array 1");
		int size1=Integer.parseInt(br.readLine());
		System.out.println("Enter Size of array 2");
		int size2=Integer.parseInt(br.readLine());
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		System.out.println("Enter array1 Element");
		for(int i=0;i<arr1.length;i++){

			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter array2 Element");
		for(int j=0;j<arr2.length;j++){
			arr2[j]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j])
					System.out.println("Common elements :"+arr1[i]);
			}
		}
	}
}
