class Message{
	void OTP(){
		System.out.println("Send by Mobile No");
	}
}
class Client{
	public static void main(String[]args){
	Message obj=new Message(){
		void OTP(){
			System.out.println("Send by email");
		}
	};
	obj.OTP();
	}

}


