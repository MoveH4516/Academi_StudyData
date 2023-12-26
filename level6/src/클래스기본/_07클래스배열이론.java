package 클래스기본;

import java.util.Arrays;

class Student {
	int number;
	String id;
	String pw;
	String name;
	int score;
}

public class _07클래스배열이론 {
	public static void main(String[] args) {
		
		// 같은 패키지에 이미 같은 이름의 클래스가 정의되어 있다면
		// 다시 생성이 불가능하다.
		// 따라서 다른 이름으로 클래스를 만들어야 한다.
		
		//String data="1001/qwer/1234/김철수/45";
		
		String[] info= {"1001","qwer","1234","김철수","45"};
		
		Student stu = new Student();
		stu.number = Integer.parseInt(info[0]);
		stu.id = info[1];
		stu.pw = info[2];
		stu.name = info[3];
		stu.score = Integer.parseInt(info[4]);
		
		String data2 = "1002/javaking/2222/박영희/87";
		String[] info2 = data2.split("/");
		
		Student stu2 = new Student();
		stu2.number = Integer.parseInt(info2[0]);
		stu2.id = info2[1];
		stu2.pw = info2[2];
		stu2.name = info2[3];
		stu2.score = Integer.parseInt(info2[4]);
		
		
		System.out.println(stu.name);
		System.out.println(stu2.name);
		
		
		String[][] datas = new String[4][]; // [null. null]
		datas[0] = info;
		datas[1] = info2;
		System.out.println(Arrays.deepToString(datas));
		System.out.println(datas[0][3]);
		System.out.println(datas[1][3]);
		
		// 클래스 배열은 Student 타입만 들어가는 배열공간만 만들었다 
		// 학생은 아직 만들지 않음!!! 
		Student[] students = new Student[4]; // [null. null]
		
		students[0] = stu;
		students[1] = stu2;
		students[2] = new Student(); // 객체생성을 따로 해줘야함!!! 
		System.out.println("----------");
		//java.lang.NullPointerException: 아직 학생 객체 만들지 않음!!! 
		System.out.println(students[2].name);  //null.name
	}
}
