/*
2.e Write a try-catch-finally and 
	demonstrate it doing a try-catch-finally and 
	then try finally.
*/


class S2e {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println("we are in try block");
			int i = 1/0;
			System.out.println("program will never get here");
			assert(true);
		} catch (Exception e) {
			System.out.println("we caught exception:");
			e.printStackTrace();			
		} finally {
			System.out.println("...and FINALLY...");
		}
		System.out.println("ending program gracefully");
	}
}