import java.util.Scanner;
public class Problem200B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int NumJuices = in.nextInt();
		Double[] pOrange = new Double[NumJuices];
		for(int i = 0; i<NumJuices; i++) {
			pOrange[i] = in.nextInt() /100.00;
		}
		in.close();
		Double result = 0.0;
		for(Double i: pOrange) {
			result = result +(i/pOrange.length);
		}
		System.out.println(result*100);

	}

}
