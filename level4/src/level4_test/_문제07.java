package level4_test;

public class _문제07 {
	public static void main(String[] args) {					
				// [문제1] 여학생들 점수 총합과 남학생들의 점수 총합을 비교하고 점수가 더 큰쪽을 출력
				// [정답1] 남성 = 409
				
				// [문제2] 평균이 60점 이상이면 합격 : 합격생들 번호, 이름, 점수 출력 
				// [정답2] 
				//		1001번 = 이만수, 70.0점
				//		1004번 = 이철민, 70.0점
				//		1005번 = 오만석, 64.5점
				
				// [문제3] 국어점수가 수학점수 보다 큰 학생들 번호, 이름 출력 
				// [정답3] 
				//		1001번 = 이만수
				//		1002번 = 이영희
				//		1003번 = 김민정
				
				// [문제4] 1등 번호, 이름 출력 (여러명이면 전부 출력)
				// [정답4] 
				//		1001번 = 이만수
				//		1004번 = 이철민
		
		String[][] student = {
				//     번호      이름    성별   국어   수학
					{"1001" , "이만수" , "남", "100","40"},
					{"1002" , "이영희" , "여", "70", "30"},
					{"1003" , "김민정" , "여", "64", "15"},
					{"1004" , "이철민" , "남", "53", "87"},
					{"1005" , "오만석" , "남", "49", "80"},
					{"1006" , "최이슬" , "여", "14", "90"}
				};
		
		int sumMan = 0;
		int sumGirl = 0;
		
		for (int i = 0; i < student.length; i++) {
			for (int j = 3; j < student[i].length; j++) {
				if (student[i][2].equals("남")) {
					sumMan += Integer.parseInt(student[i][j]);
				} else {
					sumGirl += Integer.parseInt(student[i][j]);
				}
			}
		}
		if (sumMan > sumGirl) {
			System.out.println("남성 = " + sumMan);
		} else {
			System.out.println("여성 = " + sumGirl);
		}
		System.out.println("=============================");
		double[] avg = new double[student.length];
		
		int sum = 0;
		for (int i = 0; i < student.length; i++) {
			sum = 0;
			for (int j = 3; j < student[i].length; j++) {
				sum += Integer.parseInt(student[i][j]);
			}
			avg[i] = sum / 2.0;
			if (avg[i] >= 60) {
				System.out.printf("%s번 = %s %.1f점\n", student[i][0], student[i][1], avg[i]);
			}
		}
		System.out.println("=============================");
		for (int i = 0; i < student.length; i++) {
			if (Integer.parseInt(student[i][3]) > Integer.parseInt(student[i][4])) {
				System.out.printf("%s번 = %s\n", student[i][0], student[i][1]);
			}
		}
		System.out.println("=============================");
		int max = 0;
		for (int i = 0; i < student.length; i++) {
			sum = 0;
			for (int j = 3; j < student[i].length; j++) {
				sum += Integer.parseInt(student[i][j]);
			}
			if (sum > max) {
				max = sum;
			}
		}
		for (int i = 0; i < student.length; i++) {
			sum = 0;
			for (int j = 3; j < student[i].length; j++) {
				sum += Integer.parseInt(student[i][j]);
			}
			if (sum == max) {
				System.out.printf("%s번 = %s\n", student[i][0], student[i][1]);
			}
		}
	}
}
