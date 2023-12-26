package level2_Test;

import java.util.Random;

public class _문제02 {
	public static void main(String[] args) {
		
		/*
		 * # 랜덤학생
		 * 1. 10회 반복을 한다.
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		 * 3. 성적이 60점 이상이면 합격생이다.
		 * ---------------------------------------
		 * . 전교생(10명)의 총점과 평균을 출력한다.
		 * . 합격자 수를 출력한다.
		 * . 1등 학생의 번호와 성적을 출력한다.
		 
		 
		 걸린시간 6분00초00
		 */
		Random rd = new Random();
		int i = 1;
		int cnt = 0;
		int max = 0;
		int j = 0;
		int sum = 0;
		
		while (i <= 10) {
			int num = rd.nextInt(100) + 1;
			System.out.printf("%d 학생의 점수 : %d\n",i ,num);
			sum += num;
			if (num >= 60) {
				cnt++;
			}
			if (max < num) {
				max = num;
				j = i;
			}
			i++;
		}
		double avg = sum / 10.0;
		System.out.println("합격자 수 : " + cnt + "명");
		System.out.println("총점 : " + sum + "점 평균 : " + avg + "점");
		System.out.println("1등 학생의 번호 : " + j + " 성적 : " + max + "점");
	}
}
