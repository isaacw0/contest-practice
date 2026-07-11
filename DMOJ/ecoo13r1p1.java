package DMOJ;
import java.io.*;
import java.util.*;

public class ecoo13r1p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int take = 0;
		int serve = 0;
		int left = 0;
		boolean eof = false;
		
		
		while (eof == false) {
			String current = sc.nextLine();
			
			
			if (current.equals("TAKE")){
				take++;
			}
			else if (current.equals("SERVE")){
				serve++;
			}
			else if (current.equals("CLOSE")){
				left = take - serve;
				n = n + take;
				
				if (n > 999) {
					while (n > 999) {
						n -= 999;
					}
				}
				
				System.out.println(take + " " + left + " " + n);
				serve = 0;
				take = 0;
			}
			else if (current.equals("EOF")) {
				eof = true;
			}
		}
	}
}
