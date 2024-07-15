/* WAP to take array size from user and also take integer elemnt from usr and print product of even number.
 output:
5
Enter the element
1
2
3
4
5
Even number product:8
*/
import java.io.*;
class Pr2{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int Prod=1;
		System.out.println("Enter the element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				Prod=Prod*arr[i];
			}
		}
		System.out.println("Even number product:"+Prod);
	}
}
