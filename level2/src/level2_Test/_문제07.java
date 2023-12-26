package level2_Test;

public class _문제07 {
	public static void main(String[] args) {
		/*
        [문제]
            1980의 약수 중에서 순서대로 약수를 출력했을 때, 
            백의 자리가 3인 두 번째 약수를 출력하시오.
        [정답]
            396  
            
        걸린시간 : 2분40초81
    */
		
		int i = 1;
		int j = 0;
		while (i <= 1980) {
			if (1980 % i == 0) {
				if (i / 100 == 3) {
					System.out.println(i);
					j = i;
				}
			}
			i++;
		}
		System.out.println("정답 : " + j);
	}
}
