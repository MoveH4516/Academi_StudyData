package 클래스문제;


public class _문제13클래스배열학생과과목2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 샘플 문자열을 각 클래스 배열에 저장 후 출력
		 	
		 	2. 점수가 59점 이하인 과목은 삭제 후 문자열에 저장하고 출력
		 */
		
		
		String studentSample = "1001/이만수\n";
		studentSample += "1002/김철만\n";
		studentSample += "1003/오수정";
		
		String subjectSample = "";
		subjectSample += "1001/국어/100/0\n";
		subjectSample += "1001/수학/32/0\n";
		subjectSample += "1002/국어/23/0\n";
		subjectSample += "1002/수학/35/0\n";
		subjectSample += "1002/영어/46/0\n";
		subjectSample += "1003/수학/60/0";
		String[] arr1 = studentSample.split("\n");
		String[] arr2 = subjectSample.split("\n");
		Student[] stu = new Student[arr1.length];
		Subject[] sub = new Subject[arr2.length];
		int idx = 0;
		for (String s1 : arr1) {
			String[] assS1 = s1.split("/");
			Student st = new Student();
			st.number = Integer.parseInt(assS1[0]);
			st.name = assS1[1];
			stu[idx] = st;
			idx++;
		}
		idx = 0;
		for (String s2 : arr2) {
			String[] assS2 = s2.split("/");
			Subject sb = new Subject();
			sb.stuNum = Integer.parseInt(assS2[0]);
			sb.name = assS2[1];
			sb.score = Integer.parseInt(assS2[2]);
			sb.rank = Integer.parseInt(assS2[3]);
			sub[idx] = sb;
			idx++;
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.printf("%d %s\n", stu[i].number, stu[i].name);
		}
		System.out.println("------------------");
		for (Subject s : sub) {
			System.out.printf("%d %s %d %d\n", s.stuNum, s.name, s.score, s.rank);
		}
		System.out.println("------------------");
		idx = 0;
		for (Subject s : sub) {
			if (s.score <= 59) {
				sub[idx] = null;
			}
			if (sub[idx] != null) {
				System.out.printf("%d %s %d %d\n", s.stuNum, s.name, s.score, s.rank);
			}
			idx++;
		}
		
	}
}
