
public class Copy_cons {
	private String name;     // instance variable
	private double marks;
	
	Copy_cons(String name, double marks){   // constructor
		this.name=name;
		this.marks=marks;
	}
	Copy_cons(Copy_cons c){   // copy constructor
		
		this.name = c.getName();    // getters & setters
		this.marks= c.getMarks();   // getters & setters
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks=marks;
	}
}

class Copy_cons1{
	public static void main(String[] args) {
		Copy_cons c1 = new Copy_cons("Sankha",65);   // object
		Copy_cons copy = new  Copy_cons(c1);    // read the input
		c1.setName("Prasanta");   // clone the name
		c1.setMarks(75);   // clone the marks
		
		System.out.println("Student is "+c1.getName()+"& Marks is "+c1.getMarks());
		System.out.println("Student is "+copy.getName()+"& Marks is "+copy.getMarks());
	}
}
