package 클래스문제;

import java.util.Scanner;

public class _문제12강사님풀이 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numList[] = {1001,1002,1003};  // Student 클래스의 number
		String nameList[] = {"이만수" , "김철만" , "오수정"}; // Student 클래스의 name
		
		int stuNumList[] = {1001,1001,1002,1002,1002,1003}; // Subject 클래스의 stuNum
		String subList[] = {"국어" , "수학" , "국어" , "수학" ,"영어" , "수학"};  // Subject 클래스의 name
		int scoreList [] = {100,32,23,35,46,60}; //  // Subject 클래스의 score
		int rankList[]  = {0,0,0,0,0,0}; // // Subject 클래스의 rank
		
		Student[] stList = new Student[numList.length];
		Subject[] sbList = new Subject[stuNumList.length];
		
		for(int i =0; i < stList.length;i+=1) {
			Student s = new Student();
			s.number = numList[i];
			s.name = nameList[i];
			stList[i] = s;
		}
		for(int i =0; i < sbList.length;i+=1) {
			Subject s = new Subject();
			s.stuNum = stuNumList[i];
			s.name = subList[i];
			s.score = scoreList[i];
			s.rank = rankList[i];
			sbList[i] = s;
		}
		
		
		while(true) {
			System.out.println("==================");
			System.out.println("[0] 종료 ");
			System.out.println("[1] 학생 정보 출력 ");
			System.out.println("[2] 과목 정보 출력 ");
			System.out.println("[3] 과목별 랭킹 저장 ");
			System.out.println("[4] 과목별 랭킹 + 이름 출력");
			System.out.println("[5] 과목별 랭킹 1등의 이름 과목 점수 출력 ");
			System.out.println("메뉴 입력 >> ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				for(Student s : stList) {
					System.out.printf("%d %s %n" , s.number, s.name);
				}
				
				
			}else if(sel == 2) {
				for(Subject s : sbList) {
					System.out.printf("%d %s %d점 %d등 %n" , s.stuNum, s.name, s.score , s.rank);
				}
				
			}else if(sel == 3) {
				for(Subject s : sbList) {
					int rank = 1;
					for(Subject comSub : sbList) {
						if(s.name.equals(comSub.name)&& s.score < comSub.score) {
							rank+=1;
						}
					}
					s.rank = rank;
				}
			}else if(sel == 4) {
				for(Subject sub : sbList) {
					for(Student stu : stList) {
						if(sub.stuNum == stu.number) {
							System.out.printf("%d %s %d점 %d등 %s %n" , 
									sub.stuNum, sub.name, sub.score , sub.rank, stu.name);
							break;
						}
					}
				}
			}else if(sel == 5) {
				for(Subject sub : sbList) {
					if(sub.rank == 1) {
						for(Student stu : stList) {
							if(sub.stuNum == stu.number) {
								System.out.println(stu.name +" " + sub.name +" " + sub.score+"점");
							}
						}
					}
				}
				
			
			}else if(sel == 0) {
				break;
			}else {
				continue;
			}
		}
		sc.close();
	}
}
