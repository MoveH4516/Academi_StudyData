package 기초연습예제;

public class _24A6색종이 {
	public static void main(String[] args) {
	/*
		[문제]
			색종이가 20장있다.
			색종이를 3명이 똑같은 개수로 나눠가지면 총 몇 장을 가질 수 있는지 구하시오.
			또한 색종이를 3명이 똑같이 나눠가지고 남은 색종이도 구하시오.
		[정답]
			6장
			2장
	 */
		
		int paper = 20;
		int people = 3;
		int result = paper / people;
		int rest = paper % people;
		
		System.out.println(result + "장");
		System.out.println(rest + "장");
	}
}
