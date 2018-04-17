package abstract_classes.farm;

public class Dog extends Animal{

	@Override
	String makeNoise() {
		
		return "woof";
	}

	@Override
	boolean canFly() {
	
		return false;
	}

}
