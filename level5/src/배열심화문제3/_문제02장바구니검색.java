package 배열심화문제3;

import java.util.Arrays;

public class _문제02장바구니검색 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1) 회원별로 아이템 구매목록 출력
		 	
		 	2) 아이템별로 회원목록 출력
		 */
		
		String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
		String userData = "3001/이만수,3002/김철민,3003/이영희";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		String[] cart = cartData.split("\n");
		String[] item = itemData.split(",");
		String[] user = userData.split(",");
		
		String[][] itemarr = new String[item.length][2];
		String[][] userarr = new String[user.length][2];
		String[][] cartarr = new String[cart.length][2];
		
		
		
		for (int i = 0; i < itemarr.length; i++) {
			itemarr[i] = item[i].split("/");
			userarr[i] = user[i].split("/");
		}
		for (int i = 0; i < cartarr.length; i++) {
			cartarr[i] = cart[i].split("/");
		}
		System.out.println(Arrays.deepToString(itemarr));
		System.out.println(Arrays.deepToString(userarr));
		System.out.println(Arrays.deepToString(cartarr));
			
		// 배열을 순차적으로 넣어주는 for 문		
//		for (String[] c : cartarr) { 
//			for (String info : c) {
//				System.out.print(info + " ");
//			}
//			System.out.println();
//		}
		
		for (String[] users : userarr) {
			System.out.printf("%s(",users[1]);
			int[] index = new int[item.length];
			int idx = 0;
			for (String[] itemm : itemarr) {
				for (String[] cartt : cartarr) {
					if (cartt[0].equals(users[0]) && cartt[1].equals(itemm[0])) {
						index[idx]++;
					}
				}
				if (index[idx] > 0) {
					System.out.printf("%s %d개 ", itemm[1], index[idx]);
				}
				idx++;
			}
			System.out.println(")");
		}
		
		for (String[] itemm : itemarr) {
			System.out.printf("%s(",itemm[1]);
			int[] index = new int[item.length];
			int idx = 0;
			for (String[] userr : userarr) {
				for (String[] cartt : cartarr) {
					if (cartt[0].equals(userr[0]) && cartt[1].equals(itemm[0])) {
						index[idx]++;
					}
				}
				if (index[idx] > 0) {
					System.out.printf("%s ", userr[1]);
				}
				idx++;
			}
			System.out.println(")");
		}
		
	}
}
