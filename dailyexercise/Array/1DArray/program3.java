//Take a input array from user

import java.io.*;
class ArrayDemo3{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[5];
		arr[0]=Integer.parseInt(br.readLine());
		arr[1]=Integer.parseInt(br.readLine());
		arr[2]=Integer.parseInt(br.readLine());
		arr[3]=Integer.parseInt(br.readLine());
		arr[4]=Integer.parseInt(br.readLine());
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

	}
}
