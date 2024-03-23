import java.util.Scanner;

public class Problem50A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int x = Integer.parseInt(line.substring(0, 1)) * Integer.parseInt(line.substring(2));
		System.out.println(x / 2);
		in.close();
	}

}
