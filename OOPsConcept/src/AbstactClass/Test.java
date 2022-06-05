package AbstactClass;

public class Test extends Shape{
	Test(){
		System.out.println("Constructor--- Test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape t = new Test();
		t.fill();
		t.draw();
		System.out.println(Shape.min_bal);
		

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw");
		
	}

}
