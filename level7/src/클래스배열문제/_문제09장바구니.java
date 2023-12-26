package 클래스배열문제;

class Item {
	int itemNo;
	String name;
	int price;
	
	void init(int item, String name, int price) {
		this.itemNo = item;
		this.name = name;
		this.price = price;
	}
	
	void printAll () {
		System.out.println(itemNo + " " + name + " " + price + "원");
	}
}

class ItemDAO {
	Item[] itemList;
	
	void init(String itemData) {
		String[] itemArr1 = itemData.split(",");
		itemList = new Item[itemArr1.length];
		for (int i = 0; i < itemList.length; i++) {
			String[] itemArr2 = itemArr1[i].split("/");
			itemList[i] = new Item();
			itemList[i].itemNo = Integer.parseInt(itemArr2[0]);
			itemList[i].name = itemArr2[1];
			itemList[i].price = Integer.parseInt(itemArr2[2]);
		}
	}
	
}

class User {
	int userNo;
	String name;
	
	void init (int num, String name) {
		this.userNo = num;
		this.name = name;
	}
	
	void printAll () {
		System.out.println(userNo + " " + name);
	}
	
}

class UserDAO {
	User[] userList;
	
	void init (String userData) {
		String[] userArr1 = userData.split(",");
		userList = new User[userArr1.length];
		for (int i = 0; i < userList.length; i++) {
			String[] userArr2 = userArr1[i].split("/");
			userList[i] = new User();
			userList[i].userNo = Integer.parseInt(userArr2[0]);
			userList[i].name = userArr2[1];
		}
	}
}

class Cart {
	int userNo;
	int itemNo;
}

class CartDAO {
	Cart[] cartList;
	UserDAO udao;
	ItemDAO idao;
	
	void init(String cartData) {
		udao = new UserDAO();
		idao = new ItemDAO();
		
		String[] cartArr1 = cartData.split("\n");
		cartList = new Cart[cartArr1.length];
		for (int i = 0; i < cartList.length; i++) {
			String[] cartArr2 = cartArr1[i].split("/");
			cartList[i] = new Cart();
			cartList[i].itemNo = Integer.parseInt(cartArr2[1]);
			cartList[i].userNo = Integer.parseInt(cartArr2[0]);
		}
	}
	
	void quiz1() {
		// 회원별 아이템 구매 목록 출력
		for (int k = 0; k < udao.userList.length; k++) {
			System.out.print(udao.userList[k].name + "==> ");
			String result = "";
			int[] count = new int[idao.itemList.length];
			int idx = 0;
			for (int j = 0; j < idao.itemList.length; j++) {
				for (int i = 0; i < cartList.length; i++) {
					if (cartList[i].userNo == udao.userList[k].userNo && cartList[i].itemNo == idao.itemList[j].itemNo) {
						count[idx]++;
					}
				}
				if (count[idx] > 0) {
					result += idao.itemList[j].name + count[idx] + ",";
				}
				idx++;
			}
			if (result.length() != 0) {
				result = result.substring(0, result.length() - 1);
			}
			System.out.println(result);
		}
	}
	
	void quiz2() {
		//아이템별 구입한 회원 이름 출력
		for (int i = 0; i < idao.itemList.length; i++) {
			System.out.print(idao.itemList[i].name + "==> ");
			String result = "";
			for (int j = 0; j < udao.userList.length; j++) {
				int cnt = 0;
				for (int k = 0; k < cartList.length; k++) {
					if (cartList[k].itemNo == idao.itemList[i].itemNo && cartList[k].userNo == udao.userList[j].userNo) {
						cnt++;
					}
				}
				if (cnt > 0) {
					result += udao.userList[j].name + ",";
				}
			}
			if (result.length() != 0) {
				result = result.substring(0,result.length() - 1);
			}
			System.out.println(result);
		}
	}
	
	void run(String idata, String udata, String cdata) {
		init(cdata);
		udao.init(udata);
		idao.init(idata);
		for (int i = 0; i < udao.userList.length; i++) {
			udao.userList[i].printAll();
		}
		for (int i = 0; i < idao.itemList.length; i++) {
			idao.itemList[i].printAll();
		}
		quiz1();
		quiz2();
	}
}
public class _문제09장바구니 {
	public static void main(String[] args) {
		
		String itemData = "1001/고래밥/1200,1002/새우깡/2300,1003/칸쵸/1500";
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
		
		CartDAO cdao = new CartDAO();
		cdao.run(itemData, userData, cartData);
	}
}
