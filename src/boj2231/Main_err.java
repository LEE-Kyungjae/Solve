package boj2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//�ݷ� ã�ƾ���
public class Main_err {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// �ڿ��� in
		String N = in.readLine();
		// int ������ ����
		int n = Integer.parseInt(N);
		String s = "";
		// ����Ž��
		for (int i = 0; i < n; i++) {
			Long sum = 0L;
			// ���ڸ����� ���ϴ� ����
			int length = (int) (Math.log10(i) + 1);
			sum += i;
			for (int j = 0; j < length; j++) {
				sum += Integer.toString(i).charAt(j) - '0';
				// ������ �Ǵ�����
				if (n == sum) {
					System.out.println(i);
					return;
				}

			}
		}
		System.out.println(0);
	}
}