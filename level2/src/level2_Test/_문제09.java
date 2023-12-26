package level2_Test;

public class _문제09 {
	public static void main(String[] args) {
		
	/*
		[문제]
			27의 약수의 전체 합을 구하시오.
			예) 1, 3, 9, 27
		[정답]
			40
			
		걸린시간 : 42초10
	 */
		
		int i = 1;
		int sum = 0;
		while (i <=27) {
			if (27 % i == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
