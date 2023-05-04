package org.tiket;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] preferiteFood = { "zucchine", "carbonara", "frittata", "amatriciana", "patatine fritte" };
		
		System.out.println("lunghezza: " + preferiteFood.length);
		System.out.println("primo piatto: " + preferiteFood[0]);
		System.out.println("ultimo piatto: " + preferiteFood[preferiteFood.length -1]);
		
		if(preferiteFood.length % 2 != 0) {
			
			System.out.println("piatto intermedio: " + preferiteFood[preferiteFood.length /2]);
		}
	}
}
