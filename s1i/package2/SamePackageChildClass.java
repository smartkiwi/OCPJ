package package2;




public class SamePackageChildClass extends AccessTypes {
	public void tryToAccess() {
		System.out.println("same package. Child class:");
		System.out.println("\tdefaultVar: "+defaultVar);
		System.out.println("\tpublicVar: "+publicVar);
		//cannot access private var
		//System.out.println("\tprivateVar: "+privateVar);		
		System.out.println("\tprotectedVar: "+protectedVar);
	}
}