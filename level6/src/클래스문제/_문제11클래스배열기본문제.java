package 클래스문제;

import java.util.Arrays;

class Test {
	int num;
	int size;
	char[] data;
}

public class _문제11클래스배열기본문제 {
	public static void main(String[] args) {
		
		String data = "";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		System.out.println(data);
		String[] temp = data.split("\n");
		Test[] t;
		t = new Test[temp.length];
		for (int i = 0; i < temp.length; i++) {
			String[] arr = temp[i].split("/");
			Test te = new Test();
			te.num = Integer.parseInt(arr[0]);
			te.size = Integer.parseInt(arr[1]);
			te.data = new char[te.size];
			for (int j = 0; j < te.data.length; j++) {
				te.data[j] = arr[j + 2].charAt(0);
			}
			t[i] = te;
		}
		System.out.println("---------------------");
		for(int i = 0; i < t.length; i++) {
			System.out.printf("%d %d ", t[i].num, t[i].size);
			System.out.println(Arrays.toString(t[i].data));
		}
	}
}
