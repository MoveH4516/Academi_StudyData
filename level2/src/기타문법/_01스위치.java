package 기타문법;

public class _01스위치 {
	public static void main(String[] args) {
		
		/*
		 	switch case 문법
		 	if - else if - else if 와 비슷한 문법
		 	
		 	사용법
		 	switch (비교대상) {
		 	case 값 : 내용
		 	break;
		 	}
		 */
		
		int age = 10;
		
		if (age < 20) {
			System.out.println("미성년자 입니다.");
		} else if (age >= 20 && age <= 65) {
			System.out.println("성인입니다.");
		} else if (age > 65) {
			System.out.println("노인입니다.");
		} else {
			System.out.println("비교대상이 아닙니다.");
		}
		
		switch (age) {
		case 10 : System.out.println("미성년자 입니다.");
		break;
		case 25 : System.out.println("성인");
		break;
		case 68 : System.out.println("노인");
		break;
		default : System.out.println("비교 대상 아님."); // 굳이 없어도 됨.
		}
		
		// 범위값을 비교할 경우에는 if 문을 주로 사용하고
		// 특정 값을 비교할 경우에는 switch 문을 사용한다.
		
	}
}
