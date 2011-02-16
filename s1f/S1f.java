/*
1.f Create an enum that has 
	a variable, 
	a constructor, 
	a method, and 
	a constant class body. 
Create a class that exercises each of the enum’s members.
*/

class S1f {
	TrainingEnum te = TrainingEnum.VAR1;
	public static void main(String[] args) {
		S1f c = new S1f();
		System.out.println(c.te);
		
		for (TrainingEnum te1 : TrainingEnum.values() ) {
			System.out.println(te1);
			System.out.println(te1.getVal());
		}
	}
}


enum TrainingEnum {
	//the list of enum constants should go exactly after enum opening
	VAR1(1), VAR2(2), VAR3(3),
	//constant-specific class body
	VAR4(4) {
		int var2;
		int getVal() {
			//the following happens in static context
			//do something with var but return always 5
			int t = var + 1;
			int t1 = var2 + 1;
			System.out.println("overloaded getVal, initial var is"+var);
			return 5;
		}
	};
	
	
	//enum variable
	//if you declare enum's variable var as private it won't be accessible from constant class bodies 
	//	- because they are subclasses (thus can access only public, default, protected but not private vars) 
	//	of main enum class
	protected int var;
	
	
	//enum constructor is always private - you cannot access it from outside - this ensures that enum constants are actually contant
	TrainingEnum(int newx) {
		var = newx;
	}
	
	//enum method
	int getVal() {
		//this is non static context - it can access instance variable var
		return var;
	}
}
