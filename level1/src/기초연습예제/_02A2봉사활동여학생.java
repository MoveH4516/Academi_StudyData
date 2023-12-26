package 기초연습예제;

public class _02A2봉사활동여학생 {
	public static void main(String[] args) {
		/*
		[문제]
			철수네 반 학생은 30명입니다.
			남학생은 15명, 여학생은 15명입니다.
			이 중에서 남학생은 3명, 여학생은 남학생의 3배의 학생이 봉사활동을 하였습니다.
			봉사활동을 하지 않은 여학생은 몇 명인지 구하시오.
		[정답]
			6명
	*/	
		
		int classMember = 30;
		int man = 15;
		int girl = classMember - man;
		int manVol = 3;
		int girlVol = manVol * 3;
		
		int result = girl - girlVol;
		System.out.println(result + "명");
		
	}
}
