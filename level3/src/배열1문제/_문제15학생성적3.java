package 배열1문제;

public class _문제15학생성적3 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1등학생의 학번과 성적을 출력
		 */
		
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList = {87, 11, 45, 98, 23};
		int max = 0;
		int num = 0;
		for (int i = 0; i < scoreList.length; i++) {
			if (max < scoreList[i]) {
				max = scoreList[i];
				num = numberList[i];
			}
		}
		System.out.printf("%d번(%d점)", num, max);
	}
}
