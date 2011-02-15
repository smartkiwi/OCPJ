/*
Section 1: Declarations, Initialization, Scoping
1.b. Create a directory structure, and 
	a couple of classes, in different packages, 
		to demonstrate the differences between 
			default and protected access rules.
*/

import package1.*;
import package2.*;


//child class that inherits and uses protected method
class InheritedProtectedClass extends ProtectedClass {
	void childClassMethod() {
		System.out.println("Here I'll use protected inherited method() from child class");
		inheritedMethod();
	}
}

public class S1b {
	public static void main(String[] args) {
		System.out.println("S1b task");
		//the following won't work cannot access class with default access from outside package
		//the following compiler error generated: 
		//package2.DefaultClass is not public in package2; cannot be accessed from outside package
		//DefaultClass dc = new DefaultClass();
		
		//the following won't work cannot access class with protected access from outside package
		//compiler error: package1.ProtectedClass is not public in package1; cannot be accessed from outside package
		//ProtectedClass pc = new ProtectedClass();
		
		
		//you can access only childclass that is accessible to current scope
		InheritedProtectedClass ipc = new InheritedProtectedClass();
		//you cannot access protected method from outside of inherited class:
		//Compiler error: method() has protected access in package1.ProtectedClass
		//ipc.inheritedMethod();
		ipc.childClassMethod();
		
	}
}

