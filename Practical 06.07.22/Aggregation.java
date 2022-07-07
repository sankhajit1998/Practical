
public class Aggregation {  // class 1
	int square(int n) {
		return n*n;  // side*side
	}
}
class circle{    // class 2
	Aggregation ag;    // aggregation object (entity reference variable) line 1
	double pi = 3.14;
	double area (int radius) {
		ag = new Aggregation();  // object line 2
		int psquare = ag.square(radius);
		return pi*psquare;
	}
	public static void main(String[] args) {  // main method
		circle c = new circle();
		double result = c.area(5);   // pi*radius*radius = 3.14*5*5
		System.out.println(result);
	}
}
