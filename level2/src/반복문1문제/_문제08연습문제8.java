package 반복문1문제;

public class _문제08연습문제8 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1~200 사이의 숫자 중 다음 조건에 맞는 숫자를 출력
		 	조건) 6의 배수 중에서 100에 가장 가까운 수 출력
		 */
		
		int i = 1;
		int j = 0;
		
		while (i <= 200) {			
			if (i % 6 == 0 && 100 - i < 6 && i - 100 < 6) {
				j = i;
				System.out.print(j + " ");
			}
			i++;			
		}
		System.out.println();
		System.out.println(j);
		int k = j - 6;
		int diff1 = 100 - j;
		int diff2 = 100 - k;
		if (diff1 < 0) {
			diff1 *= -1;
		}
		if (diff2 < 0) {
			diff2 *= -1;
		}
		if (diff1 < diff2) {
			System.out.println("최종답" + j);
		} else {
			System.out.println("최종답" + k);
		}
	}		
}

