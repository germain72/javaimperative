
public class Conditions {

	public static void main(String[] args) {
		
		testIfStatement();
		testSwitchStatement();
	}
	
	public static void testIfStatement() {
		
		boolean a = true;
		boolean b = false;
		byte c = 1;
		byte d = 2;
		
		System.out.println("a == " + a);
		System.out.println("b == " + b);
		System.out.println("c == " + c);
		System.out.println("d == " + d);
		
		// Cas 1 : if (true)
		if (a) {
			System.out.println("a == true");
		}
		
		// Cas 2 : if (false)
		if (b) {
			System.out.println("Je ne m'afficherai pas !");
		}
		
		// Cas 3 : if .. else
		if (c == d) {
			System.out.println("c == d");
		} else {
			System.out.println("c != d");
		}
		
		// Cas 4 : if .. else if .. else if .. else
		if (c == d) {
			System.out.println("c == d");
		} else if (c == 1) {
			System.out.println("c == 1");
		} else if (d == 2) {
			System.out.println("c == 2");
		} else {
			System.out.println("c != d");
		}
		
		// Cas 5 : Test avec opérateurs de comparaison
		if (c > d) {
			System.out.println("c > d");
		} else {
			System.out.println("c < d");
		}
		
	}

	
	public static void testSwitchStatement() {
		
		int a = 5;
		
		switch(a) {
			case 0:
				System.out.println("a == 0");
				break;
			case 3:
				System.out.println("a == 3");
				break;
			case 5:
				System.out.println("a == 5");
				break;
			default:
				System.out.println("comportement par défaut");
				break;
		}
		
	}
	

}
