package 클래스문제;

import java.util.Random;
import java.util.Scanner;

public class _문제09클래스배열기본문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int max = 10;
		Student[] stList = new Student[max];
		int cnt = 0;
		int a = 0;
		while (true) {
			System.out.println("[1]학생추가 [2]학생삭제 [3]수정 [4]검색 [5]전체출력 [0]종료");
			int sel = sc.nextInt();
			if (sel < 0 || sel > 5) {
				continue;
			}
			if (cnt == 0 && sel != 1 && sel != 0) {
				System.out.println("정보 없음");
				continue;
			}
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				if (cnt == max) {
					System.out.println("정보 초과");
					continue;
				}
				Student s = new Student();
				s.number = 1001 + a;
				System.out.println("학생 아이디, 비밀번호, 이름 순서로 입력");
				sc.nextLine();
				s.id = sc.nextLine();
				s.pw = sc.nextLine();
				s.name = sc.nextLine();
				s.score = rd.nextInt(71) + 30;
				int idx = -1;
				for (int i = 0; i < cnt; i++) {
					if (stList[i].id.equals(s.id)) {
						idx = i;
						break;
					}
				}
				if (idx != -1) {
					System.out.println("중복 아이디 생성 불가");
					continue;
				}
				System.out.println("학생 추가 완료");
				stList[cnt] = s;
				cnt++;
				a++;
			} else if (sel == 2) {
				System.out.print("삭제할 아이디 : ");
				sc.nextLine();
				String id = sc.nextLine();
				int idx = -1;
				for (int i = 0; i < cnt; i++) {
					if (stList[i].id.equals(id)) {
						idx = i;
						break;
					}
				}
				if (idx == -1) {
					System.out.println("일치하는 아이디 없음.");
					continue;
				}
				for (int i = idx; i < cnt - 1; i++) {
					stList[i] = stList[i + 1];
				}
				stList[cnt] = null;
				cnt--;
				System.out.println("학생 삭제 완료");
			} else if (sel == 3) {
				System.out.print("수정할 학생의 학번 : ");
				int num = sc.nextInt();
				int idx = -1;
				for (int i = 0; i < cnt; i++) {
					if (stList[i].number == num) {
						idx = i;
						break;
					}
				}
				if (idx == -1) {
					System.out.println("일치하는 학번 없음.");
					continue;
				}
				System.out.print("수정할 점수 : ");
				int sco = sc.nextInt();
				if (sco < 0 || sco > 100) {
					System.out.println("점수 입력 오류");
					continue;
				}
				stList[idx].score = sco;
			} else if (sel == 4) {
				System.out.print("검색할 학생 이름 : ");
				sc.nextLine();
				String name = sc.nextLine();
				for (int i = 0; i < cnt; i++) {
					if (stList[i].name.equals(name)) {
						System.out.printf("학번 : %d 이름 : %s 점수 : %d\n",stList[i].number, stList[i].name, stList[i].score);
					}
				}
			} else if (sel == 5) {
				System.out.printf("%3s %5s %5s %5s %4s\n","학번", "id", "pw", "이름", "점수");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%4d  %5s  %5s %5s %4d\n", stList[i].number, stList[i].id, stList[i].pw, stList[i].name, stList[i].score);
				}
			}
		}
		sc.close();
	}
}
