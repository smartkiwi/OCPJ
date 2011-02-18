/*
1.c. Create a class, 
	a subclass, and 
	a sub-subclass. 
	Create at least two constructors in each class and 
		use super() and 
		this() to access (one way or another) all of the constructors, 
		based on invoking new() on the grandchild class.
*/

/*
Solution:
1) every class has two constructors = one default and one with parameter
2) constructor with parameter should call default constructor
3) default constructor of non parent classes should call it's parents class constructor with parameter
4) first should be invoken grandchildren's constructor with parameter
*/


public class S1c {
	public static void main(String[] args) {

		System.out.println("creating object of GrandChildClass with constructor(String str)");
		GrandChildClass gcc1 = new GrandChildClass("TestString");
		System.out.println("calls count: (should be 6) "+CallsCounter.getCalls());

		System.out.println("");
		System.out.println("");
		CallsCounter.resetCounter();
		
		System.out.println("creating object of GrandChildClass with default constructor()");
		GrandChildClass gcc = new GrandChildClass();
		System.out.println("calls count: (should be 6) "+CallsCounter.getCalls());
		
		ChildProtectedMethod cpm = new ChildProtectedMethod();
		
	}
}

/* class with static members to be used for counting called methods
*/
class CallsCounter
{

	//static variable will be set to default int value = 0;
	static int calls;
	
	public static void incrementCalls() {
		calls++;
	}

	public static int getCalls() {
		return calls;
	}
	
	public static void resetCounter() {
		calls=0;
	}
}


class ParentClass {
	ParentClass() {
		CallsCounter.incrementCalls();
		System.out.println("ParentClass default constructor ()");
	}

	ParentClass(String str) {
		this();
		CallsCounter.incrementCalls();
		System.out.println("ParentClass constructor (String str): str="+str);
	}	
}

class ChildClass extends ParentClass {
	ChildClass() {
		super("String parameter");
		CallsCounter.incrementCalls();
		System.out.println("ChildClass default constructor ()");
	}
	ChildClass(String str) {
		this();
		CallsCounter.incrementCalls();
		System.out.println("ChildClass constructor (String str): str="+str);
	}
}

class GrandChildClass extends ChildClass {
	GrandChildClass() {
		super("String Parameter");
		CallsCounter.incrementCalls();
		System.out.println("GrandChildClass default constructor ()");
	}
	GrandChildClass(String str) {
		this();
		CallsCounter.incrementCalls();
		System.out.println("GrandChildClass constructor (String str): str="+str);
	}
}

class ProtectedMethod {
	ProtectedMethod() {
		System.out.println("from ProtectedMethod.ProtectedMethod()");
		//if default constructor loaded from child constructor - it will call child's method()
		this.method();
	}
	
	//if this method name called from child (even from super constructor) parent's method will be never called - child's method() will be executed
	void method() {
		
		System.out.println("ProtectedMethod.method()");
	}
}

class ChildProtectedMethod extends ProtectedMethod {
	ChildProtectedMethod() {
		super();
		//System.out.println("from ChildProtectedMethod.ChildProtectedMethod()");
		//method();
	}
	void method() {
		System.out.println("ChildProtectedMethod.method()");
	}
}