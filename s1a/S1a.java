/*
1.a. Create an interface that has 
		methods and 
		a constant. 
	Create an abstract class with 
		an abstract method, 
		a non-abstract method, and 
		an instance variable. 
	Create a concrete class that uses both of the above.
*/

interface S1AInterface {
//these two methods are always public
	void method1();
	void method2();
//this is constant (public final) - trying to change it  will cause to compiler error
	int ifConstant = -123;
}

abstract class S1AAbstractClass {
	abstract void abstractMethod();
	int instanceVar = 431;
	void method() {
		System.out.println("AbstractClass:: I'm non-abstract methood S1AAbstractClass::method()");
		instanceVar++;
	}
}

//there should be only one public class in <FileName>.java file. It's name(without extension) should match the class name
public class S1a extends S1AAbstractClass implements S1AInterface {
	public static void main(String[] args) {
		System.out.println("S1a:main started");		
		S1a inst = new S1a();
		System.out.println("contant value: "+S1a.ifConstant);
		System.out.println("instance value: "+inst.instanceVar);
		inst.method();
		inst.method1();
		inst.method2();
		inst.abstractMethod();
		inst.instanceVar+=10;
		System.out.println("updated instance value: "+inst.instanceVar);
		//the following will not compile: S1a.java:40: cannot assign a value to final variable ifConstant
		//S1a.ifConstant++;
	}

//method1 implemented from interface method - thus should be public	
	public void method1() {
		System.out.println("S1a:method1 implementation of interface S1AInterface:method1");
	}

	public void method2() {
		System.out.println("S1a:method2 implementation of interface S1AInterface:method2");
	}
	
	void abstractMethod() {
		System.out.println("S1a:abstractMethod implementation of S1AAbstractClass:abstractMethod()");
	}	
}