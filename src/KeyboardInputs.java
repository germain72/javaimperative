import java.util.Scanner;

public class KeyboardInputs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrez votre nom :");
		String nom = sc.nextLine();
				
		System.out.println("Veuillez entrez votre prénom :");
		String prenom = sc.nextLine();
		
		System.out.println("Veuillez entrez votre age :");
		int age = sc.nextInt();
		
		System.out.println("Bienvenue " + prenom + " " + nom + " !");
		System.out.println("Vous avez " + age + " ans");
	}

}
