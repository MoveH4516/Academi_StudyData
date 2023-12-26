package 클래스배열문제;

class Node1 {
	int number;
	String name;
	int price;
	void init (int number, String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}
}

class Return1 {
	Node1 n = new Node1();
	String[][] arr;
	
	void dataArr (String data) {
		String[] arr1 = data.split("\n");
		arr = new String[arr1.length][3];
		int idx = 0;
		for (String s : arr1) {
			String[] ss = s.split("/");
			arr[idx++] = ss;
		}
	}
	
	Node1[] quiz1() {
		
		Node1[] list = new Node1[num().length];
		for (int i = 0; i < list.length; i++) {
			list[i] = new Node1();
			list[i].init(num()[i], name()[i], sum()[i]);
		}
		return list;
	}
	
	Node1 quiz2() {
		Node1 first = null;
		first = new Node1();
		for (int i = 0; i < num().length; i++) {
			if (max() == sum()[i]) {
				first.init(num()[i], name()[i], sum()[i]);
			}
		}
		return first;
	}
	
	String[] name() {
		String[] array = new String[num().length];
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (num()[j] == Integer.parseInt(arr[i][0])) {
					array[j] = arr[i][1];
				}
			}
		}
		return array;
	}
	
	int[] num () {
		int[] array;
		String[][] temp = new String[arr.length][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				temp[i][j] = arr[i][j];
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			for (int j = i; j < temp.length - 1; j++) {
				if (temp[i][0].equals(temp[j + 1][0])) {
					temp[j + 1][0] = "0";
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < temp.length; i++) {
			if (!temp[i][0].equals("0")) {
				cnt++;
			}
		}
		array = new int[cnt];
		int idx = 0;
		for (int i = 0; i < temp.length; i++) {
			if (!temp[i][0].equals("0")) {
				array[idx++] = Integer.parseInt(temp[i][0]);
			}
		}
		return array;
	}
	
	int[] sum() {
		int[] array = new int[num().length];
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (num()[j] == Integer.parseInt(arr[i][0])) {
					array[j] += Integer.parseInt(arr[i][2]);
				}
			}
		}
		return array;
	}
	
	int max() {
		int num = 0;
		for (int i = 0; i < sum().length; i++) {
			if (num < sum()[i]) {
				num =sum()[i];
			}
		}
		return num;
	}
	
}

public class _문제04클래스배열연습문제 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 1. result 배열에 데이터를 저장해 리턴하는 메서드
		 
		 2. 판매금액이 1등인 회원정보만 리턴하는 메서드
		 */
		
		Return1 re = new Return1();
		
		String data = "";
		data += "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800";
		re.dataArr(data);
		for (int i = 0; i < re.quiz1().length; i++) {
			System.out.println(re.quiz1()[i].number + " " + re.quiz1()[i].name + " " + re.quiz1()[i].price);
		}
		System.out.println("----------------");
		System.out.println(re.quiz2().number + " " + re.quiz2().name + " " + re.quiz2().price);
	}
}
