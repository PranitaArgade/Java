/*Reason:
   -StringBuffer object can be initialized using integer parameter which defines capacity.
   -In StringBuffer an append method also has a single integer parameter which will be converted to string using value of method of string.
   -Change the length of StringBuffer will not change the capacity .hence the ans.*/
class Demo4{
	public static void main(String[]args){
		StringBuffer str=new StringBuffer(400);
		str.append(400);
		str.setLength(str.length());
		System.out.println(str.capacity());//400
	}
}
