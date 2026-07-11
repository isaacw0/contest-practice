package DMOJ;
import java.io.*;
import java.util.*;

public class bsspc22p1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			sc.nextLine();
			
			
			sum = sum + num;
			System.out.println(sum);
		}
		
		
		
	}
}
