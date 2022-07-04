/*
@author Sankhajit Roy
*/
// Static Variable

public class Static_var {
	
	int rollno;
	String name;
	static String college = "IMPS";  // static variable
	
	Static_var(int r, String n){   // constructor 
		rollno = r;
		name = n;
	}
	
	void display() {   // method
		System.out.println("Roll number: "+rollno); 
		System.out.println("Student name: "+name);
		System.out.println("College name: "+college);
	}
	
	public class Static{
		public static void main(String[] args) {
		Static_var s1 = new Static_var(101,"Sankha");   // object
		Static_var s2 = new Static_var(102,"Arnav");    // object
		s1.display();
		s2.display();

	      }
      }
	
}
