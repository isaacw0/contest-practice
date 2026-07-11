package CCC;
import java.io.*;
import java.util.*;

public class ccc07j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		int mid = 0;
		
		if (value2 < value1 && value1 < value3 || value3 < value1 && value1 < value2) {
			mid = 1;
		}
		if (value1 < value2 && value2 < value3 || value3 < value2 && value2 < value1) {
			mid = 2;
		}
		if (value1 < value3 && value3 < value2 || value2 < value3 && value3 < value1) {
			mid = 3;
		}		
		
		if (mid == 1) {
			mid = value1;
		}
		else if (mid == 2) {
			mid = value2;
		}
		else {
			mid = value3;
		}
		System.out.println(mid);
	}
}
