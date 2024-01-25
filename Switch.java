public class Switch {
	public static void main(String[] args) {
		String text = "Salut";
		switch(text) {
			case "Hi":
			case "Salut":
			case "Hello": {
				System.out.println("Hello to you too!");
				break;
			}
			case "Bye": {
				System.out.println("See you!");
				break;
			}
			default: {
				System.out.println("Unknown message");
			}
		}

	}
}