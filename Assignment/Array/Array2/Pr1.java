/*
 WAP to create an array where n integer elements taken from user and find the sum of elements in array.
output:
size:5
Enter array elements in the array
2
3
6
9
5
1
 sum=26*/
import java.io.*;
class Pr1{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int sum=0;
		System.out.println("ENter elements in the array");
		for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine()); 
			sum=sum+arr[i];
		}
		System.out.println("Sum=  "+sum);
	}
}
