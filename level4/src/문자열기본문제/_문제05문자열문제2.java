package 문자열기본문제;

import java.util.Arrays;

public class _문제05문자열문제2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	userData 안에 user 의 값이 있는지 검사
		 */
		
		String userData = "1001,1002,1003,1004";
		int user = 1002;
		String[] users = userData.split(",");
		System.out.println(Arrays.toString(users));
		
		for (int i = 0; i < users.length; i++) {
			if (user == Integer.parseInt(users[i])) {
				System.out.println(true);
				break;
			}
			if (i == users.length - 1) {
				System.out.println(false);
			}
		}
		
		
		for (int i = 0; i < userData.length(); i += 5) {
			if (i == userData.length() - 4) {
				System.out.println(user == Integer.parseInt(userData.substring(i)));
				break;
			}
			if (user == Integer.parseInt(userData.substring(i, i + 4))) {
				System.out.println(true);
				break;
			}
			if (i == userData.length() - 5) {
				System.out.println(false);
			}
		}
		

	}
}
