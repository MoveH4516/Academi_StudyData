package 배열심화문제;

public class _문제04 {
	public static void main(String[] args) {
		
		/*
		[문제]
			철수와 민수는 가위바위보를 6회 하였다. 
			가위(0) , 바위(1) , 보(2) 를 뜻한다. 
			아래 배열은 각각 가위바위보를 낸 기록을 저장한것이다. 
			
			철수와 민수는 계단 50번째 부터 게임을 시작하였다. 
			철수와 민수는 게임을 모두 끝마치고 어디있을까?
			[규칙]
				이기면 5칸 올라간다.
				비기면 1칸 올라간다.
				지면 3칸 내려간다. 
	*/

	    int clist[] = {0,1,2,2,1,0};
		int mlist[] = {2,1,1,2,0,1};
		int cheolsu = 50;
		int minsu = 50;
		
		for (int i = 0; i < clist.length; i++) {
			if (clist[i] - mlist[i] == 1) {
				cheolsu += 5;
				minsu -= 3;
			} else if (clist[i] == mlist[i]) {
				cheolsu += 1;
				minsu += 1;
			} else if (clist[i] - mlist[i] == 2) {
				cheolsu -= 3;
				minsu += 5;
			} else if (clist[i] - mlist[i] == -1) {
				cheolsu -= 3;
				minsu += 5;
			} else if (clist[i] - mlist[i] == -2) {
				cheolsu += 5;
				minsu -= 3;
			}
		}
		System.out.println(cheolsu);
		System.out.println(minsu);
	}
}
