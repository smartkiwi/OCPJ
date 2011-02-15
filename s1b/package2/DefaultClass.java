package package2;

class DefaultClass {

	public static void main(String[] args) {
		System.out.println("calling method of myself");
		method();
	}

	void method() {
		System.out.println("method of protected class DefaultClass");
	}
}