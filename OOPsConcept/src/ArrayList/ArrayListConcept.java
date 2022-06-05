package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add(100);  // 0
		ar.add(200);  // 1
		ar.add(300);  // 2
		ar.add(400);  // 4
		System.out.println(ar.size());
		ar.add("Ashu"); // 5
		ar.add("Tom");  // 6
		System.out.println(ar.size());
		System.out.println(ar.get(5));
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		

	}

	

}

