package 객체지향;

import java.util.ArrayList;
import java.util.Scanner;

class Node3{
	private String mark;

	public Node3(String mark) {
		this.mark = mark;
	}
	
	public String getMark() {
		return mark;
	}
}

class Player{
	private String name;
	private String mark;
	
	public Player(String name, String mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public String getName() {
		return name;
	}
	public String getMark() {
		return mark;
	}
}

class TicTakToe{
	private ArrayList<Player> plist;
	private ArrayList<ArrayList<Node3>> list;
	private Scanner sc;
	private final int SIZE = 3;
	private int cnt;
	
	public TicTakToe() {
		plist = new ArrayList<Player>();
		list = new ArrayList<ArrayList<Node3>>();
		sc = new Scanner(System.in);
		cnt = 0;
	}
	
	private void inputNode() {
		for (int i = 0; i < SIZE; i++) {
			list.add(new ArrayList<Node3>());
			for (int j = 0; j < SIZE; j++) {
				list.get(i).add(new Node3(" "));
			}
		}
		plist.add(new Player("p1", "O"));
		plist.add(new Player("p2", "X"));
	}
	
	private void printGame() {
		for (int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				System.out.printf("[%s]",list.get(i).get(j).getMark());
			}
			System.out.println();
		}
	}
	
	private int getVal(String msg, int start, int end) {
		int num = 0;
		while (true) {
			try {
				System.out.println(msg);
				num = sc.nextInt() - 1;
				if (num < start - 1  || num > end - 1) {
					System.out.printf("%d ~ %d 사이 숫자 입력\n", start, end);
					continue;
				}
				return num;
			} catch (Exception e) {
				System.out.println("숫자 입력");
			}
		}
	}
	
	private boolean checkPass(int idx1, int idx2) {
		if (!list.get(idx1).get(idx2).getMark().equals(" ")) {
			System.out.println("이미 마크된 위치입니다.");
			return true;
		}
		return false;
	}
	
	private void playGame(int idx1, int idx2) {
		list.get(idx1).set(idx2, new Node3(plist.get(cnt % 2).getMark()));
		cnt++;
	}
	
	private boolean win1() {
		//가로 + 세로
		for (int i = 0; i < SIZE; i++) {
			int cnt1 = 0;
			int cnt2 = 0;
			for (int j = 0; j < SIZE; j++) {
				if (list.get(i).get(j).getMark().equals(plist.get((cnt + 1) % 2).getMark())) cnt1++;
				if (list.get(j).get(i).getMark().equals(plist.get((cnt + 1) % 2).getMark())) cnt2++;
			}
			if (cnt1 == 3 || cnt2 == 3) {
				System.out.println("가로세로");
				System.out.println(plist.get((cnt + 1) % 2).getName() + "의 승리");
				return true;
			}
		}
		
		
		return false;
	}
	
	private boolean win2() {
		int cnt1 = 0;
		for (int i = 0; i < SIZE; i++) {
			if (list.get(i).get(i).getMark().equals(plist.get((cnt + 1) % 2).getMark())) cnt1++;
		}
		if (cnt1 == 3) {
			System.out.println("\\");
			System.out.println(plist.get((cnt + 1) % 2).getName() + "의 승리");
			return true;
		}
		return false;
	}
	
	private boolean win3() {
		int cnt1 = 0;
		int j = 0;
		for (int i = SIZE - 1; i >= 0; i--, j++) {
			if (list.get(i).get(j).getMark().equals(plist.get((cnt + 1) % 2).getMark())) cnt1++;
		}
		if (cnt1 == 3) {
			System.out.println("/");
			System.out.println(plist.get((cnt + 1) % 2).getName() + "의 승리");
			return true;
		}
		return false;
	}
	
	private void printTurn() {
		if (cnt % 2 == 0) System.out.println(plist.get(0).getName() + " 차례");
		else System.out.println(plist.get(1).getName() + " 차례");
	}
	
	public void run() {
		inputNode();
		while (true) {
			printGame();
			if (win1() || win2() || win3()) break;
			if (cnt == 9) {
				System.out.println("무승부");
				break;
			}
			printTurn();
			int idx1 = getVal("인덱스1 입력", 1, 3);
			int idx2 = getVal("인덱스2 입력", 1, 3);
			if (checkPass(idx1, idx2)) continue;
			playGame(idx1, idx2);
		}
		sc.close();
	}
}

public class _07틱택토 {
	public static void main(String[] args) {
		
		TicTakToe tGame = new TicTakToe();
		tGame.run();
	}
}
