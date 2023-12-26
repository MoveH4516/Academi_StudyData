package level4_test;

import java.util.Scanner;

public class _문제16 {
	public static void main(String[] args) {
		// 중복 id 체크 // 이름 필수 3글자~10글자 이하 숫자 안됨
		//패스워드(4글자 이상) 연속 같은 4글자 안됨 
		// 회원 id와 비밀번호를 입력하면 회원 삭제 => 삭제시 뒤에 데이터 땡기기 
		// 회원 이름 검색해서 회원 수정은 비밀번호 수정 
		// 회원 id를 검색해서 해당 회원 정보 출력 
		
		Scanner sc = new Scanner(System.in);
		
		int max = 100; // 최대인원
		String [] idList = new String[max];
		String [] pwList = new String[max];
		String [] nameList = new String[max];
	
		int cnt = 0;
		boolean pass = false;
		while(true) {
			System.out.println("[1]회원가입"); 
			System.out.println("[2]회원삭제"); 
			System.out.println("[3]회원수정"); 
			System.out.println("[4]회원출력"); 
			System.out.println("[0]종료");

			int menu = sc.nextInt();
			if (menu < 0 || menu > 4) {
				System.out.println("0~4 사이의 숫자를 입력하세요");
				continue;
			}
			if(menu == 0) {
				break; 
			} else if(menu == 1) {
				pass = false;
				if (cnt == max) {
					System.out.println("더이상 회원가입이 불가능합니다.");
					continue;
				}
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				for (int i = 0; i < cnt; i++) {
					if (idList[i].equals(id)) {
						System.out.println("중복된 닉네임 입니다.");
						pass = true;
						break;
					}
				}
				for (int i = 0; i < name.length(); i++) {
					if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
						System.out.println("이름에 숫자를 사용할 수 없습니다.");
						pass = true;
						break;
					}
				}
				int count = 1;
				for (int i = 0; i < pw.length() - 1; i++) {
					if (pw.charAt(i + 1) == pw.charAt(i)) {
						count++;
					} else {
						count = 1;
					}
					if (count == 4) {
						System.out.println("중복된 글자 4개로 PW를 설정할 수 없습니다.");
						pass = true;
						break;
					}
				}
				if (name.length() < 3 || name.length() > 10) {
					System.out.println("이름 글자수 오류");
					continue;
				}				
				if (pass) {
					continue;
				}
				idList[cnt] = id;
				pwList[cnt] = pw;
				nameList[cnt] = name;
				cnt++;
			} else if(menu == 2) {
				if (cnt == 0) {
					System.out.println("회원이 없습니다.");
					continue;
				}
				int idx = -1;
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				for (int i = 0; i < cnt; i++) {
					if (id.equals(idList[i])) {
						idx = i;
						break;
					}
				}
				if (idx == -1) {
					System.out.println("ID가 일치하지 않습니다.");
					continue;
				}
				if (pw.equals(pwList[idx])) {
					for (int j = idx; j < cnt; j++) {
						idList[j] = idList[j + 1];
						pwList[j] = pwList[j + 1];
						nameList[j] = nameList[j + 1];						
					}
					idList[cnt] = null;
					pwList[cnt] = null;
					nameList[cnt] = null;
					cnt--;					
				} else {
					System.out.println("PW가 일치하지 않습니다.");
					continue;
				}				
			} else if(menu == 3) {
				if (cnt == 0) {
					System.out.println("회원이 없습니다.");
					continue;
				}
				System.out.print("이름 : ");
				String name = sc.next();
				for (int i = 0; i < cnt; i++) {
					if (name.equals(nameList[i])) {
						System.out.print("변경할 PW : ");
						String pw = sc.next();
						int count = 1;
						for (int j = 0; j < pw.length() - 1; j++) {
							if (pw.charAt(j + 1) == pw.charAt(j)) {
								count++;
							}
						}
						if (count == 4) {
							System.out.println("중복된 글자 4개로 PW를 설정할 수 없습니다.");
							break;
						}
						pwList[i] = pw;
						break;
					} else {
						System.out.println("일치하는 이름이 없습니다.");
					}
				}
			} else if(menu == 4) {
				System.out.println("회원정보");
				System.out.printf("[%-5s][%-5s][%-5s]\n", "이름", "ID", "PW");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("[%-5s][%-5s][%-5s]\n", nameList[i], idList[i], pwList[i]);
				}
			}
			System.out.println("-----------------------------");
		}
		sc.close();
	}
}
