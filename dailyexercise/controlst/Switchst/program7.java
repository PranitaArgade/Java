class Switch7{
	public static void main(String[]args){
		String str="Tue";
		switch(str){
			case "Mon":
				System.out.println("Monday");
				break;
			case "Tue":
				System.out.println("Tuesday");
				break;
			case "Wednes":
				System.out.println("Wednesday");
				break;
			case "Thus":
				System.out.println("Thusday");
				break;
			case "Fri":
				System.out.println("Friday");
				break;
			case "Satur":
				System.out.println("Saturday");
				break;
			case "Sunday":
				System.out.println("Sunday");
				break;
			default:
				System.out.println("No match");
				break;
			}
	}
}
