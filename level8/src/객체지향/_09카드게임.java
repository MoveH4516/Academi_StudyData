package 객체지향;

import java.util.Random;

class Card{
	private int num;
	private String shape;
	
	public Card(int num, String shape) {
		this.num = num;
		this.shape = shape;
	}
	private static String[] shapes = {"♥", "◆", "♣", "♠"};
	
	public int getNum() {
		return num;
	}
	
	public String getShape() {
		return shape;
	}
	
	public static String getShapes (int idx) {
		return shapes[idx];
	}
	@Override
	public String toString() {
		return shape + num;
	}
}

class Player1{
	private String name;
	private Card[] card;
	
	public Player1 (String name, Card[] card) {
		this.name = name;
		this.card = card;
	}

	public String getName() {
		return name;
	}

	public Card[] getCard() {
		return card;
	}
	
}

class GameManager{
	private Card[] deck;
	private Player1[] user;
	private int getMaxNum;
	private int getBigShape;
	public GameManager() {
		deck = new Card[40];
		user = new Player1[2];
	}
	
	private void inputCardData() {
		int idx = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 4; j++) {
				deck[idx++] = new Card(i, Card.getShapes(j));
			}
		}
	}
	
	private int shapesIdx(String s) {
		int idx = 0;
		for (int i = 0; i < 4; i++) {
			if (s.equals(Card.getShapes(i))) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	private void inputUserData() {
		int[] idx = getCardNum();
		user[0] = new Player1("p1", new Card[2]);
		user[1] = new Player1("p2", new Card[2]);
		user[0].getCard()[0] = deck[idx[0]];
		user[0].getCard()[1] = deck[idx[1]];
		user[1].getCard()[0] = deck[idx[2]];
		user[1].getCard()[1] = deck[idx[3]];
		
		int num1 = user[0].getCard()[0].getNum();
		int shape1 = shapesIdx(user[0].getCard()[0].getShape());
		if (num1 < user[0].getCard()[1].getNum()) {
			num1 = user[0].getCard()[1].getNum();
			shape1 = shapesIdx(user[0].getCard()[1].getShape());
		} else if (num1 == user[0].getCard()[1].getNum() && shape1 < shapesIdx(user[0].getCard()[1].getShape())) {
			shape1 = shapesIdx(user[0].getCard()[1].getShape());
		}
		int num2 = user[1].getCard()[0].getNum();
		int shape2 = shapesIdx(user[1].getCard()[0].getShape());
		if (num2 < user[1].getCard()[1].getNum()) {
			num2 = user[1].getCard()[1].getNum();
			shape2 = shapesIdx(user[1].getCard()[1].getShape());
		} else if (num2 == user[1].getCard()[1].getNum() && shape2 < shapesIdx(user[1].getCard()[1].getShape())) 
			shape2 = shapesIdx(user[1].getCard()[1].getShape());
		
		if (num1 > num2) {
			getMaxNum = 1;
		} else if (num1 < num2) {
			getMaxNum = 2;
		} else {
			getMaxNum = 3;
		}
		
		if (shape1 > shape2) {
			getBigShape = 1;
		} else {
			getBigShape = 2;
		}
	}
	
	private int[] getCardNum() {
		Random rd = new Random();
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			int num = rd.nextInt(40);
			arr[i] = num;
			for (int j = i - 1; i > 0 && j >= 0; j--) {
				if (arr[j] == arr[i]) {
					i--;
					continue;
				}
			}
		}
		return arr;
	}
	
	private int[] calculateSum() {
		int[] sum = new int[2];
		sum[0] = user[0].getCard()[0].getNum() + user[0].getCard()[1].getNum();
		sum[1] = user[1].getCard()[0].getNum() + user[1].getCard()[1].getNum();
		return sum;
	}
	
	private void printResult() {
		System.out.printf("%s 카드 : ", user[0].getName());
		System.out.println(user[0].getCard()[0] + " " + user[0].getCard()[1] + "(" + calculateSum()[0] + ")");
		System.out.printf("%s 카드 : ", user[1].getName());
		System.out.println(user[1].getCard()[0] + " " + user[1].getCard()[1] + "(" + calculateSum()[1] + ")");
	}
	
	private void checkWinForSum() {
		if (calculateSum()[0] > calculateSum()[1]) {
			System.out.println(user[0].getName() + " 승리");
		} else if (calculateSum()[0] < calculateSum()[1]) {
			System.out.println(user[1].getName() + " 승리");
		}
	}
	
	private void checkWinForNum() {
		if (calculateSum()[0] != calculateSum()[1]) return;
		if (getMaxNum == 1) System.out.println(user[0].getName() + " 승리");
		else if (getMaxNum == 2) System.out.println(user[1].getName() + " 승리");
	}
	
	private void checkWinForShape() {
		if (calculateSum()[0] != calculateSum()[1]) return;
		if (getMaxNum != 3) return;
		if (getBigShape == 1) System.out.println(user[0].getName() + " 승리");
		else System.out.println(user[1].getName() + " 승리");
	}
	
	public void playGame() {
		inputCardData();
		inputUserData();
		printResult();
		checkWinForSum();
		checkWinForNum();
		checkWinForShape();
	}
}

public class _09카드게임 {
	public static void main(String[] args) {
		
		GameManager game = new GameManager();
		game.playGame();
		
	}
}
