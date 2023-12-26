package 클래스문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제12클래스배열학생과과목 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numList = {1001, 1002, 1003};
		String[] nameList = {"이만수", "김철만", "오수정"};
		
		int[] stuNumList = {1001, 1001, 1002, 1002, 1002, 1003};
		String[] subList = {"국어", "수학", "국어", "수학", "영어", "수학"};
		int[] scoreList = {100, 32, 23, 35, 46, 60};
		int[] rankList = {0, 0, 0, 0, 0, 0};
		
		Student[] stu = new Student[numList.length];
		for (int i = 0; i < stu.length; i++) {
			Student s = new Student();
			s.number = numList[i];
			s.name = nameList[i];
			stu[i] = s;
		}
		Subject[] sub = new Subject[stuNumList.length];
		for (int i = 0; i < sub.length; i++) {
			Subject su = new Subject();
			su.stuNum = stuNumList[i];
			su.name = subList[i];
			su.score = scoreList[i];
			su.rank = rankList[i];
			sub[i] = su;
		}
		String[] subj = new String[subList.length];
		for (int i = 0; i < subList.length; i++) {
			subj[i] = subList[i];
		}
		int cnt = 0;
		for (int i = 0; i < subj.length; i++) {
			for (int j = i + 1; j < subj.length; j++) {
				if (subj[i] == subj[j]) {
					subj[j] = "0";
				}
			}
			if (subj[i].equals("0")) {
				cnt++;
			}
		}
		System.out.println(Arrays.toString(subj));
		System.out.println(cnt);
		String[] subject = new String[cnt];
		int k = 0;
		for (int i = 0; i < subj.length; i++) {
			if (!subj[i].equals("0")) {
				subject[k] = subj[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(subject));
		while (true) {
			System.out.println("[0] 종료");
			System.out.println("[1] 학생 정보 출력");
			System.out.println("[2] 과목 정보 출력");
			System.out.println("[3] 과목별 랭킬 저장");
			System.out.println("[4] 과목별 랭킹 + 이름");
			System.out.println("[5] 과목별 랭킹 1등의 이름, 과목, 점수");
			int sel = sc.nextInt();
			if (sel == 0) {
				System.out.println("종료");
				break;
			} else if (sel == 1) {
				for (int i = 0; i < stu.length; i++) {
					System.out.printf("%d %s\n", stu[i].number, stu[i].name);
				}
			} else if (sel == 2) {
				for (int i = 0; i < sub.length; i++) {
					System.out.printf("%d %s %d %d\n", sub[i].stuNum, sub[i].name, sub[i].score, sub[i].rank);
				}
			} else if (sel == 3) {
				int cnt1 = 0;
				int[][] arr = new int[subject.length][];
				for (int j = 0; j < subject.length; j++) {
					cnt1 = 0;
					for (int i = 0; i < sub.length; i++) {
						if (subject[j].equals(sub[i].name)) {
							cnt1++;
						}
					}
					arr[j] = new int[cnt1];
					int a = 0;
					for (int i = 0; i < sub.length; i++) {
						if (subject[j].equals(sub[i].name)) {
							arr[j][a] = sub[i].score;
							a++;
						}
					}
				}
				System.out.println(Arrays.deepToString(arr));
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						for (int n = j; n < arr[i].length; n++) {
							if (arr[i][j] < arr[i][n]) {
								int temp = arr[i][j];
								arr[i][j] = arr[i][n];
								arr[i][n] = temp;
							}
						}
					}
				}
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						for (int n = 0; n < sub.length; n++) {
							if (arr[i][j] == sub[n].score && subject[i].equals(sub[n].name)) {
								sub[n].rank = j + 1;
							}
						}
					}
				}
				for (int i = 0; i < sub.length; i++) {
					System.out.printf("%d %s %d %d\n", sub[i].stuNum, sub[i].name, sub[i].score, sub[i].rank);
				}
			} else if (sel == 4) {
				k = 0;
				for (int i = 0; i < sub.length; i++) {
					if (sub[i].rank == 1 && subject[k].equals(sub[i].name)) {
						System.out.printf("");
					}
				}
			} else if (sel == 5) {
				
			} else {
				continue;
			}
		}
		sc.close();
	}
}
