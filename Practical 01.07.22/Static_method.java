/*
@author Sankhait Roy
*/
// Static Method
public class Static_method {
	
	int rollno;
	String name;
	static String college = "IMPS JPG";  // static variable
	static void change() {    // static method
		college = "IMPS Malda";
	}
	
	Static_method(int r, String n){   // constructor 
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
			Static_method.change();   // call the static method
			Static_method s1 = new Static_method(105,"Ankit");   // object
			Static_method s2 = new Static_method(109,"Anik");    // object
			s1.display();
			s2.display();

	      }
      }
	
}
