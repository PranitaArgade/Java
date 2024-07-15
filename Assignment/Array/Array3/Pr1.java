/* WAP to print count of digits in elements of array.*/

import java.io.*;
class CountDigit{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int count=0;
      
                        while(temp!=0){
			
			  
			 count++;
			 temp=temp/10;
			}
	
			System.out.println(count);
		}
	}
}


