package headfirst.designpatterns.singleton.chocolate;

public class ChocolateBoilerDCL {
	   private boolean empty;
	    private boolean boiled;
	    private volatile static ChocolateBoilerDCL uniqueInstance;

	    private ChocolateBoilerDCL() {
	        empty = true;
	        boiled = false;
	    }

	    public static ChocolateBoilerDCL getInstance() {
	        if (uniqueInstance == null) {
	            synchronized (ChocolateBoilerDCL.class) {
	                if (uniqueInstance == null) {
	                    uniqueInstance = new ChocolateBoilerDCL();
	                }
	            }
	        }
	        return uniqueInstance;
	    }
}