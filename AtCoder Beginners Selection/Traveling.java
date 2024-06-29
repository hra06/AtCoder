//https://atcoder.jp/contests/abs/tasks/arc089_a
import java.util.*;

public class Traveling{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long c = scan.nextLong();
		scan.nextLine();
		boolean ans = true;
		long tPrev = 0;
		long xPrev = 0;
		long yPrev = 0;
		for(long itr = 0 ; itr < c ; itr++){
			long t = scan.nextLong();
			long x = scan.nextLong();
			long y = scan.nextLong();
			scan.nextLine();
			
			long d = calculateDistance(x,xPrev)+calculateDistance(y,yPrev);
							
			ans = (ans == true) ? checkEligibility(t-tPrev,d) : false;
			
			tPrev = t;
			xPrev = x;
			yPrev = y;
		}
		System.out.println((ans == true ? "Yes" : "No"));
	}
	
	private static boolean checkEligibility(long t, long d){
		 return (t-d>=0 && (t-d)%2 == 0);
	}
	
	private static long calculateDistance(long current, long prev){
		return Math.abs(current-prev);
	}
}