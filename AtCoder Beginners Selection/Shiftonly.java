// https://atcoder.jp/contests/abs/tasks/abc081_b
import java.util.*;

public class Shiftonly {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int itr = 0;
		int loop = 1;
		while (loop >= 1) {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 != 0) {
					loop = -1;
					break;
				}
				a[i] /= 2;
			}
			if (loop > 0) {
				itr++;
			}
		}
		System.out.println(itr);

		scan.nextLine();

		scan.close();
	}
}