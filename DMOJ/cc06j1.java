package DMOJ;
import java.io.*;
import java.util.*;

public class cc06j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		int value4 = sc.nextInt();
		
		int cal = 0;
		
		
		if (value1 == 1) {
			cal += 461;
		}
		else if(value1 == 2) {
			cal += 431;
		}
		else if(value1 == 3) {
			cal += 420;
		}
			
		
		if (value2 == 1) {
			cal += 100;
		}
		else if(value2 == 2) {
			cal += 57;
		}
		else if(value2 == 3) {
			cal += 70;
		}	
		
		
		if (value3 == 1) {
			cal += 130;
		}
		else if(value3 == 2) {
			cal += 160;
		}
		else if(value3 == 3) {
			cal += 118;
		}	
		
		
		
		
		if (value4 == 1) {
			cal += 167;
		}
		else if(value4 == 2) {
			cal += 266;
		}
		else if(value4 == 3) {
			cal += 75;
		}
		
		
		System.out.println("Your total Calorie count is " + cal + ".");
	}
}
