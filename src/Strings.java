import java.util.Arrays;

public class Strings {
	
	public static void main(String[] args) {
		
		testReferenceEquality();
		testValueEquality();
		testMethods();
	}
	
	public static void testReferenceEquality() {

		String str = "Chaîne de caractère";
		String str2 = new String("Une autre chaîne de caractère");
		String str3 = new String("Chaîne de caractère");
		String str4 = "Chaîne de caractère";
		
		// Test d'égalité de référence
		System.out.println("str == str2 ? " + (str == str2));
		System.out.println("str == str3 ? " + (str == str3));
		System.out.println("str == str4 ? " + (str == str4));
		System.out.println("str == \"Chaîne de caractère\" ? " + (str == "Chaîne de caractère"));
	}
	
	public static void testValueEquality() {

		String str = "Chaîne de caractère";
		String str2 = new String("Une autre chaîne de caractère");
		String str3 = new String("Chaîne de caractère");
		String str4 = "Chaîne de caractère";
		
		// Test d'égalité de valeur
		System.out.println("str.equals(str2) ? " + (str.equals(str2)));
		System.out.println("str.equals(str3) ? " + (str.equals(str3)));
		System.out.println("str.equals(str4) ? " + (str.equals(str4)));
		System.out.println("str.equals(\"Chaîne de caractère\") ? " + (str.equals("Chaîne de caractère")));
	}
	
	public static void testMethods() {
		
		String str = "Chaîne";
		
		System.out.println("str => " + str);

		System.out.println("str.length() => " + str.length());
		System.out.println("str.toUpperCase() => " + str.toUpperCase());
		System.out.println("str.toLowerCase() => " + str.toLowerCase());
		System.out.println("str.indexOf(\"aî\") => " + str.indexOf("aî"));
		System.out.println("str.charAt(1) => " + str.charAt(1));
		System.out.println("str.codePointAt(1) => " + str.codePointAt(1));
		System.out.println("str.replace('î', 'r') => " + str.replace('î', 'r'));
		System.out.println("str.substring(3, 5) => " + str.substring(3, 5));
		System.out.println("str.contains(\"ne\") => " + str.contains("ne"));
		System.out.println("str.concat(\" de caractère\") => " + str.concat(" de caractère"));
	}
	
}
