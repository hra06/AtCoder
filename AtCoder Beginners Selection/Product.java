// https://atcoder.jp/contests/abs/tasks/abc086_a
import java.util.*;

public class Product{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    scan.nextLine();
    
    if((a%2 * b%2 )%2 ==0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
    scan.close();
  }
}