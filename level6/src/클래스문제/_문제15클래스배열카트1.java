package 클래스문제;

class User {
	String id;
}
class Item {
	String name;
	int price;
}
class Cart {
	String userId;
	String itemName;
}

public class _문제15클래스배열카트1 {
	public static void main(String[] args) {
		/*
		 [문제]
		 	문자열을 각각의 클래스 배열에 저장하고, 회원별로 구매한 상품의
		 	총 금액을 출력.
		 */
		String data1 = "qwer/asdf/zxcv";
		String data2 = "새우깡,1200/감자깡,3200/고구마깡,2100";
		String data3 = "qwer,새우깡/qwer,고구마깡/asdf,감자깡/qwer,새우깡/zxcv,새우깡";
		
		String[] d1 = data1.split("/");
		String[] d2 = data2.split("/");
		String[] d3 = data3.split("/");
		
		User[] uList = new User[d1.length];
		Item[] iList = new Item[d2.length];
		Cart[] cList = new Cart[d3.length];
		int idx =0;
		for (String s : d1) {
			User u = new User();
			u.id = s;
			uList[idx++] = u;
		}
		idx = 0;
		for (String s : d2) {
			String[] arr = s.split(",");
			Item i = new Item();
			i.name = arr[0];
			i.price = Integer.parseInt(arr[1]);
			iList[idx++] = i;
		}
		idx = 0;
		for (String s : d3) {
			String[] arr = s.split(",");
			Cart c = new Cart();
			c.itemName = arr[1];
			c.userId = arr[0];
			cList[idx++] = c;
		}
		
		int[] cash = new int[uList.length];
		
		for (int i = 0; i < uList.length; i++) {
			for (int k = 0; k < cList.length; k++) {
				if (uList[i].id.equals(cList[k].userId)) {
					for (int j = 0; j < iList.length; j++) {
						if (cList[k].itemName.equals(iList[j].name)) {
							cash[i] += iList[j].price;
						}
					}
				}
			}
		}
		for (int i = 0; i < cash.length; i++) {
			System.out.print(i == cash.length - 1 ? uList[i].id + "(" + cash[i] + ")" : uList[i].id + "(" + cash[i] + "), ");
		}
	}
}
