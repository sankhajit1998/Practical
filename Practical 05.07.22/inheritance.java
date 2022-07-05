/*
@author Sankhajit Roy
*/
// simple inheritance of classes


public class inheritance {   // parent class/base class
	float salary = 40000;

}
class Inherit extends inheritance{   // child class/extend class
	int bonus = 10000;
	public static void main(String[] args) {
		Inherit i = new Inherit();       // object of child class
		System.out.println("Salary is "+ i.salary);
		System.out.print("Bonus is "+ i.bonus);
	}
}
