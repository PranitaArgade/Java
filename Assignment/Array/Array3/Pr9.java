/*WAP to find the second max number from an array and return its index.*/

import java.util.*;
class SecondMax{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter array elements");
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println("Second max number");
			int maxNum=Integer.MIN_VALUE;
			int SecondMax=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++){
				if(arr[i]>maxNum){
					maxNum=arr[i];
					arr[i]=SecondMax;
				//	System.out.println(SecondMax);
				}else if(SecondMax<maxNum && SecondMax!=maxNum){
						SecondMax=arr[i];
					}
				       
				}
			System.out.println(SecondMax);
	}
}
					

		
