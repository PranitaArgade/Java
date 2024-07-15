//reason: A character array is created using new and then element is individually assigned using indexes and then displayed using for loop.
class Solution5{
	public static void main(String[]args){
		char arrchar[]=new char[3];
		arrchar[0]='C';
		arrchar[1]='2';
		arrchar[2]='W';
		for(int i=0;i<arrchar.length;i++)
			System.out.print(arrchar[i]+" ");//C 2 W
	}
}
