/*
@Author Sankhajit Roy
*/

// Default constructor

public class Default_cons {    // class

	public String name;    // public access modifier
	Default_cons(){    // default constructor
		System.out.println();
		name = "Sankhajit";    // took value
		}
	public static void main(String[] args) {
			Default_cons obj = new Default_cons();   // object
			System.out.println("The name is "+obj.name);
	}

}
