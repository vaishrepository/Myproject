package oop;

public abstract class Phone {
    //cannot create object of abstract class
	abstract void connectcall();
	//Phone a=new Phone();
	
	//can create constructor of abstract class
	public Phone() {
	System.out.println("Abstract class constructor");
	}
	
	//0-100% abstraction
	public void details() {
	System.out.println("Abstract class method with body");
	}
}
