package 배열심화문제2;

import java.util.Arrays;

public class _문제06문자열정렬 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	compareTo 하면 사전순으로 정렬 가능
		 	사전순으로 이름을 출력
		 */
		
		String[] name = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		System.out.println(name[1].compareTo("홍길동"));
		for (int i = 0; i < name.length; i++) {
			for (int j = i; j < name.length; j++) {
				if (name[i].compareTo(name[j]) > 0) {
					String temp = name[j];
					name[j] = name[i];
					name[i] = temp;					
				}
			}
		}
		System.out.println(Arrays.toString(name));
	}
}
