import java.util.Scanner;

public class Problem1927A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t1 = java.lang.System.currentTimeMillis();
		int queries = in.nextInt();
		for (int i = 0; i < queries; i++) {
			int length = in.nextInt();
			in.nextLine();
			String line = in.nextLine();
			System.out.println(MakeItWhite(line, length));
		}
		long t2 = java.lang.System.currentTimeMillis();
		System.out.println("Time taken in seconds " + ((t2 - t1)/1000.0));
		in.close();
	}

	public static int MakeItWhite(String line, int length) {
		int count = length;
		if (length == 1 && line.equals("B")) {
			return 1;
		} else if (length == 1) {
			return 0;
		} else if (length == 0) {
			return 0;
		}
		// String[] Colors = line.split(" ");
		for (int i = 0; i < length; i++) {
			if (line.substring(i, i + 1).equals("B")) {
				break;
			} else {
				count--;
			}
		}
		/*
		 * for(int i = length - 1; i <= 0; i--) { if(Colors[i].equals("B")) { break;
		 * }else { count--; } }
		 */
		for (int i = length; i >= 0; i--) {
			if (line.substring(i - 1, i).equals("B")) {
				break;
			} else {
				count--;
			}
		}
		return count;
	}

}
