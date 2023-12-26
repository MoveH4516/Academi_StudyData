package 반복문1개념;

import java.util.Scanner;

public class _07이중반복문 {
	public static void main(String[] args) {
		 /*
         * # 쇼핑몰 뒤로가기
         * 
         * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 
         *      뒤로가기 누르기전까지 남성의류 페이지 를 유지할려고한다.
         * 힌트) 개층 별로 반복문을 추가 해주면된다. 
         * 1. 남성의류
         *         1) 티셔츠
         *         2) 바지
         *         3) 뒤로가기
         * 2. 여성의류
         *         1) 가디건
         *         2) 치마
         *         3) 뒤로가기
         * 3. 종료
         */
        
		// 이중 반복문
		// 반복문 안에 반복문이 하나 더 있는 형태
        
        Scanner scan = new Scanner(System.in);
        
        boolean run = true;
        while(run) {
            
            System.out.println("1.남성의류");
            System.out.println("2.여성의류");
            System.out.println("3.종료");
            
            System.out.print("메뉴 선택 : ");
            int sel = scan.nextInt();
            while (true) {
            	if(sel == 1) {            		
                    System.out.println("1)티셔츠");
                    System.out.println("2)바지");
                    System.out.println("3)뒤로가기");
                }
                else if(sel == 2) {
                    System.out.println("1)가디건");
                    System.out.println("2)치마");
                    System.out.println("3)뒤로가기");
                }
            	System.out.print("상품 선택 : ");
            	int select = scan.nextInt();            	
            	if (select == 3) {
        			System.out.println("처음 메뉴로 돌아갑니다.");
        			break;
        		}
            	
            }            
            if(sel == 3) {
                run = false;
                System.out.println("프로그램 종료");
            }
        } 	
		scan.close();
	}
}
