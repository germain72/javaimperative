
public class TypeCasting {

	public static void main(String[] args) {

//		testImplicit();
		testExplicit();
	}
	
	public static void testImplicit() {

		byte var1 = 127;
		short var2 = 32_767;

		System.out.println(var1);
		System.out.println(var2);
		
		// Widening casting
		var2 = var1;
		System.out.println(var1);
	}
	
	public static void testExplicit() {
		
		byte var1 = 127;
		short var2 = 32_767;
		
		System.out.println(var1);
		System.out.println(var2);

		// Narrowing casting
		var1 = (byte) var2;
		System.out.println(var1);
	}

}
