package 메서드문제;

import java.util.Arrays;

class Return4 {
	
	String[][] run (String[][] student, String[][] score) {
		String[][] arr = null;
		arr = new String[student.length][8];
		int[] sum = new int[arr.length];
		double[] avg = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = student[i][2];
			arr[i][1] = student[i][0];
			arr[i][2] = student[i][1];
			for (int j = 0; j < score.length; j++) {
				if (score[j][0].equals(student[i][2])) {
					if (score[j][1].equals("국어")) {
						arr[i][3] = score[j][2];
					} else if (score[j][1].equals("수학")) {
						arr[i][4] = score[j][2];
					} else {
						arr[i][5] = score[j][2];
					}
					sum[i] += Integer.parseInt(score[j][2]);
				}
			}
			
			arr[i][6] = sum[i] + "";
			avg[i] = sum[i] / 3.0;
			arr[i][7] = String.format("%.2f", avg[i]);
		}
		
		return arr;
	}
	
	void print (String[][] result) {
		System.out.println("학생번호  이름  지역  국어 수학 영어 총합  평균");
		for (int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
	}
	
}

public class _문제08메서드연습문제 {
	public static void main(String[] args) {
		Return4 r = new Return4();
		
		String[][] student = {
				{"김철만", "신촌", "1001"},
				{"오상덕", "강남", "1002"},
				{"민철이", "대치", "1003"},
				{"유재석", "강동", "1004"}
		};
		String[][] score = {
				{"1001", "국어", "20"},
				{"1002", "국어", "50"},
				{"1003", "국어", "60"},
				{"1004", "국어", "17"},
				{"1001", "수학", "65"},
				{"1002", "수학", "15"},
				{"1003", "수학", "80"},
				{"1004", "수학", "70"},
				{"1001", "영어", "43"},
				{"1002", "영어", "90"},
				{"1003", "영어", "30"},
				{"1004", "영어", "70"},
		};
		String[][] result = r.run(student, score);
		r.print(result);
	}
}
