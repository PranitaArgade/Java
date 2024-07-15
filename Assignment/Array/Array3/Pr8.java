/*WAP to find ArmStrong number from an array and return its index.
 Enter Size
5
Enter array element
12
153
223
25
76
Armstron number
Armstrong number= 153:1
*/


import java.io.*;
class ArmstrongNum{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Armstron number");
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int N=arr[i];
			int count=0;
			int sum=0;
			while(N!=0){
				count++;
				N=N/10;
			}
		//	System.out.println("Count:   "+count);
			while(temp!=0){
				int rem=temp%10;
				int mul=1;
				for(int j=1;j<=count;j++){
					mul=mul*rem;
				
				}
				//System.out.println(mul);
			         sum=sum+mul;
				temp=temp/10;
				
			
			}
			
			

			if(sum==arr[i]){
				System.out.println("Armstrong number= "+arr[i]+":"+i);
			}
		}
	}
}
					
