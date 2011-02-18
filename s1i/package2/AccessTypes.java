package package2;

//class should be public to be accessible from other classes
public class AccessTypes {
	int defaultVar;
	public int publicVar;
	private int privateVar;
	protected int protectedVar;
	
	public void method() {
		System.out.println("Accessing vars from inside the class:");
		System.out.println("\tfrom the class: defaultVar: "+defaultVar);
		System.out.println("\tfrom the class: publicVar: "+publicVar);
		System.out.println("\tfrom the class: privateVar: "+privateVar);
		System.out.println("\tfrom the class: protectedVar: "+protectedVar);
	}
}



