//Write a program without break
/* output: Three
          Four
	  Five
	  No match
	  After switch
	  -because once a condition match without break switch print all values because it consider a block.
	  */
class Switch1{
	public static void main(String[]args){
		int x=3;
		switch(x){
			case 1:
				System.out.println("One");
			case 2:
				System.out.println("Two");
			case 3:
				System.out.println("Three");
			case 4:
				System.out.println("Four");
			case 5:
				System.out.println("Five");
			default:
				System.out.println("No match");
		}
		System.out.println("After Switch");
	}
}

