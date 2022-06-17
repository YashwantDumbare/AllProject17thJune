package packageone;

public class Method1 {
	//public static void main(String[] args) {
	
	public static void printDetails(int age, int salary) {
		System.out.println("Hi, Good morning Everyone");
		System.out.println("Staying in Pune");
		System.out.println("I am "+age+" yrs old");
		System.out.println("I am getting "+salary);
		//return;//optional because if you don't write it dn java compiler will write it
	}

	public static void main(String[] args) {
		
		printDetails(30, 96000);
		Method1.printDetails(25, 56000);
		printDetails(26, 45000);
		printDetails(24, 25000);
		printDetails(29, 75000);
		Method1.printDetails(28, 65000);
		printDetails(32, 85000);
		printDetails(31, 35000);
		Method1.printDetails(36, 55000);
		printDetails(23, 45202);
		
	}
	



}


