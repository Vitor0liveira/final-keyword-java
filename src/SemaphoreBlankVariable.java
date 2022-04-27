
public class SemaphoreBlankVariable {
	
	/*
	 * Error IDE: The blank final field colorSemaphore may not have been 
	 * initialized
	 */
	final String colorSemaphore;
	
	SemaphoreBlankVariable(String color) {
		colorSemaphore = color;
	}
	
	void getDetails() {
		System.out.println("Currently color: " + colorSemaphore);
	}
	
	public static void main(String[] args) {
		SemaphoreBlankVariable blankVariable = new SemaphoreBlankVariable("RED");
		blankVariable.getDetails();
	}

}
