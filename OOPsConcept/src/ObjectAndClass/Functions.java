package ObjectAndClass;

public class Functions {
	public void NoInNoOp() {
		System.out.print("No Input No Output");
	}
	public int NoInOp() {
		System.out.print("No Input some Output");
        int a=10,b=20;
		int c= a+b;
		return c;
	}
	public int InOp(int a, int b) {
		System.out.print("Some Input some Output");
		int c= a*b;
		
		return c;
	}

	public static void main(String[] args) {
		Functions ob = new Functions();
		Functions ob1 = new Functions();
		Functions ob2 = new Functions();
		ob.NoInOp();
		
		

	}

}
