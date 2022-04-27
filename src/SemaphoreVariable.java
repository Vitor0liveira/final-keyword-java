
public class SemaphoreVariable {
	
	 // declaring and initializing a final variable
	final String colorSemaphore = "RED";
	
	void controlColor() {
	    /* Trying to change the value of the final variable will give an error in IDE
	     * 
	     * ERROR: "The final field Semaphore.colorSemaphore cannot be assigned"
	     */
//		colorSemaphore = "GREEN";
	
	}
	
	public static void main(String[] args) {
		SemaphoreVariable semaphore = new SemaphoreVariable();
		semaphore.controlColor();
	}

}
