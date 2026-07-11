package CCC;
import java.io.*;
import java.util.*;

public class nccc5j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String s  = sc.next();
		for (int i = 0; i < s.length(); i++) {
			int k = i + 3;
			
			if (k > s.length() && !s.equals("CCC")) {
				System.out.println("YES");
				return;
			}
			else if (k > s.length() && s.equals("CCC")) {
				System.out.println("NO");
				return;
			}
			
			boolean a = s.substring(i, k).equals("CCC");
			if (a) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		
	}
}
