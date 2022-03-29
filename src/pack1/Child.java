package pack1;
//Inheritance -Child class

public class Child extends Parent{

	public static void main(String[] args) {
		
	Parent obj=	new Child();
	obj.details();
	Child obj1= (Child) new Parent();
	}
	
	     
	//common in parent and child/only there in parent
	
	
	//method overriding  //Polymorphism
	public void details() {
	System.out.println("details from child");
	}
				 
	public void job() {
	System.out.println("My job is QA");

	}
			}


