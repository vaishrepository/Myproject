package pack1;

public class Practice1 {

    //method overloading 
	public static void main(String[] args) {
		Practice1 obj=	new Practice1();
		  System.out.println(obj.multiply(5, 3));
		  
		  System.out.println(obj.multiply(6, 3, 9));
	
	}
	
	public int multiply(int a,int b) {
		int c=a*b;
		return c;
	}
	

public int multiply(int a,int b,int d) {
		int c=(a*b)/d;
		return c;

	}
}

	

	
	
	
	
	
	
	
	
	
	
	
	

