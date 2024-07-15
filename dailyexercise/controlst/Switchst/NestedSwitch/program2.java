class SwitchDemo2{
	public static void main(String[]args){
		String str="Veg";
		System.out.println("Oh Pune");
		switch(str){
                  case "Veg":
			  {
				  String str1="Starters";
				  switch(str1){
				  case "Starters":
				          System.out.println("Masala Papad");
					  break;
				  case "Main Course":
					  System.out.println("Veg thali");
					  break;
			  }
			  }
	
		break;
		case "Non Veg":
		{
			String str1="Main Course";
			switch(str1){
			case "Starters":
			    System.out.println("Chikan krispi");
			    break;
			case "Main Course":
			    System.out.println("Chikan Thali");
			    break;
		}
		}

	
	break;
         }
	 System.out.println("After Switch");
	}
}
