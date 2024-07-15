//output:Runtime exception
/*reasoin:Since the code syntactically correct it does not generate any compile time error.
 -But at the time of execution loop is trying to access elements afetr index 4 which gives 'ArrayIndexOutofBoundsException'.*/
class Solution7{
	public static void main(String[]args){
		float[] arrfloat=new float[5];
		for(int i=1;i<10;i++)
			arrfloat[i]=i+1;
		System.out.println(arrfloat[3]);
	}
}
