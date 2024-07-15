/* WAP to print vowels from array
 7
Enter the array character
a
b
c
e
i
o
u
Output
a
e
i
o
u
*/

import java.util.*;
class Vowels{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		char arr[]=new char[size];
		System.out.println("Enter the array character");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		  System.out.println("Output");
		  for(int i=0;i<arr.length;i++){
		     if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
			     System.out.println(arr[i]);
		     }
		}
	}
}



