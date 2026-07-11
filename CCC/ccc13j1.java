package CCC;
import java.io.*;
import java.util.*;

public class ccc13j1 {
	public static void main(String[] args) {
		int firstAge = 0;
		int secondAge = 0;
		int ageGap = 0;
		
		Scanner sc = new Scanner(System.in);
		
		firstAge = sc.nextInt();
		secondAge = sc.nextInt();
		ageGap = secondAge - firstAge;
		
		System.out.println(secondAge + ageGap);
		
	}
}
