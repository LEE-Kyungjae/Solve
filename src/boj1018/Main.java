package boj1018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.readLine();
		}
		System.out.println(count(arr));
		in.close();
	}

	private static int count(String[] arr) {
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				for (int k = 0; k < 2; k++) {
					char start = k == 0 ? 'W' : 'B';
					int count = 0;
					count = chess(arr, i, j, start, count);
					result = Math.min(result, count);
					if (result == 0) {
						return 0;

					}
				}

			}
		}
		return result;
	}

	private static int chess(String[] arr, int i, int j, char start, int count) {
		for (int n = 0; i < i + 8; n++) {
			for (int m = j; m < j + 8; m++) {
				if (start != arr[n].charAt(m)) {
					count++;
				}
				start = start == 'W' ? 'B' : 'W';
			}
			start = start == 'W' ? 'B' : 'W';
		}
		return count;
	}
}