package sankha_java;

public class Student {  // another class
	int id;
	String name;
	Address address; // aggregation (entity reference of Address class)
	public Student (int id,String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() { // method
		System.out.print(id+ " " + name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		Address address1 = new Address("cob","wb","india");
		Address address2 = new Address("kol","wb","india");
		Student s1 = new Student(12,"Sankhajit ",address1);
		Student s2 = new Student(13,"Sanju ",address2);
		s1.display();
		s2.display();
	}
	
}
