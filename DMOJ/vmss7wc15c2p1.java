package DMOJ;
import java.io.*;
import java.util.*;

public class vmss7wc15c2p1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n = readInt();
		int ugly = 0;
		int [] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = readInt();
		}
		
		for (int i = 0; i < n; i++) { 
			if (i == 0) {
				if (a[i] <= 41 && a[i+1] <= 41) {
					ugly++;
				}
			}
			else if (i == n - 1) {
				if (a[i] <= 41 && a[i-1] <= 41) {
					ugly++;
				}
			}
			else if(a[i] <= 41 && a[i-1] <= 41 && a[i+1] <= 41) {
				ugly++;
			}
		}
		
		System.out.println(ugly);
		
	}

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}
