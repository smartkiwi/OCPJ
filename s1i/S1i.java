/*
1.i. Write a program that has variables of all four scopes:
	default
	public
	private
	protected
Try to access them out of their scope.
	default
		from another class, same package
		from another class, different package
		from inherited class, same package
		from inherited class, different package
	public
		from another class, same package
		from another class, different package
		from inherited class, same package
		from inherited class, different package
	private	
		from another class, same package
		from another class, different package
		from inherited class, same package
		from inherited class, different package
	protected
		from another class, same package
		from another class, different package
		from inherited class, same package
		from inherited class, different package	
*/

import package1.*;
import package2.AccessTypes;
import package2.*;

class S1i {
	public static void main(String[] args) {
		System.out.println("should be same package. same class");
		AccessTypes at = new AccessTypes();
		at.method();

		System.out.println("should be same package. different class");
		SamePackage sp = new SamePackage();
		sp.method();
		

		
		System.out.println("Different (unnamed) package. Different class:");
		//cannot access default var from outside of package - compiler error
		//System.out.println("\tdefaultVar: "+at.defaultVar);
		System.out.println("\tpublicVar: "+at.publicVar);
		//cannot access private var : compiler error
		//System.out.println("\tprivateVar: "+at.privateVar);
		//cannot access protected from outside package
		//System.out.println("\tprotectedVar: "+at.protectedVar);
		
		
		System.out.println("should be different package. different class");
		//no need to specify package1 - if imaport package1.*; was used
		OtherPackageClass opc = new OtherPackageClass();
		opc.tryToAccess();
		
		
		System.out.println("should be different package. Child class");
		ChildClass cp = new  ChildClass();
		cp.tryToAccess();

		System.out.println("should be same package. Child class");
		SamePackageChildClass spcp = new  SamePackageChildClass();
		spcp.tryToAccess();
		
		
	}
}


