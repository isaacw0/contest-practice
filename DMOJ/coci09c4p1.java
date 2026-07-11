package DMOJ;
import java.io.*;
import java.util.*;

public class coci09c4p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String output = "";
		
		
		for (int i = 0; i < s.length(); i++) {
			char b = s.charAt(i);
			boolean a = Character.isUpperCase(b);
			
			if (a) {
				output += b;
			}
		}
		System.out.println(output);
	}
}
