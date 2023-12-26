package 클래스기본;

class Member{
	int no;
	String id;
	String pw;
	String name;
	boolean isMan;
}

public class _01클래스이론1 {
	public static void main(String[] args) {
		
		//클래스는 내가 직접 설정한 자료형 배열 : 사용자 정의 타입
		//배열의 한계 : 같은 자료형만 들어간다.
		//			 인덱스 번호로만 접근이 가능하다.
		// 주석이 없다면 뭐가 뭔지 이해하기가 힘들다.
		
		Member m = new Member(); // Member 클래스로 만든 객체 (인스턴스) 
		System.out.println(m); // 주소값
		
		System.out.println(m.id);
		System.out.println(m.isMan);
		System.out.println(m.no);
		
	}
}
