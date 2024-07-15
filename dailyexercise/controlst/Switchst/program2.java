/* use  break for break the loop or block
output: error 1: duplicate case label 
                  case 5:
	error 2:duplicate case label
	          case 2:
- because in switch duplicate case are not allowed;
*/
class Switch2{
	public static void main(String[]args){
		int X=5;
		switch(X){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 5:
				System.out.println("5");
				break;
			case 5:
				System.out.println("Second-5");
				break;
			case 2:
				System.out.println("Second-2");
		                 break;
			default:
				 System.out.println("No Match");
				 break;
		}
		System.out.println("After loop");
		}
}
