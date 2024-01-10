package boj1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_speed_sol {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Long X = Long.parseLong(in.readLine()) - 1;
		int n = 0;
		// ���ʿ� �и� ���� ���� �ϳ��� 1�̱⶧���� �и���ڸ� ���� ���������� �ʿ䰡 ����.
		int index = 0;
		if (X == 1) {
			System.out.println("1/1");
			return;
		}

		while (n <= X) {
			index++;
			n += index;
		}
		n -= index;

		if (n == X) {
			if (index % 2 == 0) {
				System.out.println("1/" + (index - 1));
			} else {
				System.out.println(index - 1 + "/1");
			}
		} else {
			n++;
			int answer1 = (index % 2 == 0) ? 1 : index;
			int answer2 = (index % 2 == 0) ? index : 1;

			int delta = (index % 2 == 0) ? 1 : -1;
			answer1 += (X - n) * delta;
			answer2 -= (X - n) * delta;
			System.out.println(answer1 + "/" + answer2);
		}
	}
}
