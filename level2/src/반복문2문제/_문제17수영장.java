package 반복문2문제;

public class _문제17수영장 {
	public static void main(String[] args) {
		/* 
		[문제]
			철수와 민수는 같은 수영장에 다닌다.
			철수는 4일마다 한번씩 가고 민수는 5일마나 한번씩 같다.
			
			철수와 민수가 2월 3일에 처음 만났다면
			다음에 서로 만나는 날은 언제인지 구하시오.
		[정답]
			2024년 2월 23일
	 */
		
		int cheol = 4;
		int min = 5;
		
		int i = 1;
		while (true) {
			if (i % cheol == 0 && i % min == 0) {
				break;
			}
			
			i++;
		}
		System.out.println(i + "일 후");
		System.out.println("2월 " + (3 + i) + "일");
	}
}
