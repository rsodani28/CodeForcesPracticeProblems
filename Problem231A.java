import java.util.Scanner;
public class Problem231A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Qs = in.nextInt();
		int count = 0;
		for(int i = 0; i<=Qs; i++) {
			String line = in.nextLine();
			if(line.equals("1 1 1") || line.equals("1 1 0") || line.equals("1 0 1") || line.equals("0 1 1")) {
				count++;
			}
			
		}
		in.close();
		System.out.println(count);
	}

}
