package NewJava;

/*
@author Sankhajit Roy
*/

// encapsulation example

public class Bank_Details {
	private String name;   // private data member
	private String email;  // private data member
	private int acctNum;   // private data member
	private int amount;    // private data member
	
	public String getName() {   // getter method
		return name;
	}
	public void setName(String name) {    // setter method
		this.name = name;
	}
	
	public String getEmail() {   // getter method
		return email;
	}
	public void setEmail(String email) {    // setter method
		this.email = email;
	}
	
	public int getAccount() {   // getter method
		return acctNum;
	}
	public void setAccount(int acctNum) {  // setter method  
		this.acctNum = acctNum;
	}
	
	public int getAmount() {   // getter method
		return amount;
	}
	public void setAmount(int amount) {    // setter method
		this.amount = amount;
	}
}

class Account{    // main class
	public static void main(String[] args) {   // main method
		Bank_Details obj = new Bank_Details();   // object
		obj.setName("Sankhajit Roy");
		System.out.println("Name: "+obj.getName());
		
		obj.setEmail("sankha@gmail.com");
		System.out.println("Email: "+obj.getEmail());
		
		obj.setAccount(2585522);
		System.out.println("Account Number: "+obj.getAccount());
		
		obj.setAmount(4500);
		System.out.println("Amount: "+obj.getAmount());
	}
}
