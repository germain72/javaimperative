import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
//		testSimpleArray();
//		testArrayEquality();
//		testMultiDimensionalArray();
		testPokemon();
	}
	
	public static void testSimpleArray() {

		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(numbers[2]);
	}
	
	public static void testArrayEquality() {

		String[] arr = {"ae", "ed", "lk"};
		String[] arr2 = {"ae", "ed", "lk"};
		System.out.println("Egalité de référence : " + arr.equals(arr2));
		System.out.println("Egalité de contenu : " + Arrays.equals(arr, arr2));
	}

	public static void testMultiDimensionalArray() {

		int[][] multi = {
				{1, 2, 3, 4},
				{5, 6, 7},
				{5, 6},
				{5},
		};
		
		for (int a = 0 ; a < multi.length ; a++) {
			for (int b = 0 ; b < multi[a].length ; b++) {
				System.out.print(multi[a][b]);
			}
			System.out.println("");
		}
	}

	public static void testPokemon() {
		
		String[] pokemon_list = { "Pikachu", "Salamèche", "Raichu", "Bulbizarre", "Tortank", "Carapuce", "Onyx", "Racaillou" };
		Arrays.sort(pokemon_list);
		for (String pokemon: pokemon_list)
			System.out.println(pokemon);
		
		System.out.println(Arrays.binarySearch(pokemon_list, "Carapuce"));
		
		String[][] evolutions_list = {
				{"Pikachu", "Raichu"},
				{"Salamèche"},
				{"Bulbizarre"},
				{"Carapuce", "Tortank"},
				{"Onyx", "Racaillou"}
		};
		
		for (int i = 0 ; i < evolutions_list.length ; i++) {
			System.out.println("---");
			System.out.println("Liste d'évolutions " + i + " :");
			for (int j = 0 ; j < evolutions_list[i].length ; j++) {
				System.out.print("\"" + evolutions_list[i][j] + "\"");
				if (j < evolutions_list[i].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
	}
}
