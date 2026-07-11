package CCC;
import java.io.*;
import java.util.*;

public class ccc08j2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		LinkedList<Character> playlist = new LinkedList<>();
		playlist.add('A');
		playlist.add('B');
		playlist.add('C');
		playlist.add('D');
		playlist.add('E');
		String ans = "";
		char temp = 'A';
		
		while(true) {
			int b = readInt();
			int n = readInt();
			
			for (int i = 0; i < n; i++) {
				if (b == 1) {
					temp = playlist.get(0);
					playlist.remove(0);
					playlist.add(temp);
				}
				else if(b == 2) {
					temp = playlist.get(playlist.size() - 1);
					playlist.add(0, temp);
					playlist.remove(playlist.size() - 1);
				}
				else if(b == 3) {
					temp = playlist.get(0);
					playlist.set(0, playlist.get(1));
					playlist.set(1, temp);
				}
				else if(b == 4) {
					for (char k : playlist) {
						ans += k + " ";
					}
					ans = ans.trim();
					System.out.println(ans);
					break;
				}
			}
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
