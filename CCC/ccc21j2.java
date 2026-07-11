package CCC;
import java.io.*;
import java.util.*;

public class ccc21j2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int highest = 0;
		String winner = "";
		
		for (int i = 0; i < n; i++) {
			String bidder = sc.nextLine();
			int current = sc.nextInt();
			sc.nextLine();
			
			
			if (current > highest) {
				highest = current;
				winner = bidder;
			}
		}
		
		System.out.println(winner);
	}
}
