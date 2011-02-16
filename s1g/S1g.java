/*
1.g Create a class, a subclass, and a sub-subclass:
	Make overridden versions of methods in those classes
	Make an array of instances of the three and loop through them polymorphycally
*/

class S1g {
	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		ChildClass cc = new ChildClass();
		GrandChildClass gcc = new GrandChildClass();
		
		ParentClass[] polArray = new ParentClass[3];
		polArray[0] = pc;
		polArray[1] = cc;
		polArray[2] = gcc;
		
		System.out.println("First iteration");
		for (int i=0;i<polArray.length;i++) {
			polArray[i].parentMethod();
		}
		
		System.out.println("Second iteration");
		//if you try to use anything then ParentClass for c declaration - compiler will show error:
		//S1g.java:24: incompatible types
		//	found   : ParentClass
		//	required: ChildClass
		for (ParentClass c : polArray) {
			c.parentMethod();
		}
		
	}
}


class ParentClass {
	void parentMethod() {
		System.out.println("ParentClass:parentMethod");
	}
}

class ChildClass extends ParentClass {
	void parentMethod() {
		System.out.println("ChildClass:parentMethod");
	}
}

class GrandChildClass extends ChildClass {
	void parentMethod() {
		System.out.println("GrandChildClass:parentMethod");
	}
}
