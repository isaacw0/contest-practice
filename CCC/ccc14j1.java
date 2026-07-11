package CCC;
import java.io.*;
import java.util.*;

public class ccc14j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ang1 = sc.nextInt();
		int ang2 = sc.nextInt();
		int ang3 = sc.nextInt();
		String output = "";
		
		boolean check = ang1 + ang2 + ang3 == 180;
		
		if (ang1 == 60 && ang2 == 60 && ang3 == 60) {
			output = "Equilateral";
		}
		else if (check) {
			if (ang1 == ang2 || ang2 == ang3 || ang3 == ang1) {
				output = "Isosceles";
			}
			else if (ang1 != ang2 && ang2 != ang3 && ang3 != ang1) {
				output = "Scalene";
			}
		}
		else if (check == false) {
			output = "Error";
		}
		
		System.out.println(output);
	}
}
