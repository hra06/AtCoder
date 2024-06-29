// https://atcoder.jp/contests/abs/tasks/abc085_b
import java.util.*;

public class KagamiMochi{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		
		int arr[] = new int[n];
		
		for(int i =0 ; i < n ; i++){
			arr[i] = scan.nextInt();
			scan.nextLine();
		}
		
		sort(arr, 0, n-1);
		
		int count = 1;
		
		for(int i = 1 ; i< n; i++){
			//System.out.println(arr[i-1] + " " + arr[i] + " " + (arr[i-1] != arr[i])); 
			if(arr[i-1] != arr[i])
				count++;
		}
		
		System.out.println(count);
	}
	
	private static void sort(int arr[], int l, int r){
		
		if(l<r){
			
			int m = (l+r-1)/2;
			
			sort(arr,l,m);
			sort(arr,m+1, r);
			
			merge(arr, l, m, r);
		}
	}
	
	private static void merge(int arr[], int l, int m, int r){
		int n1 = m+1-l;
		int n2 = r-m;
		
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		
		for(int i = 0 ; i < n1 ; i++){
			arr1[i] = arr[l+i];
		}
		
		for(int i =0 ; i< n2 ; i++){
			arr2[i] = arr[m+1+i];
		}
		
		int i=0;
		int j =0;
		int k =l;
		
		while(i<n1 && j<n2){
			if(arr1[i] <= arr2[j])
				arr[k++] = arr1[i++];
			else
				arr[k++] = arr2[j++];
		}
		
		while(i<n1)
			arr[k++] = arr1[i++];
		
		while(j<n2)
			arr[k++] = arr2[j++];
		
	}
}