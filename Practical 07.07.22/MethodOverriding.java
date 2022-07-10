package sankha_java;

class car{   // parent class
	void run() {
		System.out.println("running mode on.");
	}
}

public class MethodOverriding {   // child class
	void run() {
		System.out.println("bike running mode on.");
	}
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.run();
	}

}
