package level1_Test;

public class _문제03 {
	public static void main(String[] args) {
		/*
		[문제 3]
			연필 7타를 여학생 3명과 남학생 4명에게 남김없이 똑같이 나누어 주었다.
			여학생들이 받은 연필개수가 5의 배수이고,
			남학생들이 받은 연필개수가 3의 배수인지 여부를
			true 또는 false로 표현하시오.
			(연필 1타는 12자루)
		[정답]
			false
			
			3분38초22
	 */	
		
		int pen = 7 * 12;
		int girl = 3;
		int man = 4;
		int a = pen / (girl + man);
		int girlTotal = a * girl;
		int manTotal = a * man;
		
		boolean result1 = girlTotal % 5 == 0;
		boolean result2 = manTotal % 3 == 0;
		
		System.out.println("여학생이 받는 연필의 총 개수 : " + girlTotal);
		System.out.println("남학생이 받는 연필의 총 개수 : " + manTotal);
		System.out.println(result1);
		System.out.println(result2);
	}
}
