//output:16 0
//reason:StringBuffer has initial buffer capacity to store capcity is 16.
class Demo6{
	public static void main(String[]args){
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}
