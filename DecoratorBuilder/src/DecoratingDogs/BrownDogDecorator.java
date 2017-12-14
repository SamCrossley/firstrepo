package DecoratingDogs;

public class BrownDogDecorator extends DogDecorator {

	public BrownDogDecorator(Dog decoratedDog) {
		super(decoratedDog);
	}
	
	@Override
	public void draw() {
		decoratedDog.draw();
		setBrownFur(decoratedDog);
		
	}
	
	private void setBrownFur(Dog decoratedDog) {
		System.out.println("Fur Colour: Brown");
	}
}
