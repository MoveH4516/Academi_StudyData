package 이차원배열문제;

import java.util.Scanner;

public class _심화문제_윤년 {
	public static void main(String[] args) {
		
		/*
        [달력만들기]
         년도와 월을 입력받고 달력을 만드시오.
         
         [윤년계산법] 아래의 경우는 윤년 이다. 
         
         1. 해(year)가 4로 나눠지면 윤년.
         2. 1번 조건이 맞더라도 100으로 나눠지면 윤년이 아니다.  
         3. 2번 조건이 맞더라도 400으로 나눠지면 윤년이다.
         
         [요일계산법]
         1년1월1일 이 월요일이다. 
		 */
		/*
		 day & 7 == 0 일요일 1 2 3 4 5 6 
		 1월1~1월31 2월1일 
		 day 1 1 1~ year month 1
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();

		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		int[] date = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		int day = 1;
		boolean pass = false;		
		int cnt = 0;
		for (int i = 1; i <= year; i++) {
			pass = false;
			if (i % 4 == 0 && i % 100 != 0) {
				pass = true;
			}
			if (i % 400 == 0) {
				pass = true;
			}
			if (pass) {
				cnt++;
			}
		}
		if (pass) {
			day += 366 * cnt + 365 * (year - 1 - cnt) - 1;
		} else {
			day += 366 * cnt + 365 * (year - 1 - cnt);
		}
		
		for (int i = 0; i < month - 1; i++) {
			if (pass) {
				date[1] = 29;
				day += date[i];
			} else {
				day += date[i];
			}
		}
		int count = 0;		
		for (int i = 1; i <= date[month - 1]; i++) {
			if (i == 1) {
				for (int j = 0; j < day % 7; j++) {
					System.out.print("\t");
					count++;
				}
			}
			System.out.print(i + "\t");			
			count++;
			if (count % 7 == 0) {
				System.out.println();
			}
		}	
		sc.close();
	}
}
