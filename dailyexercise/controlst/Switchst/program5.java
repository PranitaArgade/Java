/*  output:error:constant expression required
                  case 1:
	           .
		   .
- variable expression not required because value changes after updation*/

class Switch5{
	public static void main(String[]args){
		int x=3;
		int a=1;
		int b=2;
		switch(x){
			case a:
				System.out.println("1");
				break;
			case b:
				System.out.println("2");
				break;
			case a+b:
				System.out.println("3");
				break;
			case a+b+b:
				System.out.println("4");
				break;
			default:
				System.out.println("Invalid");
				break;
		}
	}
}
