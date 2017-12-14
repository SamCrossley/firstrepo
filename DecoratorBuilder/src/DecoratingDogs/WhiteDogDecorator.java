package DecoratingDogs;
public class WhiteDogDecorator extends DogDecorator {
	public WhiteDogDecorator(Dog decoratedDog) {
		super(decoratedDog);
	}

	@Override
	public void draw() {
		decoratedDog.draw();
		setWhiteFur(decoratedDog);

	}

	private void setWhiteFur(Dog decoratedDog) {
		System.out.println("Fur Colour: White");
	}
}
