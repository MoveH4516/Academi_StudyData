package 배열심화문제2;

import java.util.Arrays;

public class _문제07문자열2차원 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	userData는 회원번호와 이름
		 	pointData는 포인트점수와 회원번호
		 	번호가 여러개면 누적
		 	점수가 가장 높은 회원의 이름을 출력
		 */
		
		String userData = "1001/김철수\n";
		userData += "1002/이만수\n";
		userData += "1003/이영희";
		
		String pointData = "1,1001\n";
		pointData += "1,1002\n";
		pointData += "2,1003\n";
		pointData += "1,1001\n";
		pointData += "2,1002";
		
		String[] user = userData.split("\n");
		String[] point = pointData.split("\n");
		System.out.println(Arrays.toString(user));
		System.out.println(Arrays.toString(point));
		int[] p = new int[user.length];
		for (int i = 0; i < user.length; i++) {
			int sum = 0;
			for(int j = 0; j < point.length; j++) {
				if (user[i].substring(0, 4).equals(point[j].substring(2))) {
					sum += Integer.parseInt(point[j].substring(0,1));
				}
			}
			p[i] = sum;
		}
		System.out.println(Arrays.toString(p));
		int idx = 0;
		int max = 0;
		for (int i = 0; i < p.length; i++) {
			if (max < p[i]) {
				max = p[i];
			}
		}
		for (int i = 0; i < p.length; i++) {
			if (max == p[i]) {
				idx = i;
			}
		}
		System.out.print(user[idx].substring(0,4) + "회원 " + user[idx].substring(5) + " " + p[idx] + "점");
	}
}
