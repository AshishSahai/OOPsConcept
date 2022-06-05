package Inheritence;

public class Leopard extends Tiger{
	@Override
	void Bite() {
		System.out.println("Bite the prey but not like tiger.");
	}
	@Override
	void Run() {
		System.out.println("Run fast not like Tiger.");
	}
	@Override
	void Stealth() {
		System.out.println("Hide and attack but not like tiger.");
	}
	
	void ClimbTrees() {
		System.out.println("Can climb trees.");
	}

}
