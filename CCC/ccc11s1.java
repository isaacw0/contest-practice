package CCC;
import java.io.*;
import java.util.*;

public class ccc11s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = 0;
		int s = 0;
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String text = sc.nextLine();
			for (int k = 0; k < text.length(); k++) {
				boolean a = text.charAt(k) == 't'|| text.charAt(k) == 'T';
				boolean b = text.charAt(k) == 's'|| text.charAt(k) == 'S';
				if (a){
					t++;
				}
				else if (b) {
					s++;
				}
			}
		}	
		if (t > s) {
			System.out.println("English");
		}
		else if (t == s) {
			System.out.println("French");
		}
		else {
			System.out.println("French");
		}
	}
}
