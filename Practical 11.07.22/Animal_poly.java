package NewJava;

/*
@author Sankhajit Roy
*/

// example of runtime polymorphism

public class Animal_poly {      // parent class
	void food() {    //  method 
	}
}
class Dog extends Animal_poly{    // child class1
	void food() {    // method
		System.out.println("Dog eats Bone.");
	}
}
class Goat extends Animal_poly{    // child class2
	void food() {    // method
		System.out.println("Goat eats Grass.");
	}
}

class Cat extends Animal_poly{     // child class3
	void food() {    // method
		System.out.println("Cat eats Milk.");
	}
}

class All_food{   // main class
	public static void main(String[] args) {    //  main method
		Dog obj1 = new Dog();     // object for child class1
		Goat obj2 = new Goat();   // object for child class2
		Cat obj3 = new Cat();     // object for child class3
		obj1.food();   // called the method
		obj2.food();   // called the method
		obj3.food();   // called the method
	}
	
}