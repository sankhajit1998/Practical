// Method overloading: Changing no. of arguments / Changing of data type

package sankha_java;

public class method_overloading {    // class
	static int add(int a, int b) {    // no. of arguments 2 in method
		return (a+b);
	}
	static int add(int a, int b, int c) {   // changing no. of arguments 3 in method
		return (a+b+c);
	}
	static float add(float a, float b) {   // changing data type in method
		return (a+b);
	}
	
	class overloading{  // main class
		public static void main(String[] args) {  // methods
			System.out.println(method_overloading.add(15, 10));
			System.out.println(method_overloading.add(25, 20, 15));
			System.out.println(method_overloading.add(15, 15));
		}
	}
}
