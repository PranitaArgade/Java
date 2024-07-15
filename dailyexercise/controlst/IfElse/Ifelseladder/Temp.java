//Given the temperature of a person in farenheint.
//print whether the person has high,normal,low temperature.
//temp>98.6 =high
//98.0<=& <=98.6 =normal
//<98.0 =low

class Demo{
	public static void main(String[]args){
		float temp=98.6f;
		if(temp>98.6f){
			System.out.println("High");
		}
		else if(temp<98.0f){
			System.out.println("Low");
		}
		else{
			System.out.println("Normal");
			}
	}
}
