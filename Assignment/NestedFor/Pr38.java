class Pr38{
	public static void main(String[]args){
		int row=4;
	    char ch='K';
	    int num=10;
	    for(int i=1;i<=row;i++){
                 	  char ch2=ch;
		    for(int j=1;j<=i;j++){
			    
			    if(i%2!=0){
				    System.out.print(num-- +"   ");
			    }else{
				    System.out.print(ch2-- +"   ");
				    
			    }
		    }
		    System.out.println();
		    num=num--;
		    num--;
		   ch2=ch--;
		   ch--;
		   ch--;
		   
	    }
	    
	}
}
