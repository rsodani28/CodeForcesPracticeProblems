import java.util.Scanner;

public class Problem1726A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		in.nextLine();
		for (int i = 0; i < times; i++) {
			int size = in.nextInt();
			in.nextLine();
			String line = in.nextLine();
			String[] lines = line.split(" ");
			int max = 0;
			int min = Integer.MAX_VALUE;
			for (int x = 0; x < size; x++) {
				if (Integer.parseInt(lines[x]) > max) {
					max = Integer.parseInt(lines[x]);
				}
				if (Integer.parseInt(lines[x]) < min) {
					min = Integer.parseInt(lines[x]);
				}
			}
			System.out.println(max - min);
		}
		in.close();
	}

}
