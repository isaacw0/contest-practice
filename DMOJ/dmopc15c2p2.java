package DMOJ;
import java.io.*;
import java.util.*;

public class dmopc15c2p2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n = readInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int ap = 0;
		int bp = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = readInt();
		}
		for (int k = 0; k < n; k++) {
			b[k] = readInt();
		}
		
		for (int j = 0; j < n; j++) {
			if (a[j] > b[j]) {
				ap++;
			}
			else if (a[j] < b[j]) {
				bp++;
			}
		}
		
		String s = "";
		if (ap > bp) {
			s = "Xyene";
		}
		else if (ap == bp){
			s = "Tie";
		}
		else {
			s = "FatalEagle";
		}
		
		System.out.println(ap + " " + bp);
		System.out.println(s);
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
