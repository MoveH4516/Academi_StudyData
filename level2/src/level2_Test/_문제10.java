package level2_Test;

public class _문제10 {
	public static void main(String[] args) {
		
		/*
		[문제]
			1,000이하의 숫자 중에서
			8의 배수를 큰 수부터 차례대로 4개 출력하시오.
		[정답]
			1000, 992, 984, 976
			
		걸린시간 : 1분23초61
	 */
		
		int i = 1000;
		int cnt = 0;
		while (i >= 1) {
			if (i % 8 == 0) {
				System.out.print(cnt == 3 ? i : i + ", ");
				cnt++;
			}
			if (cnt == 4) {
				break;
			}
			i--;
		}
	}
}
