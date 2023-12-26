package 콜렉션벡터;

import java.util.Scanner;
import java.util.Vector;

class Seat{
	int num;
	boolean check;
	
	void init(int num, boolean check) {
		this.num = num;
		this.check = check;
	}
	
}

class SeatDAO{
	Scanner sc;
	Vector<Seat> list;
	int size;
	SeatDAO(int size) {
		sc = new Scanner(System.in);
		list = new Vector<Seat>();
		this.size = size;
		Seat[] s = new Seat[size];
		for (int i = 0; i < size; i++) {
			s[i] = new Seat();
			s[i].init(i + 1, false);
			list.add(s[i]);
		}
	}
	
	
	void run() {
		
	}
}

public class _05자리예매 {
	public static void main(String[] args) {
		
		
		
		
	}
}
