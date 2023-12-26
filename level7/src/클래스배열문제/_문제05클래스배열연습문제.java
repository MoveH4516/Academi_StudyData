package 클래스배열문제;

class Node2 {
	int number;
	int score;
	
	void init(int number, int score) {
		this.number = number;
		this.score = score;
	}
	
	void print() {
		System.out.println(number + ", " + score);
	}
}

class Return2 {
	Node2[] nodeArr1 (String[][] data) {
		Node2[]	arr = new Node2[idx(data).length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Node2();
			arr[i].init(Integer.parseInt(data[idx(data)[i]][0]), Integer.parseInt(data[idx(data)[i]][1]));
		}
		return arr;
	}
	
	int[] idx(String[][] data) {
		int cnt = 0;
		for (int i = 0; i < data.length; i++) {
			if (Integer.parseInt(data[i][1]) >= 60) {
				cnt++;
			}
		}
		int[] arr = new int[cnt];
		int idx = 0;
		for (int i = 0; i < data.length; i++) {
			if (Integer.parseInt(data[i][1]) >= 60) {
				arr[idx++] = i;
			}
		}
		return arr;
	}
	
	int index(String[][] data) {
		int num = 0;
		int min = Integer.parseInt(data[0][1]);
		for (int i = 0; i < data.length; i++) {
			if (min > Integer.parseInt(data[i][1])) {
				min = Integer.parseInt(data[i][1]);
				num = i;
			}
		}
		return num;
	}
	
	Node2 nodeArr2(String[][] data) {
		Node2 n = new Node2();
		n.init(Integer.parseInt(data[index(data)][0]), Integer.parseInt(data[index(data)][1]));
		return n;
	}
	
}

public class _문제05클래스배열연습문제 {
	public static void main(String[] args) {
		
		Return2 r = new Return2();
		
		String[][] data = {
				{"1001", "34"},
				{"1002", "46"},
				{"1003", "81"},
				{"1004", "10"}
		};
		
		for (Node2 n : r.nodeArr1(data)) {
			n.print();;
		}
		r.nodeArr2(data).print();
	}
}
