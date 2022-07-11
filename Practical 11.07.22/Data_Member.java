package NewJava;

/*
@author Sankhajit Roy
*/

// polymorphism using the data member 

public class Data_Member {   //  parent class
	int CarSpeed = 80;   //  data member

}
class CarName extends Data_Member{  //  child class
	int CarSpeed = 90;   //  data member
	public static void main(String[] args) {  // main method
		CarName obj = new CarName();    // object
		System.out.println(obj.CarSpeed);
	}
}
