/*
@Author Sankhajit Roy
*/

// Parameterized constructor


class Para_cons {    // class
	String name;     // variable type
	Para_cons(String name1){   // parameterized constructor
		name = name1;
		System.out.println("Cons Called");
		
	}
	public static void main(String[] args) {   //  main method
		Para_cons obj = new Para_cons("Java");    // object 1
		Para_cons obj1 = new Para_cons("C++");    // object 2
		Para_cons obj2 = new Para_cons("C");      // object 3
		System.out.println("This name is " + obj.name);
		System.out.println("This name is " + obj1.name);
		System.out.println("This name is " + obj2.name);
	}
}
