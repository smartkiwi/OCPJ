package package1;

import package2.AccessTypes;

public class OtherPackageClass {

	public void tryToAccess() {
	
		//class from package cannot access classes in unnamed package
		AccessTypes at = new AccessTypes();
		//at.method();
	
		System.out.println("Different (package1) package. Different class:");
		//other package - cannot access
		//System.out.println("\tdefaultVar: "+at.defaultVar);
		System.out.println("\tpublicVar: "+at.publicVar);
		//cannot access private var : compiler error
		//System.out.println("\tprivateVar: "+at.privateVar);
		//other package - cannot access
		//System.out.println("\tprotectedVar: "+at.protectedVar);		
		
		
	}
	
}


