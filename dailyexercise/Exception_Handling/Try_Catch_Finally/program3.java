//Interrupted Exception

class Demo{
	public static void main(String[]args){
		for(int i=0; i<10;i++){
			System.out.println("In Loop");
			try{
			Thread.sleep(5000);
			}catch(InterruptedException obj){
				
			}
		}
	}
}
