package DMOJ;
import java.io.*;
import java.util.*;

public class wc161j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		String spooky = "";
		String o = "";
		
		for (int i = 0; i < s; i++) {
			o += "o";
		}
		
		spooky = "sp" + o + "ky";
		System.out.println(spooky);
	}
}
