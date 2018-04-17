package abstract_classes.farm;

public class Cow extends Animal{

	@Override
	String makeNoise() {
		
		return "moo";
	}

	@Override
	boolean canFly() {
		
		return false;
	}

}
