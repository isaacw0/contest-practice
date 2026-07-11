package CCC;
import java.io.*;
import java.util.*;

public class ccc20j1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int math = (1*s) + (2*m) + (3*l);
		
		if (math >= 10) {
			System.out.println("happy");
		}
		else {
			System.out.println("sad");
		}
	}
}
