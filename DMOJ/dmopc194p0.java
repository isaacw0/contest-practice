package DMOJ;
import java.io.*;
import java.util.*;

public class dmopc194p0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int count = 0;
		boolean dead = false;
		
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			if (c1 != c2) {
				count++;
				if (count == 2) {
					dead = true;
				}
			}
		}
		if (count == 0) {
			dead = true;
		}
		
		if (dead) {
			System.out.println("LARRY IS DEAD!");
		}
		else {
			System.out.println("LARRY IS SAVED!");
		}
	}
}
