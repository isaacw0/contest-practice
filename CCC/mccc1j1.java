package CCC;
import java.io.*;
import java.util.*;

public class mccc1j1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n1 = readInt();
		int n2 = readInt();
		int n3 = readInt();
		int n4 = readInt();
		
		int max = Math.max(Math.max(n1,  n2), Math.max(n3, n4));
		int min = Math.min(Math.min(n1, n2), Math.min(n3, n4));
		
		System.out.println(min);
		System.out.println(max);
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
