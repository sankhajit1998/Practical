package NewJava;

/*
@author Sankhajit Roy
*/

//example of runtime polymorphism

public class Shape_poly {   // parent class
	void draw(){    //  method
	}
}
class Triangle extends Shape_poly{   // child class1
	void draw() {    //  method
		System.out.println("This is a Triangle1");
	}
}
class Square extends Shape_poly{     // child class2
	void draw() {    //  method
		System.out.println("This is a Square1");
	}
}

class Circale extends Shape_poly{    // child class3
	void draw() {   //  method
		System.out.println("This is a Circale1");
	}
}

class All_shapes{    // main class
	public static void main(String[] args) {    //  main method
		Triangle obj1 = new Triangle();   // object for child class1
		Square obj2 = new Square();       // object for child class2
		Circale obj3 = new Circale();     // object for child class3
		obj1.draw();   // called the method
		obj2.draw();   // called the method
		obj3.draw();   // called the method
	}
	
}