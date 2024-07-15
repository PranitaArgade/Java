//output:False
/*reason:str1 initialization is done with the string "Demo" results in capacity of 20(default 16+String length 4).
   But str2 is initialized without giving any parameter so its capacity will be 16.
   now append method will be called on runtime and the appended String Demo will not change the capacity of the str2.
   hence 20==16 returns false*/
class Demo2{
	public static void main(String[]args){
		StringBuffer str1=new StringBuffer("DEMIO");
		StringBuffer str2=new StringBuffer();
		str2=str2.append("DEMO");
		System.out.println(str1.capacity()==str2.capacity());
	}
}
