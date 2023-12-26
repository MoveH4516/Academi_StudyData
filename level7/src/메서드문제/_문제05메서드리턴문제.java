package 메서드문제;

import java.util.Arrays;

class Return1 {
	
	int[] run (String[] data, int[] result) {
		int cnt = 0;
		for (int i = 0; i < data.length; i++) {
			if (Integer.parseInt(data[i]) >= 60) {
				cnt++;
			}
		}
		result = new int[cnt];
		int idx = 0;
		for (int i = 0; i < data.length; i++) {
			if (Integer.parseInt(data[i]) >= 60) {
				result[idx] = Integer.parseInt(data[i]);
				idx++;
			}
		}
		return result;
	}
}

public class _문제05메서드리턴문제 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	main() 메서드 안에 data 배열은 학생 점수를 문자열 타입으로 저장한 것이다.
		 	점수는 0 ~ 100 사이이고 60점 이상이면 합격이다
		 	합격생의 점수만 result 배열에 담아서 리턴하는 run 메서드 구현
		 */
		Return1 r = new Return1();
		
		String[] data = {"34", "43", "76", "12", "64"};
		int[] result = null;
		
		System.out.println(Arrays.toString(r.run(data, result)));
	}
}
