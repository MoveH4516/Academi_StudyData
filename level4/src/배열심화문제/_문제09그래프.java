package 배열심화문제;

public class _문제09그래프 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 scoreList 데이터는 학생 6명의점수이다.
		 	이 데이터를 그래프로 표현하려고 한다.
		 	표시는 10의 자리 숫자로 표현해서
		 	개수만큼 *로 출력하시오.
		 */
		
		int[] scoreList = {31, 76, 54, 2, 100, 23};
		int star = 0;
		for (int i = 0; i < scoreList.length; i++) {
			System.out.printf("%3d : ", scoreList[i]);
			star = scoreList[i] / 10;
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================================");
		
		int max = 0;
		int[] stars = new int[scoreList.length]; 
		for (int i = 0; i < scoreList.length; i++) {
			if (max < scoreList[i]) {
				max = scoreList[i];
			}
		}	
		for (int j = 0; j < scoreList.length; j++) {
			stars[j] = scoreList[j] / 10;
		}
		int k = max / 10;
		for (int i = 0; i < max / 10; i++) {			
			for (int j = 0; j < scoreList.length; j++) {
				if (k - stars[j] <= 0) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			k--;
		System.out.println();			
		}
		
		for (int i = 0; i < scoreList.length; i++) {
			System.out.printf("%d\t", scoreList[i]);
		}
	}
}
