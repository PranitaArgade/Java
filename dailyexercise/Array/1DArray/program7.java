//Take element and array size from user and print array even element count.

import java.util.*;
class ArrayEven{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count1++;
			}
			else{
				count2++;
			}
			}
		System.out.println("Even Count="+count1);
		System.out.println("Odd Count="+count2);

	}
}
