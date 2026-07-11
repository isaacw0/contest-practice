package CCC;
import java.io.*;
import java.util.*;

public class ccc18s1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n = readInt();
		int[] villages = new int[n];
		for (int i = 0; i < n; i++) {
			villages[i] = readInt();
		}
		double lowest = Integer.MAX_VALUE;
		
		Arrays.sort(villages);
		
		for (int i = 1; i < n - 1; i++) {
			
			double a = (villages[i] - villages[i-1])/2.0;
			double b = (villages[i+1] - villages[i])/2.0;
			double c = a + b;
			
			if (c < lowest) lowest = c;
			
		}
		
		
		System.out.printf("%.1f", lowest);
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
