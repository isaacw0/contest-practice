package DMOJ;
import java.io.*;
import java.util.*;

public class dmojBoolean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		boolean a = true;
		String s = sc.nextLine();
		// 0,3 1st not
		// 5, 8 2nd not
		// 10, 13 3rd not
		for (int i = 0; i < s.length(); i ++) {
			int n2 = 3+i*5;
			count++;
			if (n2 >= s.length()) {
				break;
			}
		}
		count--;
		String b = s.substring(count*4, s.length());
		
		if (count % 2 == 0) {
			if (b.equals("True")) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		else {
			if (b.equals("True")) {
				System.out.println("False");
			}
			else {
				System.out.println("True");
			}
		}
	}
}
