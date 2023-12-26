package 배열심화문제2;

public class _문제12문자열검색 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	문제1) 여학생과 남학생의 총점 비교
		 	
		 	문제2) 평균이 60점 이상이면 합격 합격자 출력
		 	
		 	문제3) 국어점수 > 수학점수 학생 출력
		 	
		 	문제4) 1등 출력
		 */
		
		String[][] student = {
				{"1001", "이만수", "남" },
				{"1002", "이영희", "여" },
				{"1003", "김민정", "여" },
				{"1004", "이철민", "남" },
				{"1005", "오만석", "남" },
				{"1006", "최이슬", "여" }
		};
		int[][] score = {
				{1005, 49, 100},
				{1001, 10, 20},
				{1003, 64, 65},
				{1002, 70, 30},
				{1004, 13, 87},
				{1006, 14, 90}
		};
		int fScore = 0;
		int mScore = 0;
		String quiz2 = "";
		String quiz3 = "";
		int max = 0;
		int maxIdx = 0;
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[j][0] == Integer.parseInt(student[i][0])) {
					if (student[i][2].equals("남")) {
						mScore += score[j][1] + score[j][2];
					} else {
						fScore += score[j][1] + score[j][2];
					}
					sum = score[j][1] + score[j][2];
					avg = sum / 2.0;
					if (avg >= 60) {
						quiz2 += student[i][0] + "번 " + student[i][1] + ", " + avg + "점\n";		
					}
					if (score[j][1] > score[j][2]) {
						quiz3 += student[i][0] + "번 " + student[i][1];
					}				
					if (max < sum) {
						max = sum;
						maxIdx = i;
					}				
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			
		}
		if (mScore > fScore) {
			System.out.println("남성 = " + mScore);
		} else if (fScore > mScore) {
			System.out.println("여성 = " + fScore);
		} else {
			System.out.println("총점이 같다.");
		}
		System.out.print(quiz2);
		System.out.println(quiz3);
		System.out.println(student[maxIdx][0] + "번 " + student[maxIdx][1]);
	}
}
