package OopPart1;

class Tom{
	int id;
	String name;
	//Constructor called at the time of object creation
	Tom(String name){
		System.out.println("Geeks");
		this.name= name;
	}
}




public class Constructor {

	private static Tom t;

	public static void main(String[] args) {
		t = new Tom("Ashish");
		System.out.print(t.name);

	}

}
