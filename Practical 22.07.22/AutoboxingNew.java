package WrapperClass;
// collection framework (ArrayList)
import java.util.ArrayList;

public class AutoboxingNew {

	public static void main(String[] args) {
		// create a integer type of object
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 
		
		// adding primitive int primitive type value by using add() method
		a1.add(1);
		a1.add(2);
		a1.add(3);   // auto boxing
		System.out.println("List: "+ a1);
	}

}
