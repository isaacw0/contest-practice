package CCC;
import java.io.*;
import java.util.*;

public class ccc20j3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n = readInt();
		
		int a = 0;	
		
		int[] x = new int[n];
		int[] y =new int[n];
		for (int i = 0; i < n; i++) {
			String s = readLine();
			for (int k = 0; k < s.length(); k++) {
				char s1 = s.charAt(k);
				if (s1 == ',') {
					a = k; 
				}
			}
			x[i] = Integer.parseInt(s.substring(0, a));
			y[i] = Integer.parseInt(s.substring(a+1, s.length()));
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
	
		System.out.println(x[0] - 1 + "," + (y[0] - 1));
		System.out.println(x[n-1] + 1 + "," + (y[n-1] + 1));
		
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
