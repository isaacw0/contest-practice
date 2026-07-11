package CCC;
import java.io.*;
import java.util.*;

public class ccc19j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int apple1 = sc.nextInt();
		int apple2 = sc.nextInt();
		int apple3 = sc.nextInt();
		int banana1 = sc.nextInt();
		int banana2 = sc.nextInt();
		int banana3 = sc.nextInt();
		
		
		int apple = apple1*3 + apple2*2 + apple3;
		int banana = banana1*3 + banana2*2 + banana3;
		
		if (apple > banana) {
			System.out.println('A');
		}
		else if (banana > apple){
			System.out.println('B');
		}
		else {
			System.out.println('T');
		}
	}
}
