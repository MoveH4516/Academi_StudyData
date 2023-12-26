package 반복문2문제;

public class _문제02게임369_2단계 {
	public static void main(String[] args) {
		/*
		 [문제]
		 	1~50까지 반복을 한다.
		 	그 안에서 해당 숫자의 369게임의 결과를 출력
		 	각각의 숫자에 3이나 6이나 9가 두 개면"짝짝"을 출력
		 	각각의 숫자에 3이나 6이나 9가 하나면 "짝"을 출력
		 	3이나 6이나 9가 하나도 없으면 숫자 출력
		 */
		
		int i = 1;
		int cnt = 0;
		while (i <= 50) {
			boolean req1 = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
			boolean req2 = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			if (cnt % 10 == 0 && cnt != 0) {
				System.out.println();
			}
			if (req1 && req2) {
				System.out.print("짝짝 ");
			} else if ((req1 && !req2) || (!req1 && req2)) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");
			}			
			i++;
			cnt++;
		}
		
		int num1 = i / 10;
		cnt = num1 % 3 == 0 && num1 != 0 ?  cnt++ : cnt;
		System.out.println(cnt);
		
	}
}
