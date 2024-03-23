import java.util.Scanner;

public class Problem991B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int i = 0; i < n; i++) {
			grades[i] = in.nextInt();
		}
		double total = 0;
		for (int grade : grades) {
			total += grade;
		}
		double currentAverage = total / n;
		int count = 0;
		while (currentAverage < 4.5) {
			total += 5 - grades[count];
			currentAverage = total / n;
			grades[count] = 5;
			count++;
		}
		System.out.println(count);
		in.close();
	}
}
