package 객체지향;

import java.util.ArrayList;
import java.util.Random;

class Node2 {
	private int num;

	public int getNum() {
		return num;
	}

	public Node2(int num) {
		this.num = num;
	}
	
}

class Game1to50{
	private ArrayList<ArrayList<Node2>> list;
	private final int SIZE = 5;
	private Random rd;
	private int gameNum;
	
	private void init() {
		list = new ArrayList<ArrayList<Node2>>();
		rd = new Random();
		gameNum = 1;
	}
	
	private void inputData() {
		int[] arr = new int[25];
		for (int i = 0; i < 25; i++) {
			arr[i] = i + 1;
		}
		for (int k = 0; k < SIZE; k++) {
			list.add(new ArrayList<Node2>());
			for (int i = 0; i < 5;) {
				int idx = rd.nextInt(25);
				if (arr[idx] != -1) {
					list.get(k).add(new Node2(arr[idx]));
					i++;
					arr[idx] = -1;
				}
			}
		}
		for (int i = 25; i < 50; i++) {
			arr[i - 25] = i + 1;
		}
		for (int k = SIZE; k < SIZE + SIZE; k++) {
			list.add(new ArrayList<Node2>());
			for (int i = 0; i < 5;) {
				int idx = rd.nextInt(25);
				if (arr[idx] != -1) {
					list.get(k).add(new Node2(arr[idx]));
					i++;
					arr[idx] = -1;
				}
			}
		}
	}
	
	private void printGameInit() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.printf("%2d ", list.get(i).get(j).getNum());
			}
			System.out.println();
		}
	}
	
	private int[] getVal() {
		int[] num = new int[2];
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < SIZE; j++) {
				if (list.get(i).get(j).getNum() == gameNum) {
					num[0] = i;
					num[1] = j;
					return num;
				}
			}
		}
		return num;
	}
	
	private void printPlayGame(int idx1, int idx2) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (list.get(idx1).get(idx2).getNum() == gameNum) {
					if (gameNum <= 25) 	list.get(idx1).set(idx2, list.get(idx1 + SIZE).get(idx2));
					else list.get(idx1).set(idx2, new Node2(0));
					gameNum++;
				}
				System.out.printf("%2d ", list.get(i).get(j).getNum());
			}
			System.out.println();
		}
	}
	
	public void run() {
		init();
		inputData();
		printGameInit();
		while (true) {
			if (gameNum == 51) {
				System.out.println("clear");
				break;
			}
			int idx1 = getVal()[0];
			int idx2 = getVal()[1];
			System.out.println("좌표 값 : " + idx1 + " " + idx2);
			printPlayGame(idx1, idx2);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class _06게임1to50 {
	public static void main(String[] args) {
		
		Game1to50 game = new Game1to50();
		game.run();
		
	}
}
