package ATM;

public class ClientDAO {
	Util sc;
	Client[] cList;
	
	int maxNum;
	int cnt;
	int log = -1;
	
	ClientDAO() {
		sc = new Util();
		maxNum = 1001;
	}
	
	void init(String data) {
		String[] temp = data.split("\n");
		cnt = temp.length;
		cList = new Client[cnt];
		for (int i = 0; i < cnt; i++) {
			String[] arr = temp[i].split("/");
			cList[i] = new Client(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3]);
		}
	}
	
	boolean hasData() {
		if (cList == null) {
			System.out.println("데이터 없음");
			return false;
		}
		return true;
	}
	
	void addClient() {
		if (cnt == 0) {
			cList = new Client[1];
		} 
		String id = sc.getStrVal("아이디");
		int idx = -1;
		for (int i = 0; i < cList.length; i++) {
			if (id.equals(cList[i].id)) {
				idx = i;
				break;
			}
		}
		if (idx != -1) {
			System.out.println("중복된 아이디");
			return;
		}
		String pw = sc.getStrVal("비밀번호");
		String acc = sc.getStrVal("계좌번호");
		if (acc.length() != 14) {
			System.out.println("계좌번호 오류");
			return;
		}
		for (int j = 0; j < cList.length; j++) {
			if (cList[j].accList != null) {
				for (int i = 0; i < cList[j].accList.length; i++) {
					if (cList[j].accList[i].accNumber.equals(acc)) {
						System.out.println("계좌번호 중복");
						return;
					}
				}
			}
		}
		Client[] temp = cList;
		cList = new Client[cnt + 1];
		for (int i = 0; i < cnt; i++) {
			cList[i] = temp[i];
		}
		cList[cnt] = new Client(++maxNum, id, pw, acc);
		System.out.println(cList[cnt].id);
		System.out.println("회원가입 완료");
		cnt++;
	}
	
	int login() {
		String id = sc.getStrVal("ID");
		String pw = sc.getStrVal("PW");
		for (int i = 0; i < cnt; i++) {
			if (id.equals(cList[i].id) && pw.equals(cList[i].pw)) {
				System.out.println("로그인 성공");
				log = i;
				return i;
			}
		}
		System.out.println("로그인 실패");
		return -1;
	}
	
	void inputAccData(AccountDAO accDAO) {
		if (!hasData()) return;
		for (int i = 0; i < cnt; i++) {
			cList[i].accList = accDAO.getAccFromClient(cList[i]);
		}
	}
	
	void updateMaxNum() {
		if(cnt == 0) return;
		int maxNo = 0;
		for(Client c : cList) {
			if(maxNo < c.clientNo) {
				maxNo = c.clientNo;
			}
		}
		this.maxNum = maxNo;
	}
	
	void inputMoney() {
		int num = -1;
		String acc = sc.getStrVal("계좌");
		int money = sc.getIntVal("입금할 금액 : ", 0, 1000000);
		for (int i = 0; i < cList[log].accList.length; i++) {
			if (cList[log].accList[i].accNumber.equals(acc)) {
				cList[log].accList[i].money += money;
				num = i;
			}
		}
		if (num == -1) {
			System.out.println("계좌번호가 틀렸습니다.");
		}
	}
	
	void outputMoney() {
		int num = -1;
		String acc = sc.getStrVal("계좌");
		for (int i = 0; i < cList[log].accList.length; i++) {
			if (cList[log].accList[i].accNumber.equals(acc)) {
				num = i;
			}
		}
		if (num == -1) {
			System.out.println("계좌번호가 틀렸습니다.");
			return;
		}
		int money = sc.getIntVal("출금할 금액 : ", 0, cList[log].accList[num].money);
		cList[log].accList[num].money -= money;
	}
	
	String saveFile() {
		if (cnt == 0) return "";
		String data = "";
		for (Client a : cList) {
			data += a.saveData();
		}
		return data;
	}
	
	void transMoney() {
		
	}
	
	void addaccount() {
		if (cList[log].accList.length == 3) {
			System.out.println("계좌 추가 불가능");
			return;
		}
		String acc = sc.getStrVal("계좌번호");
		if (acc.length() != 14) {
			System.out.println("계좌번호 오류");
			return;
		}
		for (int j = 0; j < cList.length; j++) {
			if (cList[j].accList != null) {
				for (int i = 0; i < cList[j].accList.length; i++) {
					if (cList[j].accList[i].accNumber.equals(acc)) {
						System.out.println("계좌번호 중복");
						return;
					}
				}
			}
		}
	}
	
	void print() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(cList[i].clientNo + " " + cList[i].id + " " + cList[i].pw + " " + cList[i].name);
			if (cList[i].accList == null) System.out.println(" ");
			else {
			for (int j = 0; j < cList[i].accList.length; j++) {
				System.out.println(cList[i].accList[j].accNumber);
			}
			}
			System.out.println();
		}
	}
	
}
