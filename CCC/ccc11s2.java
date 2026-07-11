package CCC;
import java.io.*;
import java.util.*;

public class ccc11s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		char[] a = new char[n];
		char[] b = new char[n];
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.next().charAt(0);
		}
		sc.nextLine();
		for (int k = n; k < 2*n; k++) {
			b[k-n] = sc.next().charAt(0);
		}
		
		for (int j = 0; j < n; j++) {
			if (a[j] == (b[j])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
