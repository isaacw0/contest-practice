package CCC;
import java.io.*;
import java.util.*;

public class ccc20j2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		int day = 0;
		int current = n;
		int total = n;

		while (total <= p) {
		    current *= r;
		    total += current;
		    day++;
		}
		
		System.out.println(day);
	}
}
