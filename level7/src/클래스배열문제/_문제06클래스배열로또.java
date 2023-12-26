package 클래스배열문제;

import java.util.Arrays;
import java.util.Random;

class Lotto {
	int[] data = new int[8];
	boolean win = false;
	
	void input (int[] data, boolean check) {
		this.data = data;
		this.win = check;
	}
}

class LottoSet {
	Random rd = new Random();
	Lotto l = new Lotto();
	int size = 5;
	
	Lotto[] lotto() {
		int[] arr = new int[l.data.length];
		Lotto[] array = new Lotto[size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j] = rd.nextInt(2) + 1;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println(check(arr));
			array[i] = new Lotto();
			array[i].input(arr, check(arr));
		}
		return array;
	}
	
	boolean check(int[] arr) {
		int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 2) {
					cnt++;
				} else {
					cnt = 0;
				}
				if (cnt >= 3) {
					return true;
				}
			}
		return false;
	}
	
	int cnt() {
		int num = 0;
		for (int i = 0; i < size; i++) {
			if (lotto()[i].win) {
				num++;
			}
		}
		return num;
	}
	
	void run() {
		while (true) {
			lotto();
//			if (cnt() != 1) {
//				continue;
//			}
//			for (int i = 0; i < size; i++) {
//				System.out.println(Arrays.toString(lotto()[i].data));
//				System.out.println(lotto()[i].win);
//			}
			break;
		}
	}
	
}

public class _문제06클래스배열로또 {
	public static void main(String[] args) {
		
		LottoSet lo = new LottoSet();
		lo.run();
	}
}
