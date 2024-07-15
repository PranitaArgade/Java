//Write a real time example of multiple inheritance.
interface SingerName1{
	static  void Singer1(){
	System.out.println("Arjit Sign");
	}
}
interface SingerName2{
	static void Singer2(){
	System.out.println("Armaan Malik");
	}
}
interface SingerName3{
	static  void Singer3(){
	System.out.println("Atif Aslam");
	}
}
class SongName implements SingerName1,SingerName2,SingerName3{
            void Song(){
		System.out.println("jeena jeena");

}
}
class ClientSong{
	public static void main(String[]args){
		SongName obj=new SongName();
		obj.Song();
	       SingerName1.Singer1();	
               SingerName2.Singer2();
	       SingerName3.Singer3();
	}
}
