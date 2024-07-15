/*WAP to find the Strong number(each digit factorial sum is equal to origin number)from and array and return its index.
 Enter Size
5
Enter array element
12
145
234
187
56
Strong number
Strong num 145  =1
*/

import java.io.*;
class StrongNum{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Strong number ");
		for(int i=0;i<arr.length;i++){
			int N=arr[i];
			int sum=0;
			 
			 
				 while(N!=0){
				 int digit=N%10;
				 int fact=1;
				 for(int j=1;j<=digit;j++){
					 fact=fact*j;
				           	 
                                      
				 }
				 sum=sum+fact;
				
				 N=N/10;
				 }
				
				 if(sum==arr[i])
					 System.out.println("Strong num  "+arr[i]+"  ="+i);
				 
				 }
		}
}
				 
