package DMOJ;
import java.io.*;
import java.util.*;

public class cheerio1j2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n = readInt();
		int t = readInt();
		
		String[] names = new String[n];
		int[] distance = new int[n];
		
		for (int i = 0; i < n; i++) {
			names[i] = next();
			distance[i] = readInt();
		}
		String winner = "";
		int closest = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			int current = Math.abs(t - distance[i]);
			if (current < closest) {
				closest = current;
				winner = names[i];
				
			}
			
		}
		System.out.println(winner);
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
