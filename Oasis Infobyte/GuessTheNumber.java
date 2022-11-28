import java.util.Scanner;
public class GuessTheNumber {
	public static void guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int n = 1 + (int)(100
							* Math.random());
		int t = 5;
          int i, g;
		System.out.println(
			"A number is chosen"
			+ " between 1 to 100."
			+ "Guess the number"
			+ " within 5 trials.");

		for (i = 0; i < t; i++) {
			System.out.println(
				"Guess the number:");
                          	g = sc.nextInt();
			if (n == g) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.");
				break;
			}
			else if (n > g
					&& i != t- 1) {
				System.out.println(
					"The number is "
					+ "greater than " + g);
			}
			else if (n < g
					&& i != t - 1) {
				System.out.println(
					"The number is"
					+ " less than " + g);
			}
		}

		if (i == t) {
			System.out.println(
				"You have exhausted"
				+ t   +"  trials.");

			System.out.println(
				"The number was " + n);
		}
	}
	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}