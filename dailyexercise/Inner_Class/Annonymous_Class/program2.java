class Demo{
	void Marry(){
		System.out.println("XYZ");
	}
}
class Client{
	public static void main(String[]args){
		Demo obj=new Demo(){
			void Marry(){
				System.out.println("ABC");
			}
		};
		obj.Marry();
	}
}
