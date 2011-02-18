/*
1.h Create a class that has 
	a static inner class 
	and a method local inner class. 
Make instances of each class. 
Create code that accesses the inner classes’ members from the outer class. 
Create a code that accesses the outer class’s members from within the inner classes.
*/

/*
Inner class member has full access to outer class members
OuterClass has access to inner class members
Also inner class can be access from outside of OuterClass - both static and instance members
	but only static inner class can have static members that can be accessed
*/

class S1h {
	public static void main (String [ ] args) {
		//calling static method of static inner class from outside
		OuterClass.InnerClass.staticMethod();
		
		
		
		//defining and instantiating inner class
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		//calling inner class instance method
		ic.instanceMethod();
		
		ic.methodAccessOuter();
		
		
		//you cannot call static member of non static inner class. Compiler won't let you have one
		//OuterClass.NonStaticInnerClass.staticMethod();
		
		
		OuterClass.staticMethod();
		
		
		OuterClass c = new OuterClass();
		c.instanceMethod();
		c.methodWithInnerClass();
		
		
	}
}


class OuterClass {
	//static inner class
	static class InnerClass {
		static void staticMethod() {
			System.out.println("OuterClass.InnerClass.staticMethod() - static inner class method");
		}
		
		//instance method of static inner class - cannot be executed
		void instanceMethod() {
			System.out.println("OuterClass.InnerClass.instanceMethod() - static inner class method");
		}
		
		void methodAccessOuter() {
			System.out.println("InnerClass.methodAccessOuter() - access to outer class member");
			OuterClass.staticMethod();
			
			OuterClass oc = new OuterClass();
			oc.instanceMethod();
		}
	}
	
	//non static inner class
	class NonStaticInnerClass {
		//non static inner class cannot have static member
		//Compiler error: inner classes cannot have static declarations
		/*
		static void staticMethod() {
			System.out.println("OuterClass.NonStaticInnerClass.staticMethod() - static inner class method");
		}
		*/
		
		//instance method of static inner class - cannot be executed
		void instanceMethod() {
			System.out.println("OuterClass.NonStaticInnerClass.instanceMethod() - static inner class method");
		}
	}

	
	static void staticMethodWithInnerClass() {
		//you cannot have static in method innerclass - even in static method
		class InMethodInnerClass {
		}
	}	
	
	void methodWithInnerClass() {
		//you cannot have static in method innerclass 
		class InMethodInnerClass {
		}
		
		InMethodInnerClass ic = new InMethodInnerClass();
	}
	
	void instanceMethod() {
		System.out.println("OuterClass.instanceMethod() - regular instance method");
		
		System.out.println("accessing inner class members...");
		
		//you can access inner class with name of outerclass
		OuterClass.InnerClass.staticMethod();
		//or directly
		InnerClass.staticMethod();
		
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.instanceMethod();
	}
	
	static void staticMethod() {
		System.out.println("OuterClass.staticMethod() - static method");
	}
	
}