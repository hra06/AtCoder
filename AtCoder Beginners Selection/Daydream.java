//https://atcoder.jp/contests/abs/submissions/54977576
import java.util.*;

public class Daydream{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);		
		String s = scan.nextLine();
		scan.close();
		
		int index = 0;
		int sLen = s.length();
		
		boolean tPossible = nextCompare(s,0,sLen);
		
		if(tPossible == true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	public static boolean nextCompare(String s, int index, int sLen){
		if(sLen-index ==0)
			return true;
		
		if(sLen-index>=5){
			String s1 = s.substring(index,index+5);
			if(s1.compareTo("dream") == 0 || s1.compareTo("erase") == 0){
				if(sLen-index == 5){
					return true;
				}
				if(sLen-index >=8 && validNext(s, index+5, sLen) == true){
					return nextCompare(s, index+5, sLen);
				}
			}
		}
		
		if(sLen-index >= 6 && s.substring(index,index+6).compareTo("eraser") == 0){
			return nextCompare(s, index+6, sLen);
		}
		
		if(sLen-index >= 7 && s.substring(index,index+7).compareTo("dreamer") == 0 ){
			return nextCompare(s, index+7, sLen);
		}
		
		return false;
	}
	
	public static boolean validNext(String s, int index, int sLen){
		if(sLen-index ==1 ){
			return true;
		}
		
		String check = s.substring(index,index+3);
		if( check.compareTo("dre") ==0 || check.compareTo("era") ==0){
			return true;
		}
		return false;
	}
}