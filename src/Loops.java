
public class Loops {

	public static void main(String[] args) {
		
		whileLoop();
		doWhileLoop();
		forLoop();
	}
	
	public static void whileLoop() {
		
		int a = 1;
		
		while (a <= 5) {
			System.out.println("a = " + a);
			a++;
		}
		
	}
	
	public static void doWhileLoop() {
		
		int a = 0;
		
		do {
			System.out.println("a = " + a);
		} while(a != 0);
	}

	public static void forLoop() {
		
		for (int a = 0 ; a < 5 ; a++) {
			System.out.println(a);
		}
	}
	
}
