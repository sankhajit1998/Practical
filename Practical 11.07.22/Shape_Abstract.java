package NewJava;

/*
@author Sankhajit Roy
*/

// Abstract class

abstract class Shape_Abstract {   // abstract class
	abstract void draw();   // abstract method
}
class Triangle1 extends Shape_Abstract{   // child class1
	void draw() {    //  method
		System.out.println("This is a Triangle 1");
	}
}
class Square1 extends Shape_Abstract{     // child class2
	void draw() {    //  method
		System.out.println("This is a Square 1");
	}
}

class Circale1 extends Shape_Abstract{    // child class3
	void draw() {   //  method
		System.out.println("This is a Circale 1");
	}
}

class Shapes{    // main class
	public static void main(String[] args) {    //  main method
		Triangle1 obj1 = new Triangle1();   // object for child class1
		Square1 obj2 = new Square1();       // object for child class2
		Circale1 obj3 = new Circale1();     // object for child class3
		obj1.draw();   // called the method
		obj2.draw();   // called the method
		obj3.draw();   // called the method
	}
	
}
