import java.util.*;
class ArrayMul6{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		int mul=1;
		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
			mul=mul*arr[i];
		}
		System.out.println("Array of mul="+mul);
	}
	
}

