//output:DBMysql
/* StringBuffer object can also be made by using temporary object of character array(new char[]{}).
  in above case StringBuffer object will contain "DB" and appending "Mysql" to it gives the ans*/
class Demo1{
	public static void main(String[]args){
		StringBuffer str=new StringBuffer(new String(new char[]{'D','B'}));
		str.append("Mysql");
		System.out.println(str);
	}
}
