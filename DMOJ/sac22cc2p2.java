package DMOJ;
import java.io.*;
import java.util.*;

public class sac22cc2p2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n = readInt();
		int [][] tank = new int[n][n];
		int q = readInt();
		
		int total = 0;
		for (int i = 0; i < q; i++) {
			int query = readInt();
			// cookie
			if (query == 1) {
				int x = readInt();
				int y = readInt();
				tank[x-1][y-1]+= 1;
			}
			
			// sprinkle
			else {
				int x1 = readInt();
				int y1 = readInt();
				int x2 = readInt();
				int y2 = readInt();

				for (int j = x1 - 1; j <= x2 - 1; j++) {
					for (int k = y1 - 1; k <= y2 - 1; k++) {
						total += tank[j][k];
					}
				}
			}
		}
		
		System.out.println(total);
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
