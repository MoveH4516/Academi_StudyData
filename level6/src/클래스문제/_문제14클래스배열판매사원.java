package 클래스문제;

public class _문제14클래스배열판매사원 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	판매실적이 4 이상인 사원의 isBest 를 true 로 저장
		 	1. Member 클래스 배열을 완성 후 출력
		 	2. 판매 실적이 true 인 회원 출력
		 */
		
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/이만수,1002/김철수,1003/신민아,1004/박상아";
		
		Employee[] eList;
		String[] arr1 = data1.split(",");
		String[] arr2 = data2.split(",");
		eList = new Employee[arr2.length];
		int idx = 0;
		for (String s : arr2) {
			String[] s1 = s.split("/");
			Employee e = new Employee();
			e.no = Integer.parseInt(s1[0]);
			e.name = s1[1];
			for (String ss : arr1) {
				String[] s2 = ss.split("/");
				if (e.no == Integer.parseInt(s2[0])) {
					e.point += Integer.parseInt(s2[1]);
				}
			}
			eList[idx] = e;
			idx++;
		}
		for (int i = 0; i < eList.length; i++) {
			System.out.printf("%d %s %d\n", eList[i].no, eList[i].name, eList[i].point);
		}
		System.out.println("-----------------");
		for (int i = 0; i < eList.length; i++) {
			if (eList[i].point >= 4) {
				eList[i].isBest = true;
			}
			if (eList[i].isBest) {
				System.out.printf("%d %s %d\n", eList[i].no, eList[i].name, eList[i].point);
			}
		}
	}
}
