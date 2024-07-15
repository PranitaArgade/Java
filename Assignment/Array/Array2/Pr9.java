/*WAP to merge a given array
 10
20
30
40
50
1
2
3
4
5
*/

class Pr9{
	public static void main(String[]args){
		int arr1[]=new int[]{10,20,30,40,50};
		int arr2[]=new int[]{1,2,3,4,5};
		int N=arr1.length+arr2.length;
		int Merge[]=new int[N];
		for(int i=0;i<arr1.length;i++){
			Merge[i]=arr1[i];
	}
	for(int j=0;j<arr2.length;j++){
		Merge[arr1.length+j]=arr2[j];
	}
	for(int i=0;i<Merge.length;i++){
		System.out.println(Merge[i]);
	}
	}

}
