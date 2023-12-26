package 클래스배열문제;

import java.util.Random;

class Lotto2 {
	int[] data = new int[8];
	boolean win = false;
	
	void print() {
		for(int val : data) {
			System.out.print(val +" ");
		}
	}
}

class Lotto2Set {
	Random rd = new Random();
	Lotto2[] set;
	int winner;
	
	void init() {
		set = new Lotto2[5];
		// 미리 당첨 복권 인덱스 구하기 
		winner = rd.nextInt(set.length); // 0 ~ 4 
		System.out.println("당첨 복권 인덱스 " + winner ); 
		System.out.println("-------------------------");
	}
	
	Lotto2 createLotto2() {
		Lotto2 Lotto2 = new Lotto2();
		for(int i =0; i < Lotto2.data.length; i+=1) {
			Lotto2.data[i] = (rd.nextInt(2)==1)? 7: 0;
		}
		return Lotto2;
	}
	
	void createSet() {
		for(int i =0; i < set.length;i+=1) {
			set[i] = createLotto2();
			checkLotto2(set[i]);
			// 당첨 복권 인덱스가 당첨이 안됬을때 
			if(winner == i && !set[i].win) {
				if(i != 0 )i-=1;
			}
			// 당첨 복권 인덱스이 아닌 다른 인덱스가 당첨일때 
			else if(winner != i && set[i].win) {
				if(i != 0 )i-=1;
			}
			
		}
	}
	void checkLotto2(Lotto2 Lotto2) {
		int cnt =0;
		for(int num : Lotto2.data) {
			if(num == 7) {
				cnt+=1;
			}else {
				cnt =0;
			}
			if(cnt == 3) {
				Lotto2.win = true;
				return;
			}
		}
	}
	
	void printSet() {
		for(Lotto2 Lotto2 :set) {
			Lotto2.print();
			System.out.printf(" ==> %s %n", Lotto2.win? "당첨" : "꽝" );
		}
		System.out.println("------------------");
	}
	
	void run() {
		init();
		createSet();
		printSet();
	}
}
public class _문제06강사님풀이 {

}
