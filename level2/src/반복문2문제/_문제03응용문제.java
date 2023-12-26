package 반복문2문제;

public class _문제03응용문제 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	50~100 자연수중에서
		 	9의 배수의 개수를 출력
		 	답 : 6 (56, 63, 72, 81, 90, 99)
		 	
		 [문제]
		 	28의 배수 중에서 가장 큰 세자리 수를 출력
		 	
		 [문제]
		 	8의 배수를 작은 수 부터 5개 출력
		 */
		
		int i = 50;
		int cnt = 0;
		while (i <= 100) {
			if (i % 9 == 0) {
				cnt++;
			}	
			i++;
		}
		System.out.print(cnt + " (");
		i = 50;
		int compare = 0;
		while (i <= 100) {
			if (i % 9 == 0) {
				compare++;
				if (compare == cnt) {
					System.out.print(i);
				}else {
					System.out.print(i + ", ");
				}
			}
			i++;			
		}
		System.out.print(")");
		System.out.println("\n----------------------------");
		i = 100; // i를 999부터 1씩 줄여나가는 증감을 주고
		int j = 0;  // if문으로 28의 배수를 찾자마자 i = 0; or break;를 해주면
		while (i < 1000) { // 처음 찾는 값이 가장 큰 세자리 이며 반복문이 종료된다.
			if (i % 28 == 0) {
				j = i;
			}
			i++;
		}
		System.out.println(j);
		
		System.out.println("----------------------------");
		
		
		i = 0;
		cnt = 0;
		while (true) {
			if (cnt == 4) {
				break;
			}
			System.out.print(i + ", ");
			i += 8;
			cnt++;
		}
		System.out.println(i);
		

		
		
		
		
		
		
		
		System.out.println("----------------------------");
		i = 0; // 이렇게도 가능
		cnt = 0;
		while (true) {
			if (cnt == 5) {
				break;
			}
			System.out.print(cnt == 4 ? i : i + ", ");
			i += 8;
			cnt++;
		}		
	}
	
}
