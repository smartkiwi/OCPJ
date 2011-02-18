package package2;

public class SamePackage {
	public void method() {
		AccessTypes at = new AccessTypes();
		//at.method();
		
		System.out.println("Same package. Different class:");
		System.out.println("\tdefaultVar: "+at.defaultVar);
		System.out.println("\tpublicVar: "+at.publicVar);
		//cannot access private var : compiler error
		//System.out.println("\tprivateVar: "+at.privateVar);
		System.out.println("\tprotectedVar: "+at.protectedVar);
	}
}