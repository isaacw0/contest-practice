package CCC;
import java.io.*;
import java.util.*;

public class ccc19j2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		sc.nextLine();
		String s = "";
		
		
		for (int i = 0; i < n; i++) {
			int times = sc.nextInt();
			char sym = sc.next().charAt(0);
			sc.nextLine();
			
			for (int k = 0; k < times; k++) {
				s += sym;
			}
			s += "\n";
		}
		
		System.out.println(s);
	}
}
