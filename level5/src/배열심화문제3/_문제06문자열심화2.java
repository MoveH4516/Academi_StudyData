package 배열심화문제3;

import java.util.Arrays;

public class _문제06문자열심화2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	각 회원별 구매 총합 출력
		 */
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800";
		
		String[] dataarr = data.split("\n");
		
		String[][] dataarr2 = new String[dataarr.length][3];
		int idx = 0;
		for (String data2 : dataarr) {
			dataarr2[idx] = data2.split("/");
			idx++;
		}		
		for (int i = 0; i < dataarr2.length; i++) {
			int num = Integer.parseInt(dataarr2[i][0]);
			for (int j = i; j < dataarr2.length; j++) {
				if (num >= Integer.parseInt(dataarr2[j][0])) {
					num = Integer.parseInt(dataarr2[j][0]);
					String[] temp = dataarr2[i];
					dataarr2[i] = dataarr2[j];
					dataarr2[j] = temp;
				}
			}
		}
		for (int i = 0; i < dataarr2.length; i++) {
			System.out.println(Arrays.toString(dataarr2[i]));
		}
		int cnt = 0;
		System.out.println("==================");
		for (int i = 0; i < dataarr2.length;) {
			int money = 0;
			for (int j = i; j < dataarr2.length; j++) {
				if (dataarr2[i][0].equals(dataarr2[j][0])) {
					money += Integer.parseInt(dataarr2[j][2]);
					cnt++;
				}
			}
			System.out.printf("%s %s %d\n", dataarr2[i][0], dataarr2[i][1], money);
			i = cnt;
			if (cnt == dataarr2.length) {
				break;
			}
		}
		System.out.println("==================");
	}
}
