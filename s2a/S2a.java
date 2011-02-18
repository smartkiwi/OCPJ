/*
2.a  Write a method that includes an 
	if-else that’s inside 
		a while loop that’s 
			inside a for loop that’s 
				inside a do loop. 
Then add a labeled break and continue to the for loop.
*/

class S2a {
	public static void main(String[] agrs) {
		int doloopcounter = 0;
		do {
			System.out.println("do loop: "+doloopcounter);
			forlable: for (int forloopcounter=0;forloopcounter<4;forloopcounter++) {
				System.out.println("\tfor loop: "+forloopcounter);
				int whileloopcounter = 0;
				while(whileloopcounter<3) {
					System.out.println("\t\twhile loop: "+whileloopcounter);
					whileloopcounter++;
					if (forloopcounter==2) 
						{ break forlable;  }
					else if (forloopcounter==0)  { continue forlable; }
				}
			}
			doloopcounter++;
		} while (doloopcounter<4);
	}
}