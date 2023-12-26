package 배열심화문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _문제25문자심화1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	너무 긴 숫자는 int 에 저장이 불가능하다.
		 	long 을 사용하지 않고 두 숫자를 더하고 출력.
		 */
		Scanner sc = new Scanner(System.in);
		String data1 = sc.next();
		String data2 = sc.next();
		int max = 0;
		int min = 0;
		if (data1.length() <= data2.length()) {
			max = data2.length();
			min = data1.length();
		} else {
			max = data1.length();
			min = data2.length();
		}
		long n1 = Integer.parseInt(data1);
		long n2 = Integer.parseInt(data2);
		System.out.println(n1 + n2);
		String[] num1 = new String[data1.length()];
		String[] num2 = new String[data2.length()];
		for (int i = 0; i < data1.length(); i++) {
			num1[i] = data1.substring(i, i + 1);
		}
		for (int i = 0; i < data2.length(); i++) {
			num2[i] = data2.substring(i, i + 1);
		}
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		
		int[] result = new int[max + 1];
		int idx = 0;
		for (int i = result.length - 1; i >= 1; i--) {
			if (idx < min) {
				result[i] += Integer.parseInt(num1[num1.length - 1 - idx]) + Integer.parseInt(num2[num2.length - 1 - idx]);
			} else if (idx < max) {
				if (max == data1.length()) {
					result[i] += Integer.parseInt(num1[num1.length - 1 - idx]);
				} else {
					result[i] += Integer.parseInt(num2[num2.length - 1 - idx]);
				}
			} else {
				idx--;
			}
			if (result[i] >= 10) {
				result[i] -= 10;
				result[i - 1]++;
			}
			idx++;
		}
		System.out.println(Arrays.toString(result));
		String answer = "";
		if (result[0] == 0) {
			for (int i = 1; i < result.length; i++) {
				answer += result[i];
			}
		} else {
			for (int i = 0; i < result.length; i++) {
				answer += result[i];
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
