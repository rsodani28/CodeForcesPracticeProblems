import java.util.Scanner;

public class Problem158A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String vals = in.nextLine();
		String line = in.nextLine();
		String[] score = line.split(" ");
		int l = Integer.parseInt(vals.substring(0, 1));
		int p = Integer.parseInt(vals.substring(2)) - 1;
		int[] scores = new int[l];
		for (int i = 0; i < l; i++) {
			scores[i] = Integer.parseInt(score[i]);
		}
		int min = scores[p];
		int count = 0;
		for (int x : scores) {
			if (x >= min) {
				count++;
			}

		}
		if (min <= 0) {
			System.out.println("0");
		} else {
			System.out.println(count);
		}
		in.close();
	}

}
