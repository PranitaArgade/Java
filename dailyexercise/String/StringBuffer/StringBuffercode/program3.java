class StringBufferDemo3{
	public static void main(String[]args){
		StringBuffer str=new StringBuffer("kartik");
		System.out.println(str);
		System.out.println(str.capacity());//22 (because byefault 16 and 6 String size)
	         str.append("rahulaher");
		 System.out.println(str);    //kartikrahulaher
		 System.out.println(str.capacity()); //22
		 str.append("Priti Aher");  
		 System.out.println(str);   //kartikrahulaherPriti Aher
		 System.out.println(str.capacity());//46(because current capacity+1*2....means 22+1*2=46)


	}
}

