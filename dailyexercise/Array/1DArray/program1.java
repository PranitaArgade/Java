class ArrayDemo1{
	public static void main(String[]args){
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;

		int arr1[]={10,20,30,40};
		int arr2[]=new int[]{30,40,50,10};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	    char arr3[]=new char [4];        //output:bydefault print blank
	    System.out.println(arr3[0]);
	    System.out.println(arr3[1]);
	    System.out.println(arr3[2]);
	    System.out.println(arr3[3]);

	    //intger
	    //output:bydefault 0
	    int arr4[]=new int[4];
	    System.out.println(arr4[0]);
            System.out.println(arr4[1]);
            System.out.println(arr4[2]);
            System.out.println(arr4[3]);
           //float 
	   //output:bydefault:0.0
	   float arr5[]=new float[4];
	    System.out.println(arr5[0]);
            System.out.println(arr5[1]);
            System.out.println(arr5[2]);
            System.out.println(arr5[3]);
	    //boolean
	    //output:bydefault:false
	    boolean br[]=new boolean[4];
	    System.out.println(br[0]);
            System.out.println(br[1]);
            System.out.println(br[2]);
            System.out.println(br[3]);
	}
}
