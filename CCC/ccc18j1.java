package CCC;
import java.io.*;
import java.util.*;

public class ccc18j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		int value4 = sc.nextInt();
		
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		
		if (value1 == 8 || value1 == 9) {
			flag1 = true;
		}
		if (value4 == 8 || value4 == 9) {
			flag2 = true;
		}
		if (value2 == value3) {
			flag3 = true;
		}
		
		if (flag1 == true && flag2 == true && flag3 == true) {
			System.out.println("ignore");
		}
		else {
			System.out.println("answer");
		}
	}
}
