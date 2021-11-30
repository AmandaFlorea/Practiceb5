package one;

public class PracticeOne {
	public static void main(String[] args) {
		System.out.println("Amanda");
		
		System.out.println("trying to find conflict");
		System.out.println("Sajia");

		System.out.println("this will be conflict");

		System.out.println("thring to get conflict");

	}
	
	public static void addNum(int a, int b) {
		System.out.println(a + b);
	}
	public static void getPractice(String name) {
		System.out.println("Fieruz");
		
	}

	public static void subNum(int a, int b) {
		System.out.println(a - b);

		System.out.println("Waheeda");

		
		// want conflict for practice
	}
	

	public static void getName(String name) {
		name = "Amanda";
		System.out.println(name);
	}

	public static void divNum(int a, int b) {
		System.out.println(a / b);
	}

	
	public static void multiply(int a, int b) {
		System.out.println(a*b);
		System.out.println(" conflict ");
		
	}
	public static void addNumber(int a, int b) {
		System.out.println(a + b);
		// conflict please 
	}

}
