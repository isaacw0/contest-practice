package CCC;
import java.io.*;
import java.util.*;

public class ccc14j2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			
			if (c == 'A') {
				a++;
			}
			else {
				b++;
			}
		}
		
		
		if (a > b) {
			System.out.println("A");
		}
		else if (a == b) {
			System.out.println("Tie");
		}
		else {
			System.out.println("B");
		}
	}
}
