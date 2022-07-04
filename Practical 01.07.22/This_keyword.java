/*
@author Sankhajit Roy
*/
// This keyword

public class This_keyword {
	
	int age;      // instance variable
	String name;  // instance variable
	float fee;    // instance variable
	
	This_keyword(int age, String name,float fee){   // constructor
		this.age = age;    // use this keyword
		this.name = name;  // use this keyword
		this.fee = fee;    // use this keyword
	}
	void display() {   // method
		System.out.println("Age is "+age);
		System.out.println("Name is "+name);
		System.out.println("Fees is "+fee);
	}
	public class This_keyword1{
		public static void main(String[] args) {
			This_keyword a1 = new This_keyword(104,"Sanjib",25000);  // object
			This_keyword a2 = new This_keyword(108,"Pritam",30000);  // object
			a1.display();   // call the method
			a2.display();   // call the method
		}
	}

}
