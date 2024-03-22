import java.util.Scanner;

public class Problem1360B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Tcases = in.nextInt();
		int[] result = new int[Tcases];
		for (int i = 0; i < Tcases; i++) {
			int Athletes = in.nextInt();
			in.nextLine();
			String line = in.nextLine();
			String[] strength = line.split(" ");
			int[] strengths = new int[Athletes];
			for (int x = 0; x < Athletes; x++) {
				strengths[x] = Integer.parseInt(strength[x]);
			}
			int dif = Math.abs(strengths[0] - strengths[1]);
			for (int y = 1; y < Athletes; y++) {
				if (Math.abs(strengths[0] - strengths[y]) < dif) {
					dif = Math.abs(strengths[0] - strengths[y]);
				}
			}
			result[i] = dif;
		}
		for (int z : result) {
			System.out.println(z);
		}
		in.close();
	}

}
