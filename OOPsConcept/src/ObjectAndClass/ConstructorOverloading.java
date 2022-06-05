package OopPart1;

class addition{
	String name;
	//The Constructor would initialize the data members with the  
	//arguments passed while creating the object of that class.
	//Constructor with one argument
	addition(String n){
		this.name=n;
		System.out.println(n);
	}
	
	//Constructor with 2 different arguments
	addition(String s, int t){
		System.out.println(s+t);
	}
	
	// Constructor with one argument, like previous but with different data type
	addition(long dm){
		System.out.println(dm);
	}
}



public class ConstructorOverloading {

	public static void main(String[] args) {
		// This would invoke the constructor
		addition add1 = new addition("Sahai");
		addition add2 = new addition("I am perfect ", 10);
		addition add3 = new addition(20101882);
		System.out.println(add1.name);

	}

}
