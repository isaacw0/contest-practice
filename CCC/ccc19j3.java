package CCC;
import java.io.*;
import java.util.*;

public class ccc19j3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String output = "";

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            int count = 1;

            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                }
                else {
                	output += count + " " + s.charAt(j - 1) + " ";
                    count = 1;
                }
            }
            output += count + " " + s.charAt(s.length() - 1);
            System.out.println(output);
            output = "";
        }
        
	}
}
