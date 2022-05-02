package headfirst.designpatterns.singleton.chocolate;

public class NotSingletonChocolateBoiler {
	    private boolean empty;
	    private boolean boiled;
	    
	    public NotSingletonChocolateBoiler() {
	        empty = true;
	        boiled = false;
	        System.out.println("Creating unique instance of Chocolate Boiler");
	    }
	    
	    public void fill() {
	        if (isEmpty()) {
	            empty = false;
	            boiled = false;
	        }
	    }
	    
	    public void drain() {
	        if (!isEmpty() && isBoiled()) {
	            empty = true;
	        }
	    }
	    
	    public void boil() {
	        if (!isEmpty() && isBoiled()) {
	            boiled = true;
	            System.out.println("Returning instance of Chocolate Boiler");
	        }
	    }
	    public boolean isEmpty() {
	        return empty;
	    }
	    public boolean isBoiled() {
	        return boiled;
	    }
}
