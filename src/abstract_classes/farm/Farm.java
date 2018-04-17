package abstract_classes.farm;

import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Animal p = new Pig();
		Animal c = new Cow();
		Animal d = new Dog();
		Animal ca = new Cat();
		Animal b = new Bird();
		Animal w = new Whale();
		Animal po = new Potato();
		
		farm.add(p);
		farm.add(c);
		farm.add(d);
		farm.add(ca);
		farm.add(b);
		farm.add(w);
		farm.add(po);
		
		for(Animal a : farm) {
			System.out.println(" Noise: " + a.makeNoise() + " Can fly? " + a.canFly());
		}
		
	}
}
