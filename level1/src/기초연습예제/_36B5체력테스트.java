package 기초연습예제;

public class _36B5체력테스트 {
	public static void main(String[] args) {
		/*
		[문제] 
		  	철수는 체력테스트 중이다. 체력테스트는 달리기와 윗몸일으키기 이다. 
		  	운동장을 5바퀴반을 도는데 11분 50초 이하 이면 통과이다.
		  	철수는 운동 장 2바퀴도는데 261초가 걸린다. 
		
		  	윗몸일으키기는 55초 동안 35개를 하면 통과이다. 
		  	철수는 3분동안 118개를 한다고했을때,
		  	철수는 통과할수있을까?
		  	 
		  	단, 철수는 항상 같은속도로 달리기와 윗몸일으키기를한다.
	  	
	  	[정답]
	  		false
	*/		
		
		int groundCut = 11 * 60 + 50;
		int cheolGr2 = 261;
		double cheolGr1 = cheolGr2 / 2.0;
		
		int upCutTime = 55;
		int upCutCnt = 35;
		int cheol3Cnt = 118;
		double cheolSecUpCnt = cheol3Cnt / 3.0 / 60;
		
		double cheolGr = cheolGr1 * 5.5;
		double cheolUpCnt = cheolSecUpCnt * upCutTime;
		
		boolean pass = cheolGr < groundCut && cheolUpCnt > upCutCnt;
		
		System.out.println(pass);
		
		
	}
}
