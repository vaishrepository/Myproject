package practice;

public class Constructorexample {
      
	String name;
	int age;
	
	
	
	
	public static void main(String[] args) {
		Constructorexample obj=new Constructorexample("abc",25);

	}
	
	public Constructorexample() { //default constructor
	 System.out.println("default constructor");
	}
	public Constructorexample(String name,int age) {
		//this.classvariable=localvariable/paramter
		this.name=name;

		
}
}