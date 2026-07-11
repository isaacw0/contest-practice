package CCC;
import java.io.*;
import java.util.*;

public class ccc13s2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int max = readInt();
		int n = readInt();
		int ans = n;
		int[] weights = new int[n];
		
		int counter = 0;
		
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			weights[i] = readInt();
		}
		
		
		for (int i = 0; i < n; i++) {
			counter++;
			
			if (counter == 5) {
				total -= weights[i-4];
				counter--;
			}
			
			
			total += weights[i];
			
			if (total > max) {
				ans = i;
				break;		
			}
			
		}
		
		System.out.println(ans);
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
