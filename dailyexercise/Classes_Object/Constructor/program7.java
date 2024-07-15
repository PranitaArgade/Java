class Mall7{
   int ProductId=10;
   Mall7(){
	   System.out.println("In Constructor");
   }
   void AccountSection(){
	   System.out.println("Bill the product");
	   System.out.println("Product Id="+ProductId);
   }
   public static void main(String[]args){
	   Mall7 obj=new Mall7();
	   obj.AccountSection();
   }
}
