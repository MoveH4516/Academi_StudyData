package 기초4문제;
/*
 	1. 점수를 입력받는다.
 	2. 점수가 60점 이상이면 합격, 60점 미만이면 불합격이다.
 	3. 단, 입력받은 정수가 음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 	ex) 점수를 잘못 입력 했습니다.
 */
import java.util.Scanner;

public class _문제10점수유효성검사 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력 하세요. : ");
		int score = sc.nextInt();
		boolean pass = score < 0 || score > 100;
		if (!pass) {
			if (score >= 60) {
				System.out.println("합격");
			}
			if (score < 60) {
				System.out.println("불합격");
			}
		}
		if (pass) {
		System.out.println("점수를 잘못 입력 했습니다.");
		}
		
		sc.close();
	}
}
