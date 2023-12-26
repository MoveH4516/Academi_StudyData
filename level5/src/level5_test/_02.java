package level5_test;

import java.util.Arrays;

public class _02 {
	public static void main(String[] args) {
		
		// test cast: String data 변수를 아래와 변경해도 똑같이 계산할 수 있는지 해보세요 
		// 123+46+1
		// 1+2+3+4+5
		
		// 위 수의 합을 구하시오
		// split() 메서드의 원리 직접 만들어보기
		
		String data = "+++12+35+4+6+1";
		String regex = "+";
		char a = '9';
		System.out.println((int)a);
		//48~57
		int idx = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) >= 48 && data.charAt(i) <= 57) {
				idx = i;
				break;
			}
		}		
		int cnt = 0;
		for (int i = idx; i < data.length(); i++) {
			if (data.charAt(i) == regex.charAt(0)) {
				cnt++;
			}
		}	
		String[] split = new String[cnt + 1];
		for (int i = 0; i <= cnt; i++) {
			split[i] = "";
		}
		int k = 0;
		for (int i = idx; i < data.length(); i++) {		
			if (data.charAt(i) == regex.charAt(0)) {
				k++;
			} else {
				split[k] += data.charAt(i);
			}
		}
		System.out.println(Arrays.toString(split));
		int sum = 0;
		for (int i = 0; i < split.length; i++) {
			sum += Integer.parseInt(split[i]);
		}
		System.out.println(sum);
	}
}
