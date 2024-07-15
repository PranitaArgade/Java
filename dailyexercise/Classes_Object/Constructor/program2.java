class ConstrDemo{
	ConstrDemo(){
		System.out.println("In ConstrDemo");
	}
	void fun(){
		
	       System.out.println("In fun");
	        
		
	}
	public static void main(String[]args){
                ConstrDemo obj1=new ConstrDemo();
	    	ConstrDemo obj2=new ConstrDemo();
	         ConstrDemo obj=new ConstrDemo();
			 obj.fun();
	         System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
