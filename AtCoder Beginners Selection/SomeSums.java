//https://atcoder.jp/contests/abs/tasks/abc083_b
import java.util.*;

public class SomeSums {

	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.nextLine();
		
		int totalSum = 0;
		
		for(int i = 1 ; i <=n ; i++){
			int localN = i;
			int localSum = 0;
			while(localN !=0){
				localSum += localN%10;
				localN/=10;
			}
			if(localSum >= a && localSum <=b){
				totalSum+=i;
			}
		}
		
		System.out.println(totalSum);
		
		scan.close();
	}
}