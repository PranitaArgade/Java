
class Switch4{
	public static void main(String[]args){
		char ch='A';
		switch(ch){
			case 'A':
				System.out.println("char A");
				break;
			case 65:
				System.out.println("Num-65");
				break;
			case 'B':
				System.out.println("char-B");
				break;
			case 66:
				System.out.println("Num-66");
				break;
			default:
				System.out.println("No match");
				break;
		}
		System.out.println("After Switch");
	}
}
