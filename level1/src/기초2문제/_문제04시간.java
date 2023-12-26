package 기초2문제;
/*
개념
시간 계산
1시간 = 60분 = 60*60(3600) 
1분 = 60초 

		[문제1]
		4000초를 시간만 출력하시오.		  
		4000초를 시간을 제외하고 분만 출력하시오.
		4000초를 시간을 제외하고 초만 출력하시오.
		[문제2]
		123123초를 시간만
		123123초를 분만
		123123초를 초만 출력
*/
public class _문제04시간 {
	public static void main(String[] args) {
		
		int time = 4000;
		int hour = time / 3600;
		int min = (time % 3600) / 60;
		int sec = (time % 3600) % 60;
		// 굳이 3600과 60 따로 할 필요없이 time % 60으로도 충분하다. (똑같기 때문에)
		
		System.out.println("시간 : " + hour);
		System.out.println("분 : " + min);
		System.out.println("초 : " + sec);
		
		time = 123123;
		hour = time / 3600;
		min = (time % 3600) / 60;
		sec = time % 60;
		System.out.println("시간 : " + hour);
		System.out.println("분 : " + min);
		System.out.println("초 : " + sec);
		
		
	}
}
