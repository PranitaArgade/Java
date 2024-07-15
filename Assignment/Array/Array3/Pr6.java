/*WAP to find the pallindrome number from an array and return its index.
 Enter Size
5
Enter elements from an array
121
133
564
212
678
Pallindrom number index
Pallindrome number:  0
Not a pallindrome number:  1
Not a pallindrome number:  2
Pallindrome number:  3
Not a pallindrome number:  4
*/

import java.io.*;
class PallindromeNum{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter elements from an array");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Pallindrom number index");
		for(int i=0;i<arr.length;i++){
			int N=arr[i];
			int rev=0;
			while(N!=0){
				int rem=N%10;
				rev=rev*10+rem;
				N=N/10;
			}
			if(rev==arr[i]){
				System.out.println("Pallindrome number:  "+i);
			}else
				System.out.println("Not a pallindrome number:  "+i);
		}
	}
}

