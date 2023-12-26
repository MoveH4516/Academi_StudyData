package 배열심화문제3;

import java.util.Arrays;

public class _문제09장바구니삭제 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	cart 데이터는 현재 장바구니 상황
		 	input 데이터는 삭제를 요청한 데이터
		 	qwer 은 아이디, 3은 삭제할 위치
		 	qwer 입장에서 아이테은 3개 밖에 없으니
		 	칸쵸를 지우기 위해 3을 선택했지만, 전체 데이터에서는 5번째 아이템
		 	
		 	삭제 후 cart 배열의 정보를 출력
		 */
		
		String item = "칸초/새우깡/고래밥/콜라/사이다";
		String id = "qwer/abcd/java";
		
		String cart = "";
		cart += "qwer/고래밥\n";
		cart += "qwer/새우깡\n";
		cart += "abcd/콜라\n";
		cart += "java/칸초\n";
		cart += "qwer/칸초\n";
		cart += "java/고래밥\n";
		cart += "abcd/사이다";
		
		String[][] input = {
			{"qwer", "3"},
			{"abcd", "1"}
		};
		
		String[] itemArr = item.split("/");
		String[] idArr = id.split("/");
		System.out.println(Arrays.toString(itemArr));
		System.out.println(Arrays.toString(idArr));
		String[] cartArr = cart.split("\n");
		String[][] cartArr2 = new String[cartArr.length][];
		int idx = 0;
		for (String arr : cartArr) {
			cartArr2[idx] = arr.split("/");
			idx++;
		}
		cart = "";
		for (int i = 0; i < input.length; i++) {
			int cnt = 0;
			for (int j = 0; j < cartArr.length; j++) {
				if (input[i][0].equals(cartArr2[j][0])) {
					cnt++;
					if (input[i][1].equals(cnt+"")) {
						cartArr[j] = "";
					}
				}
			}
		}
		for (int i = 0; i < cartArr.length; i++) {
			if (!cartArr[i].equals("")) {
				System.out.println(cartArr[i]);
			}
		}
		
	}
}
