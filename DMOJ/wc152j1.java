package DMOJ;
import java.io.*;
import java.util.*;

public class wc152j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String far = "";
		for (int i = 0; i < n; i++) {
			if (i == n-1) {
				far += " far";
			}
			else {
				far += " far,";
			}
		}
		System.out.println("A long time ago in a galaxy" + far + " away...");
	}
}
