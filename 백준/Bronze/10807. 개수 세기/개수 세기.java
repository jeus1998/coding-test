import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		var st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int target = Integer.parseInt(br.readLine());
		int answer = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == target) answer++;
		}
		System.out.println(answer);
	}
}
