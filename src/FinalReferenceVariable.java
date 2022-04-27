
public class FinalReferenceVariable {

	public static void main(String[] args) {
		
		final StringBuilder builder = new StringBuilder("Tech");
		
		System.out.println(builder);
		
	    // changing internal state of object reference by final reference variable builder
		builder.append("Big Tech");
		
		System.out.println(builder);

	}

}
