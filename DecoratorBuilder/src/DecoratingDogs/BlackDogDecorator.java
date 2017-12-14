package DecoratingDogs;

public class BlackDogDecorator extends DogDecorator{
	public BlackDogDecorator(Dog decoratedDog) {
		super(decoratedDog);
	}
	
	@Override
	public void draw() {
		decoratedDog.draw();
		setBlackFur(decoratedDog);
		
	}
	
	private void setBlackFur(Dog decoratedDog) {
		System.out.println("Fur Colour: Black");
	}
}


