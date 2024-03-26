import java.util.Scanner;

public class Problem80A {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		long t1 = System.currentTimeMillis();
		in.close();
		String[] nums = line.split(" ");
		long x = Long.parseLong(nums[0]);
		long y = Long.parseLong(nums[1]);
		// true is 1 : false is 0
		int trueCheck = 1;
		int falseCheck = 0;
		int flagx = trueCheck;
		int flagy = trueCheck;
		double loop = 0;
		if (x > y) {
			loop = x;
		} else {
			loop = y;
		}
		loop = Math.sqrt(loop);
		if (x != 2 && x % 2 == 0) {
			flagx = falseCheck;
		}
		if (y != 2 && y % 2 == 0) {
			flagy = falseCheck;
		}
		if (x != 3 && x % 3 == 0 && flagx != falseCheck && flagy != falseCheck) {
			flagx = falseCheck;
		}
		if (y != 3 && y % 3 == 0 && flagx != falseCheck && flagy != falseCheck) {
			flagy = falseCheck;
		}
		if (x != 5 && x % 5 == 0 && flagx != falseCheck && flagy != falseCheck) {
			flagx = falseCheck;
		}
		if (y != 5 && y % 5 == 0 && flagx != falseCheck && flagy != falseCheck) {
			flagy = falseCheck;
		}

		if (x != 7 && x % 7 == 0 && flagx != falseCheck && flagy != falseCheck) {
			flagx = falseCheck;
		}
		if (y != 11 && y % 11 == 0 && flagx != falseCheck && flagy != falseCheck) {
			flagy = falseCheck;
		}
		if (x != 11 && x % 11 == 0 && flagx != falseCheck && flagy != falseCheck) {
			flagx = falseCheck;
		}
		if (y != 13 && y % 13 == 0 && flagx != falseCheck && flagy != falseCheck) {
			flagy = falseCheck;
		}
		if (x != 13 && x % 13 == 0 && flagx != falseCheck && flagy != falseCheck) {
			flagx = falseCheck;
		}
		if (flagx == trueCheck && flagy == trueCheck) {
			// System.out.println("eneter if, testing for x " + x + " y " + y);
			for (long i = 17; i < loop ; i++) {
				// System.out.println("enterd outer loop " + i);
				if (i % 2 == 0) {
					continue;
				}
				if (i % 3 == 0) {
					continue;
				}
				if (i % 5 == 0) {
					continue;
				}
				if (i % 7 == 0) {
					continue;
				}
				if (i % 11 == 0) {
					continue;
				}
				if (i % 13 == 0) {
					continue;
				}
				if (i <= x / 2) {
					// System.out.println("enterd loop " + i);
					// if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
					if (x % i == 0) {
						flagx = falseCheck;
						// System.out.println(x + " is divi by " + i);
						break;
					}
					// }
				}
				if (i <= y / 2) {
					// System.out.println("enterd loop " + i);
					// if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
					if (y % i == 0) {
						flagy = falseCheck;
						// System.out.println(y + " is divi by " + i);
						break;
					}

					// }
				}
			}
		}
		if (flagx == trueCheck && flagy == trueCheck) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		long t2 = System.currentTimeMillis();
		long totalTIme = t2 - t1;

		Runtime rt = Runtime.getRuntime();
		long total_mem = rt.totalMemory();
		long free_mem = rt.freeMemory();
		double used_mem = (total_mem - free_mem)/ 1000000.0;
		System.out.println("Amount of used memory: " + used_mem);

		System.out.println("total time to run = " + (totalTIme));
	}
	/*
	 * public void testPrimeApache(long x, long y) { long t1 =
	 * System.currentTimeMillis(); Prime.isPrime(); long t2 =
	 * System.currentTimeMillis();
	 * 
	 * }
	 */
}
