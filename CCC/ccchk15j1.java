package CCC;
import java.io.*;
import java.util.*;

public class ccchk15j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] a = new String[n];
		String[] b = new String[n];
		
		int awin = 0;
		int bwin = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		sc.nextLine();
		for (int k = 0; k < n; k++) {
			b[k] = sc.next();
		}
		
		for (int j = 0; j < n; j++) {
			if (a[j].equals("paper") && b[j].equals("rock")) {
				awin++;
			}
			else if (a[j].equals("rock") && b[j].equals("scissors")) {
				awin++;
			}
			else if (a[j].equals("scissors") && b[j].equals("paper")) {
				awin++;
			}
			
			if (b[j].equals("paper") && a[j].equals("rock")) {
				bwin++;
			}
			if (b[j].equals("rock") && a[j].equals("scissors")) {
				bwin++;
			}
			if (b[j].equals("scissors") && a[j].equals("paper")) {
				bwin++;
			}
		}
		System.out.println(awin + " " + bwin);
	}
}
