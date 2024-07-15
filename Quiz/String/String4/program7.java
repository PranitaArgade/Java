//output:no error,no output
/*reason:
  -new StringBuilder(10);creates a null StringBuilder object having capacity 10.
  -there is nothing to print in it and it is also syntactically correct.*/

class Demo7{
	public static void main(String[]args){
		StringBuilder sbvar=new StringBuilder(10);
		System.out.println(sbvar);
	}
}
