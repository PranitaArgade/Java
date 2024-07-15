/* WAP to take size of array from user and also take integer elements from user find the minimum elements from the array.
  Enter size
5
Enter array element
1
2
9
0
6
Minimum value is : 0
*/

import java.util.*;
class Pr5{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int minElement=Integer.MAX_VALUE;
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]<minElement){
				minElement=arr[i];
			}
		}
		System.out.println("Minimum value is : "+minElement);
	}
}
