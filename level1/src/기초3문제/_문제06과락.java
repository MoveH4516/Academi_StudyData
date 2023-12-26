package 기초3문제;
/*
[문제]
	3과목의 평균이 60점 이상이면 합격이다.
	단, 평균이 합격일지라도, 어느 한 과목이 50점 미만이면 불합격이다.
	아래 시험점수는 합격인지 구하시오.
	int kor = 100;
	int eng = 87;
	int math = 49;
[정답]
	false
*/
public class _문제06과락 { // 과락 : 어떤 과목의 성적이 합격 기준에 못 미치는 일.
	public static void main(String[] args) {
		
		int kor = 100;
		int eng = 87;
		int math = 49;
		double average = (kor + eng + math) / 3.0;
		
		boolean result = average >= 60 && kor >=50 && eng >=50 && math >=50;
		System.out.println(result); // math < 50 이므로 false 출력
		System.out.println(!result); // !로 반대의 의미이므로 불합격 true 출력
		
		math = 50;
		average = (kor + eng + math) / 3.0;
		result = average < 60 || kor <50 || eng <50 || math <50;
		System.out.println(result); // 불합격 조건 false 출력
		
	}
}
