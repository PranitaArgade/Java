//Take a five elements in array by user and addition of these elements.

import java.util.*;
class Addition5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		System.out.println("Array sum="+sum);

	}
}
