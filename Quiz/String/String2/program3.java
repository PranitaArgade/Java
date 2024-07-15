
//output: Both are not equal
//reason:Here though char sequence is same in both but they are object of different class,therefore not equal.
//To check char sequence contentEquals()method is used.
class Demo3{
	public static void main(String[]args){
		StringBuffer var1=new StringBuffer("Shashi");
		String var2=new String("Shashi");
		if(var2.equals(var1)){
			System.out.println("Both are equal");
		}
		else{
			System.out.println("Both are not equal");
		}
	}
}
