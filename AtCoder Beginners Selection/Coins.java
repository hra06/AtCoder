// https://atcoder.jp/contests/abs/tasks/abc087_b

import java.util.*;

public class Coins {

	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.nextLine();
		int b = scan.nextInt();
		scan.nextLine();
		int c = scan.nextInt();
		scan.nextLine();
		int x = scan.nextInt();
		scan.nextLine();
		
		int combination=0;
		
		
		for(int i = 0 ; i <=a ; i++){
			for(int j = 0 ; j <=b ; j++){
				int findC = (x - ((i*500) + (j*100)));
				int tempC = findC/50;
				if(findC%50 ==0 && tempC <= c && findC>=0){
					combination++;						
				}
			}
		}
		
		System.out.println(combination);
		
		scan.close();
	}
}