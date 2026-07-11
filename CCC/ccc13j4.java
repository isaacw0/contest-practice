package CCC;
import java.io.*;
import java.util.*;

public class ccc13j4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int t = readInt();
		int c = readInt();
		int count = 0;
		int[] a = new int[c];
		for (int i = 0; i < c; i++) {
			a[i] = readInt();
		}
		Arrays.sort(a);
		
		for (int i = 0; i < c; i++) {
			t -= a[i];
			if (t < 0) {
				break;
			}
			count++;	
		}
		
		
		System.out.println(count);
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
