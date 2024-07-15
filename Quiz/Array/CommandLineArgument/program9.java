//output:Runtime exception:ArrayIndexOutOfBoundException
/*reason:
 -When we donot give any command line arguments then that array is empty and its length=0.
 -But we are trying to access empty array therefore we are getting ArrayIndexOutOfBoundException.*/
class Demo9{
	public static void main(String s[]){
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
	}
}
