package CCC;
import java.io.*;
import java.util.*;

public class ccc15j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		String output = "";
		
		
		if (month > 2 || month == 2 && day > 18) {
			output = "After";
		}
		else if (month < 2 || month == 2 && day < 18) {
			output = "Before";
		}
		else if (month == 2 && day == 18) {
			output = "Special";
		}
		
		System.out.println(output);
	}
}
