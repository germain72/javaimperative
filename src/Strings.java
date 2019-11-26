import java.util.Arrays;

public class Strings {
	
	public static void main(String[] args) {
		
		testReferenceEquality();
		testValueEquality();
		testMethods();
	}
	
	public static void testReferenceEquality() {

		String str = "Cha�ne de caract�re";
		String str2 = new String("Une autre cha�ne de caract�re");
		String str3 = new String("Cha�ne de caract�re");
		String str4 = "Cha�ne de caract�re";
		
		// Test d'�galit� de r�f�rence
		System.out.println("str == str2 ? " + (str == str2));
		System.out.println("str == str3 ? " + (str == str3));
		System.out.println("str == str4 ? " + (str == str4));
		System.out.println("str == \"Cha�ne de caract�re\" ? " + (str == "Cha�ne de caract�re"));
	}
	
	public static void testValueEquality() {

		String str = "Cha�ne de caract�re";
		String str2 = new String("Une autre cha�ne de caract�re");
		String str3 = new String("Cha�ne de caract�re");
		String str4 = "Cha�ne de caract�re";
		
		// Test d'�galit� de valeur
		System.out.println("str.equals(str2) ? " + (str.equals(str2)));
		System.out.println("str.equals(str3) ? " + (str.equals(str3)));
		System.out.println("str.equals(str4) ? " + (str.equals(str4)));
		System.out.println("str.equals(\"Cha�ne de caract�re\") ? " + (str.equals("Cha�ne de caract�re")));
	}
	
	public static void testMethods() {
		
		String str = "Cha�ne";
		
		System.out.println("str => " + str);

		System.out.println("str.length() => " + str.length());
		System.out.println("str.toUpperCase() => " + str.toUpperCase());
		System.out.println("str.toLowerCase() => " + str.toLowerCase());
		System.out.println("str.indexOf(\"a�\") => " + str.indexOf("a�"));
		System.out.println("str.charAt(1) => " + str.charAt(1));
		System.out.println("str.codePointAt(1) => " + str.codePointAt(1));
		System.out.println("str.replace('�', 'r') => " + str.replace('�', 'r'));
		System.out.println("str.substring(3, 5) => " + str.substring(3, 5));
		System.out.println("str.contains(\"ne\") => " + str.contains("ne"));
		System.out.println("str.concat(\" de caract�re\") => " + str.concat(" de caract�re"));
	}
	
}
