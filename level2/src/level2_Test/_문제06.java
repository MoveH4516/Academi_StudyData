package level2_Test;

public class _문제06 {
	public static void main(String[] args) {
		/*
		[문제]
			9의 배수 중 100보다 큰 첫번째 배수를 출력하시오.
		[정답]
			108
			
		걸린시간 : 2분16초70
	 */
	
		int i = 1;
		
		while (true) {
			if (i % 9 == 0 && i > 100) {
				System.out.println(i);
				break;
			}
			i++;
		}
		
	}
}
