/*WAP to find the number of even and odd integers in the array of integer.
7
Enter array element
1
2
5
4
6
7
8
Number of Even Elements:4
Number of odd elements:3
*/
import java.io.*;
class Pr2{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array element");
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				count1++;
			}else{
				count2++;
			}
		}
		System.out.println("Number of Even Elements:"+count1);
		System.out.println("Number of odd elements:"+count2);
	}
}
			
