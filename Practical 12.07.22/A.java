package NewJava;

/*
@author Sankhajit Roy
*/

public interface A {     // parent interface
	void a();    // method
	void b();    // method
	void c();    // method
	void d();    // method
	
}

abstract class B implements A{      // abstract class
	public void c() {    //  method
		System.out.println("C");
	}
}

class C extends B {    // child class
	public void a() {         // method
		System.out.println("A");
	}
	public void b() {         // method
		System.out.println("B");
	}
	public void d() {         // method
		System.out.println("D");
	}
}

class test01{    // main class
	public static void main(String[] args) {    // main method
		C obj = new C();
		obj.a();     // called method   
		obj.b();     // called method
		obj.c();     // called method
		obj.d();     // called method
	}
}

