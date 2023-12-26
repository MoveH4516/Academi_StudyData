package 기초연습예제;

public class _06A3차비 {
	public static void main(String[] args) {
		/*
		[문제]
			철수는 집에서 학교까지 버스를 타고 다닌다.
			철수의 버스비는 1,200원이다.
			
			철수는 학교가 끝나면 바로 학원을 간다.
			학원을 갈때는 지하철을 이용한다.
			지하철 요금은 1,100원이다.
			
			철수가 학원에서 집으로 바로 올때는 1,300원의 차비가 든다.
			철수가 학교에서 집으로 바로 올때는 1,200원의 차비가 든다.
			
			학교는 월화수목금 매일 다닌다.
			학원은 월수금만 다닌다.
			
			이번 달에 철수는 4주 동안 학교와 학원을 다녔다.
			이번 달 필요한 총 차비를 구하시오.
		[정답]
			62,400원
	 */	
		
		int bus = 1200;
		int train = 1100;
		int home1 = 1200;
		int home2 = 1300;
		int school = 5;
		int academy = 3;
		
		int goschool = bus * school;
		int goacademy = train * academy;
		int gohome1 = home1 * (school - academy);
		int gohome2 = home2 * academy;
		int week = 4;
		int totalCost = (goschool + goacademy + gohome1 + gohome2) * week;
		
		System.out.println(totalCost + "원");		
	}
}
