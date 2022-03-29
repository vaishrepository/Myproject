package oop;

public class Samsung extends Phone {

	public static void main(String[] args) {
		Samsung b=new Samsung();
		b.details();
		b.connectcall();

	}

	@Override
	void connectcall() {
		System.out.println("Samsung logic to connectcall");
		
	}

}
