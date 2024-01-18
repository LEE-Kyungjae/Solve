import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// 자연수 in
		int N = Integer.parseInt(in.readLine());
		// 완전탐색
		for (int i = 0; i < N; i++) {
			int number = i;
			Long sum = 0L;
			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}

			if (sum + i == N) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
