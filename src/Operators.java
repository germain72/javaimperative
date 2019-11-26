
public class Operators {

	public static void main(String[] args) {
		
//		testArithmetic();
//		testAffectation();
//		testUnary();
//		testBit();
//		testLogicalComparison();
//		testBooleanLogic();
//		testTernary();
	}
	
	public static void testArithmetic() {

		int a = 30, b = 20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
	}

	public static void testAffectation() {

		int a = 30, b = 20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a += b; // a = a + b
		System.out.println("a += b => " + a);
		a -= b; // a = a - b
		System.out.println("a -= b => " + a);
		a *= b; // a = a * b
		System.out.println("a *= b => " + a);
		a /= b; // a = a / b
		System.out.println("a /= b => " + a);
		a %= b; // a = a % b
		System.out.println("a %= b => " + a);
		
		// Aussi : &=, |=, ^=, >>=, <<=
	}

	public static void testUnary() {

		int a = 30;
		
		System.out.println("a = " + a);
		
		a++; // a = a + 1
		System.out.println("a (after a++) => " + a);
		
		a--; // a = a - 1
		System.out.println("a (after a--) => " + a);
		
		// Cas avec a++ dans une expression
		System.out.println("a++ => " + a++);
		System.out.println("a => " + a);
		
		// Cas avec ++a dans une expression
		System.out.println("++a => " + ++a);
		System.out.println("a => " + a);
		
		// Cas avec a-- dans une expression
		System.out.println("a-- => " + a--);
		System.out.println("a => " + a);
		
		// Cas avec --a dans une expression
		System.out.println("--a => " + --a);
		System.out.println("a => " + a);
		
	}

	public static void testBit() {

		int a = 1; // 0b01
		int b = 3; // Ob11
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("~a => " + ~a);
		System.out.println("a & b => " + (a & b));
		System.out.println("a | b => " + (a | b));
		System.out.println("a ^ b => " + (a ^ b));
		System.out.println("a << 1 => " + (a << 1));
		System.out.println("a >> 1 => " + (a >> 1));
		
	}

	public static void testLogicalComparison() {

		int a = 30, b = 20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("a == b => " + (a == b));
		System.out.println("a != b => " + (a != b));
		System.out.println("a < b => " + (a < b));
		System.out.println("a <= b => " + (a <= b));
		System.out.println("a > b => " + (a > b));
		System.out.println("a >= b => " + (a >= b));
	}

	public static void testBooleanLogic() {
		
		boolean a = true, b = false;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("!a => " + !a);
		System.out.println("a && b => " + (a && b));
		System.out.println("a || b => " + (a || b));
	}
	
	public static void testTernary() {
		
		boolean a = true, b = false;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("a ? a : b => " + (a ? a : b));
		System.out.println("b ? a : b => " + (b ? a : b));
	}
}
