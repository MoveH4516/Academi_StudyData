package 콜렉션벡터;

import java.util.Vector;

public class _02Vector클래스 {

	public static void main(String[] args) {
		
		/* 배열의 한계
		같은 자료형만 들어갈 수 있고, 한 번 선언을 하면 그 크기가 고정이 된다.
		
		<> 꺽쇠를 사용해 콜렉션 객체를 만들어서 해당 자료구조를 구현한 클래스를 사용할 수 있다.
		제네릭 (generic) 이라고 부른다.
		무조건 클래스만 들어간다. (int, double 은 불가능)
		Integer Double 등이 들어가야 한다.
		
		#주요 기능
		1. 추가 add
		2. 삭제 remove
		3. 삽입 add
		4. 수정 set
		5. 개수 capacity -> 10개씩 미리 만들어둠 size -> 추가한 만큼 증가함.
		6. 값읽기 get
		7. 전체 삭제 clear
		 */
		
		// 자동으로 배열의 길이를 조절해 주는 가변배열.
		Vector<Integer> vector1 = new Vector<Integer>();
		System.out.println(vector1.size());
		
	}
}
