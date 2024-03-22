import java.util.Scanner;

public class Problem116A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int stops = in.nextInt();
		in.nextLine();
		int inital = 0;
		int maxPeople = 0;
		for (int i = 0; i < stops; i++) {
			String line = in.nextLine();
			int exit = Integer.parseInt(line.substring(0, 1));
			int enter = Integer.parseInt(line.substring(2));
			int net = enter - exit;
			inital = inital + net;
			if (inital > maxPeople) {
				maxPeople = inital;
			}

		}
		in.close();
		System.out.println(maxPeople);
	}

}
