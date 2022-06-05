package Inheritence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.Stealth();
		c.LightWeight();
		c.EatRats();
		c.Run();
		c.ClimbTrees();
		Tiger t = new Cat(); //Dynamic Polymorphism
		t.Stealth();
		Leopard l = new Cat();
		l.Bite();
		l.Run();
		
		

	}

}
