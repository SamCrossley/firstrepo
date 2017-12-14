package DecoratingDogs;
public abstract class DogDecorator implements Dog {
	   protected Dog decoratedDog;

	   public DogDecorator(Dog decoratedDog){
	      this.decoratedDog = decoratedDog;
	   }

	   public void draw(){
	      decoratedDog.draw();
	   }

}
