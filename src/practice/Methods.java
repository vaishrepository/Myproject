package practice;

public class Methods {
static int b=10;
	public static void main(String[] args) {
	
		
		Methods obj =new Methods();
		obj.details();
		
		System.out.println(obj.marks());
		System.out.println(obj.sum(2,3));
		 
		//direct calling
		marks();
		//call it with class name
		Methods.marks();
		System.out.println(Methods.b);
		
		 

	}
	
	// method without return type
		//access modifier return type name of method(){           }
			
   public void details() {
	   System.out.println("Employee details");
	   
   }
   
   //method with return type
   
   public static int marks() {  
	  int a=1000;
	 return a;
	    
   }
 // method with return type and with parameter/arguments sum(2,3)=5
   
   public int sum(int a, int b) {
	   int result=a+b;
	   return result;
	   
	   
   }
   
   
   
	
}
