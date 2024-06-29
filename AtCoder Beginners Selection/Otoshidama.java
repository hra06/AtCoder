//https://atcoder.jp/contests/abs/tasks/abc085_c
import java.util.*;

public class Otoshidama{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);		
		int n = scan.nextInt();
		int y = scan.nextInt();
		scan.nextLine();
		scan.close();	
		
		if(y%1000 !=0 || (y/1000)-n < 0){
			System.out.println("-1 -1 -1");
			return;
		}
		y = y/1000;
		for(int x1 = 0 ; x1 <= n ; x1++){
			for(int y1 = 0 ; y1 <= n-x1 ; y1++){
				if( ((9*x1) + (4*y1)) == (y-n) && n-x1-y1 >=0){
					System.out.println(x1 + " " + y1 + " " + (n-x1-y1));
					return;
				} 
			} 
		}
		
		System.out.println("-1 -1 -1");		
	}
}