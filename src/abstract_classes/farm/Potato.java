package abstract_classes.farm;

public class Potato extends Animal{

	@Override
	String makeNoise() {
		
		return "plop";
	}

	@Override
	boolean canFly() {
		
		return true;
	}

}
