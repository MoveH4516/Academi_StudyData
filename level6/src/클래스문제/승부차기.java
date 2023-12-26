package 클래스문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class KeeperRd {
	Random rd = new Random();
	Goal a = new Goal();
	int keeIdx1;
	int keeIdx2;
	
	void idx () {
		keeIdx1 = rd.nextInt(3) + 1;
		keeIdx2 = rd.nextInt(7) + 1;
	}
	void run() {
		idx();
		a = new Goal();
		for (int i = -1; i <= 1; i++) {
			if (keeIdx1 + i >= 1 && keeIdx1 + i <= 3) {
				a.goal[keeIdx1 + i][keeIdx2] = 5;
			}
			if (keeIdx2 + i >= 1 && keeIdx2 + i <= 7) {
				a.goal[keeIdx1][keeIdx2 + i] = 5;
			}
		}
	}
}

public class 승부차기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Goal a = new Goal();
		KeeperRd k = new KeeperRd();
		
		Keeper[] kee = new Keeper[3];
		Kicker[] kick = new Kicker[3];
		String[] keename = {"minsu", "cheolsu", "jinsu"};
		String[] kickname = {"minji", "younghee", "sujin"};
		for (int i = 0; i < 3; i++) {
			kee[i] = new Keeper();
			kick[i] = new Kicker();
			kee[i].ability = rd.nextInt(21) + 90;
			kee[i].name = keename[i];
			kick[i].accAb = rd.nextInt(21) + 80;
			kick[i].powerAb = rd.nextInt(31) + 90;
			kick[i].name = kickname[i];
		}
		int[] idx = {1, 2, 3};
		for (int i = 0; i < 100; i++) {
			int num = rd.nextInt(3);
			int temp = idx[0];
			idx[0] = idx[num];
			idx[num] = temp;
		}
		System.out.println(Arrays.toString(idx));
		int[] idx1 = {1, 2, 3};
		for (int i = 0; i < 100; i++) {
			int num = rd.nextInt(3);
			int temp = idx1[0];
			idx1[0] = idx1[num];
			idx1[num] = temp;
		}
		System.out.println(Arrays.toString(idx1));
		int selKee = 0;
		int selKick = 0;		
		while (true) {
			System.out.println("[ ? ][ ? ][ ? ]");
			System.out.println("골키퍼 뽑기(1, 2, 3)");
			selKee = sc.nextInt();
			System.out.println("[ ? ][ ? ][ ? ]");
			System.out.println("키커 뽑기(1, 2, 3)");
			selKick = sc.nextInt();
			if (selKee > 0 && selKick > 0 && selKee < 4 && selKick < 4) {
				break;
			} else {
				System.out.println("1~3번 선택");
			}
		}
		System.out.println("골키퍼");
		System.out.println("이름 : " + kee[idx[selKee - 1] - 1].name);
		System.out.println("능력치 : " + kee[idx[selKee - 1] - 1].ability);
		System.out.println("키커");
		System.out.println("이름 : " + kick[idx1[selKick - 1] - 1].name);
		System.out.println("슛파워 : " + kick[idx1[selKick - 1] - 1].powerAb);
		System.out.println("슛정확도 : " + kick[idx1[selKick - 1] - 1].accAb);
	
		int index1 = 3;
		int index2 = 4;
		a.goal[3][4] = 9;
		int cnt = 0;
		int[] check = new int[5];
		while (true) {
			boolean run = false;
			for (int i = 0; i < check.length; i++) {
				if (check[i] == 1) {
					System.out.print(" X ");
				} else if (check[i] == 2){
					System.out.print(" O ");
				} else {
					System.out.print(" - ");
				}
			}
			System.out.println();
			for (int i = 0; i < a.goal.length; i++) {
				for (int j = 0; j < a.goal[i].length; j++) {
					if (a.goal[i][j] == 3) {
						System.out.print("┏");
					} else if (a.goal[i][j] == 4) {
						System.out.print("┓");
					} else if (a.goal[i][j] == 1) {
						System.out.print("┃");
					} else if (a.goal[i][j] == 2) {
						System.out.print("━━");
					} else if (a.goal[i][j] == 0) {
						System.out.print("  ");
					} else {
						System.out.print("● ");
					}
				}
				System.out.println();
			}
			if (cnt == 5) {
				break;
			}
			System.out.print("     ↑(4) 슛(5)\n");
			System.out.print("←(1) ↓(2) →(3)");
			int move = sc.nextInt();
			if (move < 1 || move > 5) {
				continue;
			}
			int move1 = index1;
			int move2 = index2;
			if (move == 1) {
				index2--;
			} else if (move == 2) {
				index1++;
			} else if (move == 3) {
				index2++;
			} else if (move == 4) {
				index1--;
			} else if (move == 5) {
				cnt++;
				run = true;
			}
			if (index1 < 0 || index2 < 0 || index1 >= 4|| index2 >= 9) {
				index1 = move1;
				index2 = move2;
				continue;
			}
			a = new Goal();
			if (run) {
				k.run();
				for (int i = 0; i < k.a.goal.length; i++) {
					System.out.println(Arrays.toString(k.a.goal[i]));
				}
				if (k.a.goal[index1][index2] == 5) {
					System.out.println("골키퍼 선방");
					check[cnt - 1] = 1;
				} else if (a.goal[index1][index2] == 0) {
					System.out.println("골");
					check[cnt - 1] = 2;
				} else {
					System.out.println("실축");
					check[cnt - 1] = 1;
				}
			}
			a.goal[index1][index2] = 9;
		}
		sc.close();
	}
}
