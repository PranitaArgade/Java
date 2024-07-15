class SwitchDemo1{
	public static void main(String[]args){
		String str="Prime video";
		System.out.println("Before Switch");
		switch(str){
			case "Prime video":
				{
					String str1="Movies";
					switch(str1){
						case "Movies":
							System.out.println("Marathi Movies");
							break;
						case "Series":
							System.out.println("Marathi series");
							break;
					}
				}
				break;
				
			case "Netflix":
				{
					String str1="Movies";
					switch(str1){
						case "Movies":
							System.out.println("Hindi Movies");
							break;
						case "Series":
							System.out.println("Hindi series");
							break;
					}
				}
				break;
				
		}
		System.out.println("After Switch");
	}
}
