public class Main {
	public static void main(String[] args) {
		System.out.println("Hello if!");

		int x = 30, y = 30;
		if (x < y) {
			System.out.println("x < y");
		} else if(x == y) {
			System.out.println("x = y");
		} else {
			System.out.println("???");
		} else if(x > y) {
			System.out.println("x > y");
		}

		System.out.println(y);

	}
}