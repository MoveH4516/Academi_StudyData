package 배열심화문제3;

import java.util.Arrays;

public class _문제19도서연체 {
	public static void main(String[] args) {
		
		// 윤년 신경 x
		// 회원번호, 도서 이름, 연체일, 빌린날짜, 빌린일, 대여일수 출력
		int[] monthList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		String today = "2023-11-14";
		
		String rentalData = "";		
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2023-11-05/1001\n";
		rentalData += "40143/외국어 공부의 감각/2023-10-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2023-11-07/1041\n";
		rentalData += "26543/아무튼,외국어/2023-11-11/1034";
			
		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";
		String[] tday = today.split("-");
		int day = 0;
		for (int i = 0; i < Integer.parseInt(tday[1]) - 1; i++) {
			day += monthList[i];
		}
		day += Integer.parseInt(tday[2]) - 1;
		System.out.println(day);
		String[] rental = rentalData.split("\n");
		String[][] rent = new String[rental.length][];
		int idx = 0;
		for (String rent1 : rental) {
			rent[idx] = rent1.split("/");
			idx++;
		}
		String[][] rday = new String[rent.length - 1][];
		int idx2 = 0;		
		for (int i = 1; i < rent.length; i++) {
			rday[idx2] = rent[i][2].split("-");
			idx2++;
		}
		System.out.println(Arrays.deepToString(rday));
		int[] dayArr = new int[rday.length];
		for (int i = 0; i < rday.length; i++) {
			for (int j = 0; j < Integer.parseInt(rday[i][1]) - 1; j++) {
				dayArr[i] += monthList[j];
			}
			dayArr[i] += Integer.parseInt(rday[i][2]) - 1;
		}
		
		System.out.println(Arrays.toString(dayArr));
		System.out.println(Arrays.deepToString(rent));
		String[] user = userData.split("\n");
		String[][] users = new String[user.length][];
		idx = 0;
		for (String user1 : user) {
			users[idx] = user1.split("/");
			idx++;
		}
		System.out.printf("%-5s|\t%12s|\t%10s|\t%11s|\t%7s|\t%5s|\n", "회원번호", "도서이름", "연체일", "빌린 날짜", "빌린일", "대여일수");
		for (int i = 0; i < dayArr.length; i++) {
			if (tday[0].equals(rday[i][0])) {
				if ((day - dayArr[i]) - Integer.parseInt(users[i + 1][2])  > 0) {
					System.out.printf("%-7s|\t%10s|\t%10d일|\t%13s|\t%7s일|\t%5s일|\n", rent[i + 1][3], rent[i + 1][1], (day - dayArr[i]) - Integer.parseInt(users[i + 1][2]), rent[i + 1][2], day - dayArr[i],users[i + 1][2]);
				}
			}
		}
		
	}
}
