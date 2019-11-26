import java.util.Scanner;

public class HiddenNumber {

	public static void main(String[] args) {
		
		System.out.println("*****************************************");
		System.out.println("* Bienvenue dans le jeu \"Hidden number\" *");
		System.out.println("*****************************************");

		System.out.println("");
		System.out.println("Règles :");
		System.out.println("\t 1. Un nombre entre 1 et 10 va être généré aléatoirement");
		System.out.println("\t 2. Vous avez 5 chances pour retrouver ce nombre");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez entrer votre pseudo :");
		String pseudo = sc.next();
		
		byte hiddenNumber = (byte)(Math.floor(Math.random() * 10) + 1);
		byte answer;
		byte chances = 5;
		
		do {
			System.out.println("*****************************************");
			System.out.println("Il vous reste " + chances + " chances");
			System.out.println("Veuillez entrer un nombre :");
			answer = sc.nextByte();
			if (answer != hiddenNumber)
				chances--;
		} while(answer != hiddenNumber && chances > 0);
		
		if (chances > 0)
			System.out.println("Bravo " + pseudo + " ! Vous avez réussi en " + (5 - chances + 1) + " coups !");
		else
			System.out.println("Bouuh " + pseudo + " ! Vous avez perdu ! La bonne réponse était " + hiddenNumber);
	}

}
