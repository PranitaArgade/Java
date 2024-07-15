//output:True2 True3
//identical hashcodes being same content
class Demo10{
	public static void main(String[]args){
		String s1=new String("Core2Web");
		String s2=new String ("Core2Web");
		if(s1==s2)
			System.out.println("True 1");
		if(s1.equals(s2))
			System.out.println("True 2");
		if(s1.hashCode()==s2.hashCode())
			System.out.println("True 3");
	}
}
