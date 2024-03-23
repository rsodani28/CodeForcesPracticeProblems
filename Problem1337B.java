import java.util.Scanner;

public class Problem1337B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		in.nextLine();
		for (int i = 0; i < times; i++) {
			String line = in.nextLine();
			String[] lines = line.split(" ");
			int hitpoints = Integer.parseInt(lines[0]);
			int VA = Integer.parseInt(lines[1]);
			int LS = Integer.parseInt(lines[2]);
			for (int x = 0; x < VA; x++) {
				hitpoints = (hitpoints / 2) - 10;

			}
			hitpoints = hitpoints - (10 * LS);
			if (hitpoints <= 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
		in.close();
	}

}
