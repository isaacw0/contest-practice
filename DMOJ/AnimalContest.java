package DMOJ;
import java.io.*;
import java.util.*;

public class AnimalContest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		int c  = sc.nextInt();
		int d  = sc.nextInt();
		
		
		String output = "";
		
		if (a < b && c < d) {
		    output = "Go to the department store";
		}
		else if (a < b) {
		    output = "Go to the grocery store";
		}
		else if (c < d) {
		    output = "Go to the pharmacy";
		}
		else {
		    output = "Stay home";
		}
		
		System.out.println(output);
		
	}
}
