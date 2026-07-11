package CCC;
import java.io.*;
import java.util.*;

public class ccc17s2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n = readInt();
		int q = (n/2);
		int[] a = new int[n];	
		String output = "";
		
		
		for (int i = 0; i < n; i++) {
			a[i] = readInt();
		}
		Arrays.sort(a);
		
		if (n % 2 == 0) {
			for (int i = 0; i < q; i++) {
				// low
				output += a[q-1 - i] + " ";
				// high
				output += a[q + i] + " ";
			}
		}
		if (n % 2 == 1) {
			for (int i = 0; i < q; i++) {
				// low
				output += a[q - i] + " ";
				// high
				output += a[q+1 + i] + " ";
			}
		    output += a[0];
		}
		
		output = output.trim();
		System.out.println(output);
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
