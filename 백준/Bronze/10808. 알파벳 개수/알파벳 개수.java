import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = br.readLine();
		int [] memo = new int [26];
		for	(int i = 0; i < S.length(); i++) {
			memo[S.charAt(i) - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			sb.append(memo[i]).append(" ");
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
