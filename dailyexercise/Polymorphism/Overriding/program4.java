//Real time example of Overriding.
class Match{
	void MatchType(){
		System.out.println("T20/OneDay/Test");
	}
}
class IPLMatch extends Match{
	void MatchType(){
		System.out.println("T20");
	}
}
class TestMatch extends Match{
	void MatchType(){
		System.out.println("Test");
	}
}
class Client{
	public static void main(String[]args){
		Match type=new Match();
                type.MatchType();
		Match type1 =new IPLMatch();
		type1.MatchType();
		Match type2=new TestMatch();
		type2.MatchType();
		
	}
}
