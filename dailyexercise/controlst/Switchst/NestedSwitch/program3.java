class SwitchDemo3{
	public static void main(String[]args){
		String str="Arjit singh";
		System.out.println("Music Industry");
		switch(str){
			case "Arjit singh":
				{
					System.out.println("Arjit singh");
					String str1= "Fav Song";
					switch(str1){
						case "Fav Song":
							System.out.println("Agar Tum Saath Ho");
							break;
						 case "Trending Song":
							System.out.println("Kesariya");
							break;
					}
				}
				break;
			case "Darshan Raval":
				{
					String str1="Trending song";
					switch(str1){
						case "Fav Song":
							System.out.println("Tu Mileya");
							break;
						case "Trending song":
							System.out.println("Mahiye jinna Sohna");
							break;
					}
				}
				break;
		}
		System.out.println("After Switch");
	}
}

