package DMOJ;
import java.io.*;
import java.util.*;

public class wc171j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int capital = 0;
		int lower = 0;
		
		
		for (int i =  0; i < s.length(); i++) {
			char k = s.charAt(i);
			boolean eh = Character.isUpperCase(k);
			if (eh) {
				capital++;
			}
			else {
				lower++;
			}
		}
		
		if (capital <= 10 && lower <= 10) {
			s += ", eh";
		}
		
		System.out.println(s);
	}
}
