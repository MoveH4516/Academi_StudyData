package 클래스기본;

import java.util.Arrays;

public class _08클래스배열이론2 {
	public static void main(String[] args) {

		String[][] dataList = { 
				{ "1001", "qwer", "1234", "김철수", "10" }, 
				{ "1002", "asdf", "2345", "이영희", "30" }, 
		};

		// Student 클래스에 DataList를 넣어서 Student List 출력 
		Student[] stList = new Student[dataList.length];
		
		for (int i = 0; i < stList.length; i += 1) {
			Student s = new Student();
			s.number = Integer.parseInt(dataList[i][0]);
			s.id = dataList[i][1];
			s.pw = dataList[i][2];
			s.name = dataList[i][3];
			s.score = Integer.parseInt(dataList[i][4]);
			
			stList[i] = s;

		}
		System.out.println(Arrays.toString(stList));
		for (int i = 0; i < stList.length; i++) {
			System.out.println(stList[i].id);
		}
		for (Student s : stList) {
			System.out.printf("학번 : %d %n", s.number);
			System.out.printf("id : %s %n", s.id);
			System.out.printf("pw : %s %n", s.pw);
			System.out.printf("이름 : %s %n", s.name);
			System.out.printf("학점 : %d %n", s.score);
			System.out.println("-----------------");
		}
		
	}
}
