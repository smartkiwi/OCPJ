/*
1.d. Create a class that uses static initialization blocks, 
	instance initialization blocks and 
	a constructor, 
and prove the sequence in which they get called 
	when the class is invoked and 
	a new object is created.
*/

/*
Solution:
Static init blocks are executed when class was accessed first time - loaded. They are executed in the order in code
Instance ini blocks are executed when object instantiated BEFORE constructor - in the order they are in text
*/

class S1d {
	{
		System.out.println("Instance init block 1");
	}	

	static {
		System.out.println("Static init block 1");
	}
	public static void main(String[] args) {
	
		System.out.println("now creating new object");
		S1d c = new S1d();
		System.out.println("done creating new object");
		c.doSomething();
	}
	
	S1d()
	{
		System.out.println("default constructor");
	}
	
	void doSomething()
	{
		System.out.println("obj metohd: I did something");
	}
	
	static {
		System.out.println("Static init block 2");
	}	


	{
		System.out.println("Instance init block 2");
	}		
}