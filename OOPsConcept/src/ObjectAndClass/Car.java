package ObjectAndClass;

public class Car {
	int model;
	int wheel;
	
	

	public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model=2015;
		a.wheel=4;
		b.model=2016;
		b.wheel=6;
		c.model=2018;
		c.wheel=5;
		
		System.out.print(a.model);

	}

}
