package DecoratingDogs;

public class DecoratorPattern {
	
	public static void main(String[] args) {
		
	      Dog lab = new Labrador();

	      Dog brownLab = new BrownDogDecorator(new Labrador());
	      
	      Dog blackBernard = new BlackDogDecorator(new StBernard());

	      Dog whiteCollie = new WhiteDogDecorator(new Collie());
	      
	      Dog blackLab = new BlackDogDecorator(new Labrador());
	      System.out.println("Generic Labrador");
	      lab.draw();

	      System.out.println("\n Labrador with brown fur");
	      brownLab.draw();

	      System.out.println("\n St. Bernard with Black fur");
	      blackBernard.draw();
	      
	      System.out.println("\n Collie with white fur");
	      whiteCollie.draw();
	      
	      System.out.println("\n Labrador with black fur");
	      blackLab.draw();
	      
	   }

}
