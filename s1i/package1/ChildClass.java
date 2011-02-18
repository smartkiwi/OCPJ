package package1;


import package2.*;




public class ChildClass extends AccessTypes {
	public void tryToAccess() {
		System.out.println("different package. Child class:");
		//cannot access protected var
		//System.out.println("\tdefaultVar: "+defaultVar);
		System.out.println("\tpublicVar: "+publicVar);
		//cannot access private var
		//System.out.println("\tprivateVar: "+privateVar);
		//cannot access protected var
		System.out.println("\tprotectedVar: "+protectedVar);
	}
}