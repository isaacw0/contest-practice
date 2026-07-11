package DMOJ;
import java.io.*;
import java.util.*;

public class wc17c1j2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int tempc = sc.nextInt();
		double five = 5;
		double nine = 9;
		double reference = five/nine;
		double tempf = (tempc/reference) + 32;
		System.out.println(tempf);
	}
}
