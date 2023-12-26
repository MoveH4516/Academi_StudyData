package 객체지향;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Node{
	private String front;
	private String back;
	
	public Node(String front, String back) {
		this.front = front;
		this.back = back;
	}
	public String getFront() {
		return front;
	}
	public String getBack() {
		return back;
	}
	
	
}

class MemoryGame{
	private ArrayList<Node> list;
	private String[] card = {"1", "1", "2", "2", "3", "3", "4", "4", "5", "5"};
	final private int SIZE;
	private Random rd;
	private Scanner sc;
	
	public MemoryGame(int size) {
		this.SIZE = size;
		list = new ArrayList<Node>();
		rd = new Random();
		sc = new Scanner(System.in);
	}
	private void shuffle() {
		for (int i = 0; i < SIZE;) {
			int idx = rd.nextInt(10);
			if (card[idx] != null) {
				list.add(new Node(" ", card[idx]));
				card[idx] = null;
				i++;
			}
		}
	}
	
	private void print() {
		for (int i = 0; i < SIZE; i++) {
			System.out.printf("[%s]",list.get(i).getFront());
		}
		System.out.println();
	}
	
	private int getVal(String msg, int start, int end) {
		int num = 0;
		while (true) {
			try {
				System.out.println(msg);
				num = sc.nextInt() - 1;
				if (num < 0 || num > end) {
					System.out.printf("%d ~ %d 숫자 입력");
					continue;
				}
				return num;
			} catch(Exception e) {
				System.out.println("숫자 입력");
				sc.nextLine();
			}
		}
	}
	
	private boolean checkIdx(int idx1, int idx2) {
		if (idx1 == idx2) {
			System.out.println("동일 인덱스 선택 불가");
			return true;
		}
		if (!list.get(idx1).getFront().equals(" ") || !list.get(idx2).getFront().equals(" ")) {
			System.out.println("이미 뒤집어진 카드입니다.");
			return true;
		}
		
		return false;
	}
	
	private void checkAnswer(int idx1, int idx2) {
		for (int i = 0; i < SIZE; i++) {
			if (i == idx1 || i == idx2) System.out.printf("[%s]",list.get(i).getBack());
			else System.out.printf("[%s]",list.get(i).getFront());
		}
		System.out.println();
		if (list.get(idx2).getBack().equals(list.get(idx1).getBack())) {
			System.out.println("정답");
			Node temp = new Node(list.get(idx1).getBack(), " ");
			list.set(idx1, temp);
			temp = new Node(list.get(idx2).getBack(), " ");
			list.set(idx2, temp);
		} else System.out.println("오답");
	}
	
	public void run() {
		shuffle();
		while (true) {
			print();
			int idx1 = getVal("인덱스 입력1", 1, 10);
			int idx2 = getVal("인데스 입력2", 1, 10);
			if (checkIdx(idx1, idx2)) continue;
			checkAnswer(idx1, idx2);
		}
	}
}

public class _04캡슐화연습 {
	public static void main(String[] args) {
		
		MemoryGame game = new MemoryGame(10);
		game.run();
		
	}
}
