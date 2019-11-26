
public class PrimitiveTypes {

	public static void main(String[] args) {
		
		testTypes();
//		testSigns();
	}

	public static void testTypes() {

		// Variable de type byte
		byte var1 = 127;
		System.out.println(127);
		
		// Variable de type short
		short var2 = 32_767;
		System.out.println(var2);
		
		// Variable de type int
		int var3 = 2_147_483_647;
		System.out.println(var3);
		
		// Variable de type long
		long var4 = 9_223_372_036_854_775_807L;
		System.out.println(var4);
		
		// Variable de type float
		float var5 = 3.40_282_347e38F;
		System.out.println(var5);
		
		// Variable de type double
		double var6 = 1.79_769_313_486_231_570e308;
		System.out.println(var6);
		
		// Variable de type char
		char var7 = 'a';
		System.out.println(var7);
		
		// Variable de type char avec short value
		// voir https://www.rapidtables.com/code/text/unicode-characters.html
		char var8 = 98;
		System.out.println(var8);
		
		// Variable de type boolean
		boolean var9 = true;
		System.out.println(var9);
	}

	public static void testSigns() {

		// Variable de type byte négative
		byte var1 = -128;
		System.out.println(var1);
		
		// Variable de type short négative
		short var2 = -32_768;
		System.out.println(var2);
		
		// Variable de type int négative
		int var3 = -2_147_483_648;
		System.out.println(var3);
		
		// Variable de type long
		long var4 = -9_223_372_036_854_775_808L;
		System.out.println(var4);
	}
}
