package practice;

public class Statements {

	public static void main(String[] args) {
		//Arrays
		
		//To declare datatype of array
				String[] day={"Monday","Tuesday","Wednesday","Thursday"};
				
				
				//To assign value to each element
						day[0]="Monday";
						day[1]="Tuesday";
						day[2]="Wednesday";
						day[3]="Thursday";
				
				//to store length into variable
				int a=day.length;
				System.out.println(a);
				
				// To fetch values from any array with the help of For loop
				for (String b: day) {
					System.out.println(b); 
					

		
		
			// 2d arrays
			/* sal      deptno   
			 * 2000       10
			 * 3000       20
			 * 5000       40*/
			int [][] emp=new int [3][3];
			emp[0][0]=2000;
			emp[1][0]=3000;
			emp[2][1]=5000;
			emp[0][1]=10;
			emp[1][1]=20;
			emp[2][1]=40;
			System.out.println("First row is "+ emp[0][0]);
			System.out.println("Second row is "+ emp[1][0]);
			System.out.println("Third row is "+ emp[2][1]);
			System.out.println("First column is "+ emp[0][1]);
			System.out.println("Second column is "+ emp[1][1]);
			System.out.println("Third column is "+ emp[2][1]);
			
			
			
			
			
			
			
			
		
				}
		
		}}


