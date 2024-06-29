// https://atcoder.jp/contests/abs/tasks/abc081_a
import java.util.*;

public class PlacingMarbles {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				num++;
			}
		}
		System.out.println(num);
		scan.close();
	}
}