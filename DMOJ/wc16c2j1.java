package DMOJ;
import java.io.*;
import java.util.*;

public class wc16c2j1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n = readInt();
		
		Mate[] a = new Mate[n];
		
		for (int i = 0; i < n; i++) {
			String name = next();
			int won = readInt();
			int lose = readInt();
			
			Mate p = new Mate(name, won, lose);
			a[i] = p;
		}
		
		Arrays.sort(a);
		
		if (a[0].l >= 1) {
			System.out.println("None");
		}
		else {
			System.out.println(a[0].s);
		}

		
		
	}
	
	public static class Mate implements Comparable<Mate> {
		String s;
		int w;
		int l;
		public Mate(String s, int w, int l) {
			this.s = s;
			this.w = w;
			this.l = l;
		}
		public int compareTo(Mate other) {
			
			if (this.l == 0 && other.l == 0);
			else if (this.l > other.l) return 1;
			else if (this.l < other.l) return -1;
		
			
			if (this.w > other.w) return -1;
			if (this.w < other.w) return 1;
			return 0;
		}
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
