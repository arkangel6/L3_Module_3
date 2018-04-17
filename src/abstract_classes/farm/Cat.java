package abstract_classes.farm;

public class Cat extends Animal{

	@Override
	String makeNoise() {
		
		return "meow";
	}

	@Override
	boolean canFly() {
		
		return false;
	}

}
