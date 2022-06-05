package AbstactClass;

public abstract class Shape {
	Shape(){
		System.out.println("Constructor--- Shape");
	}
	static int min_bal=50;
	public abstract void draw();
	public void fill() {
		System.out.println("Fill");
	}

}
