/*
2.d Catch all of the preceding exceptions 
	and print some subsequent output outside of 
	any error-handling code
*/

class S2d {
	public static void main(String[] args) {
	
		try {
			Exception1.throwClassCastException();
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		System.out.println("We passed ClassCastException");

		try {
			Exception1.throwNullPointerException();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Exception1.throwArrayIndexOutOfBoundsException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("We passed ArrayIndexOutOfBoundsException");
		
		
		try {
			Exception1.throwStackOverflowError();
		} catch (StackOverflowError e) {
			System.out.println(e.toString());
		}
		
		System.out.println("We passed StackOverflowError");
		try {
			Exception1.throwNumberFormatException();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("We passed NumberFormatException");
		try {
			assert(false);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
		
		System.out.println("We passed AssertionError");
		
		
	}
}

class Exception1 {
	static Exception1 ex;
	void instanceMethod() {};
	
	static void throwClassCastException() {
		Exception1_1 e1 = new Exception1_1();
		//upcast
		Exception1 e = (Exception1) e1;
		//downcast
		Exception1_2 e2 = (Exception1_2) e;
	}
	
	
	static void throwNullPointerException() {
		//try to access instance method of unitialized reference
		ex.instanceMethod();
	}

	static void throwArrayIndexOutOfBoundsException() {
		int[] i = {123,41243};
		int t = i[2];
	}

	static void throwStackOverflowError() {
		throwStackOverflowError1();
	}
	static void throwStackOverflowError1() {
		throwStackOverflowError();
	}


	static void throwNumberFormatException() {
		int i = Integer.parseInt("not number");
	}	
}

class Exception1_1 extends Exception1 {
}

class Exception1_2 extends Exception1 {
}
