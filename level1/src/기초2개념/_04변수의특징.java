package 기초2개념;

public class _04변수의특징 {
	public static void main(String[] args) {
		
		//변수는 하나의 값만 저장할 수 있다.
		//새로운 값을 저장하면 이전의 값은 사라진다.
		
		int num = 10;
		System.out.println(num);
		
		num = 15;
		System.out.println(num); // 15로 값을 다시 저장하였기 때문에 10이 아니라 15가 출력
		
	}
}
