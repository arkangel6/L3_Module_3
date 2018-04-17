package abstract_classes.farm;

public class Pig extends Animal{

	@Override
	String makeNoise() {
		
		return "oink";
	}

	@Override
	boolean canFly() {
		
		return false;
	}

}
