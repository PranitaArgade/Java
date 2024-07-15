/* WAP to take size of array from user and also take integer elements from user find the maximum elements from the array.
 Enter size
5
Enter array Element
1
2
0
5
4
Maximum Element: 5
*/

import java.util.*;
class Pr6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int arr[]=new iint[size];
		System.out.println("Enter array Element");
		int maxElement=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>maxElement)
				maxElement=arr[i];
		}
		System.out.println("Maximum Element: "+maxElement);
	}
}

