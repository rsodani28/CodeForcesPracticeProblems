import java.util.Scanner;
import java.util.ArrayList;

public class Problem34B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String nm = in.nextLine();
		int n = Integer.parseInt(nm.substring(0, 1));
		int m = Integer.parseInt(nm.substring(2));
		ArrayList<Integer> prices = new ArrayList<Integer>();
		String line = in.nextLine();
		String[] lines = line.split(" ");
		for (int i = 0; i < n; i++) {
			prices.add(Integer.parseInt(lines[i]));
		}
		int count = 0;
		int total = 0;
		while (count < m) {
			int minimum = prices.get(0);
			for (int i = 1; i < prices.size(); i++) {
				if (minimum > prices.get(i))
					minimum = prices.get(i);
			}
			prices.remove(Integer.valueOf(minimum));
			total = total + Math.abs(minimum);
			count++;
		}
		System.out.println(total);
		in.close();
	}

}
