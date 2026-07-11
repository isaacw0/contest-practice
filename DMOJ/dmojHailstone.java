package DMOJ;
import java.io.*;
import java.util.*;

public class dmojHailstone {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 0;
		
		while (num != 1) {
			while (num % 2 != 0) {
				num = num*3 + 1;
				count++;
			}
			
			while(num % 2 == 0) {
				num /= 2;
				count++;
			}
		}
		System.out.println(count);
	}
}
