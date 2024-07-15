//Write a real time example.

class PhonePay{
	int pin=123;
	void PaymentHistory(){
		System.out.println("Transcation Status");
	     class Transaction{
		     void MobileNo(){
			     System.out.println("Payment by Mobile no");
		     }
		     void UPI_Scanner(){
			     System.out.println("Payment Done by UPI Scanner");
		     }
	     }
	     	Transaction obj=new Transaction();
		obj.MobileNo();
		obj.UPI_Scanner();
	}
	void Check_Balance(){
		if(pin==123){
			System.out.println("Balance Display");
		}else{
			System.out.println("Wrong Pin..please enter correct pin");
		}
	}

	public static void main(String[]args){
		PhonePay obj=new PhonePay();
		obj.PaymentHistory();
		obj.Check_Balance();
	}
}
