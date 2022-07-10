// Type promotion

package sankha_java;

public class TypePromotion {  // class
	void add(int a, long b) {  // method 1
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {  // method 2
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {  // main method
		TypePromotion obj = new TypePromotion(); // object 
		obj.add(30, 15);
		obj.add(20, 30, 40);
		
	}

}
