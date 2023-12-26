package 클래스배열문제;

class Node11{
	int number;
	String name;
	int price;
	void init(int number ,String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}
	void printInfo() {
		System.out.println(number +" " + name + " " + price);
	}
}
class Return11{
	boolean hasNode(int idx , String val , String[][] tempList ) {
		for(int k =0; k < idx; k+=1) {
			if(val.equals(tempList[k][0])) {
				return true;
			}
		}
		return false;
	}
	int getTotalValue(String[] temp , String[][] tempList , int idx) {
		int total = 0;
		for(int k =0; k < temp.length;k+=1) {
			String[] info = temp[k].split("/");
			if(tempList[idx][0].equals(info[0])) {
				total+= Integer.parseInt(info[2]);
			}
		}
		return total;
	}
	Node11[] quiz1(String data) {
		Node11[] list = null;
		String[] temp = data.split("\n");
		String[][] tempList = new String[temp.length][3];
		int idx =0;
		for(int i =0; i < temp.length;i+=1) {
			String[] info = temp[i].split("/");
			if(!hasNode(i, info[0], tempList)) {
				tempList[idx] = info;
				idx+=1;
			}
		}
		list = new Node11[idx];
		for(int i =0; i < idx; i+=1) {
			Node11 n = new Node11();
			int total =getTotalValue(temp, tempList, i);
			n.init(Integer.parseInt(tempList[i][0]), tempList[i][1], total);
			list[i] = n;
		}
		return list;
	}
	Node11 quiz2(String data) {
		Node11 node = null;
		Node11[] list = quiz1(data);
		int max =0;
		for(Node11 n : list) {
			if(max < n.price) {
				max = n.price;
				node = n;
			}
		}
		return node;
	}
}
public class _문제04강사님풀이 {
	public static void main(String[] args) {
		
		Return11 re = new Return11();
		
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
		System.out.println("=== 문제1 ===");
		for (Node11 n : re.quiz1(data)) {
			n.printInfo();
		}
		System.out.println("=== 문제2 ===");
		re.quiz2(data).printInfo();
	}
}
