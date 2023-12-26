package 클래스문제;

import java.util.Scanner;

class School {
	String name = "";
	int cnt = 5;
	int[] arNum = {1001, 1002, 1003, 1004, 1005};
	int[] arScore = {92, 38, 87, 100, 11};
	String[] arName = {"둘리", "고길동", "또치", "마이클", "조던"};
}

public class _문제03학생성적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School s = new School();
		String name = sc.nextLine();
		while (true) {
			s = new School();
			s.name = name;
			int max = 0;
			int min = s.arScore[0];
			String temp = "";
			String[] copy = s.arName;
			int idx = 0;
			System.out.println("===" + s.name + "===");
			System.out.println("1. 전교생 성적 확인");
			System.out.println("2. 1등학생 성적 확인");
			System.out.println("3. 꼴등 학생 성적 확인");
			System.out.println("4. 성적 확인하기(이름순)");
			System.out.println("5. 종료하기");
			
			int sel = sc.nextInt();
			if (sel < 1 || sel > 5) {
				continue;
			}
			
			if (sel == 1) {
				for (int i = 0; i < s.cnt; i++) {
					System.out.printf("%d번 %s : %d점\n", s.arNum[i], s.arName[i], s.arScore[i]);
				}
			} else if (sel == 2) {
				for (int i = 0; i < s.cnt; i++) {
					if (s.arScore[i] > max) {
						max = s.arScore[i];
						idx = i;
					}
				}
				System.out.printf("%d번 %s : %d점\n", s.arNum[idx], s.arName[idx], s.arScore[idx]);
			} else if (sel == 3) {
				for (int i = 0; i < s.cnt; i++) {
					if (s.arScore[i] < min) {
						min = s.arScore[i];
						idx = i;
					}
				}
				System.out.printf("%d번 %s : %d점\n", s.arNum[idx], s.arName[idx], s.arScore[idx]);
			} else if (sel == 4) {
				for (int i = 0; i < s.cnt; i++) {
					for (int j = i; j < s.cnt; j++) {
						if (copy[i].compareTo(copy[j]) > 0) {
							temp = copy[i];
							copy[i] = copy[j];
							copy[j] = temp;
							
							int tem = s.arScore[i];
							s.arScore[i] = s.arScore[j];
							s.arScore[j] = tem;
							
							tem = s.arNum[i];
							s.arNum[i] = s.arNum[j];
							s.arNum[j] = tem;
						}
					}
					System.out.printf("%d번 %s : %d점\n", s.arNum[i], copy[i], s.arScore[i]);
				}
				copy = null;
			} else {
				break;
			}
			
		}
		sc.close();
	}
}
