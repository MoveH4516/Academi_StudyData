package 문자열기본문제;

public class _문제04문자열문제1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	id 배열은아이디를 저장한 것
		 	find 변수는 로그인할 아이디
		 	find 의 값이 id 배열에 있으면 "로그인 성공"
		 	없으면 "로그인 실패" 출력
		 */
		
		String[] id = {"qewr", "asdf", "zxc"};
		String find = "zxc";
		
		for (int i = 0; i < id.length; i++) {
			if (find.equals(id[i])) {
				System.out.println("로그인 성공");
				break;
			}
			if (i == id.length - 1) {
				System.out.println("로그인 실패");
			}
		}
	}
}
