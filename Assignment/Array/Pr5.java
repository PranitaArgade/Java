/* WAP ,take input from user and print only elements which are divisible by 5.
10
Enter array element
12
10
22
33
54
55
15
20
30
40
output
10
55
15
20
30
40 
*/

import java.util.*;
class Pr5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("output");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
				System.out.println(arr[i]+" ");
			}
		}
		System.out.println();
	}
}

