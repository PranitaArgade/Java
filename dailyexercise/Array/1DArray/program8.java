//internal of Array

class ArrayDemo8{
	public static void main(String[]args){
		int arr[]={10,20,30,40};
		int arr1[]={10,20,30,40};
		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr[0]));
	        System.out.println(System.identityHashCode(arr1[0]));
	}
}
