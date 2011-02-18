/*
2.b Make a switch using an enum that 
	contains a default case. 
Test the switch statement by iterating though the enum.

*/

class S2b {
	public static void main(String[] args) {
		for (Switcher sw : Switcher.values() ) {
			System.out.println(sw);
			
			switch (sw) {
				case E1: { println("detected E1"); break; }
				default: { println("default case of "+sw);break;}
				case E4: { println("detected E4"); break; }
			}
		}
	}
	
	static void println(String str) {
		System.out.println(str);
	}
}

enum Switcher {
	E1, E2, E3, E4, E6
}