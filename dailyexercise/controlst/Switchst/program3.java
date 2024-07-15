/* output; error : duplicate case label
                   case 2:
		   */

class Switch3{
	public static void main(String[]args){
		int X=5;
		switch(X){
			case 1:
				System.out.println("1");
				break;
			 case 1+1:
                                System.out.println("2");
                                break;
			 case 1+2:
                                System.out.println("3");
                                break;
			case 5:
				System.out.println("5");
				break;
			case 2:
				System.out.println("Second-2");
				break;
			default:
				System.out.println("No Match");
				break;
			}
	     System.out.println("After Switch");
	}
}
