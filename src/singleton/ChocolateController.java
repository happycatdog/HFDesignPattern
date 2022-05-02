package headfirst.designpatterns.singleton.chocolate;
 
public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		boiler2.fill();
		boiler2.boil();
		boiler2.drain();
		
		NotSingletonChocolateBoiler notSboiler = new NotSingletonChocolateBoiler();
		notSboiler.fill();
		notSboiler.boil();
		notSboiler.drain();
		
//		NotSingletonChocolateBoiler notSboiler2 = new NotSingletonChocolateBoiler();
//		notSboiler2.fill();
//		notSboiler2.boil();
//		notSboiler2.drain();
	}
}