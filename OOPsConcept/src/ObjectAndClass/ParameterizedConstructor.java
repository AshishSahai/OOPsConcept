package OopPart1;

class Addition{
	int num1, num2;// data members of the class
	
	//data members are initialized with the values of arguments passed while creating the object 
	Addition(int num1, int num2){
		//this.num1=num1;
		this.num2=num2;
		System.out.println(num1);
		
	}
}



public class ParameterizedConstructor {

	public static void main(String[] args) {
		// This would invoke the parameterized constructor
		Addition add = new Addition(20, 30);
		System.out.println(add.num2);
	}

}
