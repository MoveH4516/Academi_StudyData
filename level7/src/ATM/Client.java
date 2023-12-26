package ATM;

public class Client {

	int clientNo;
	String id;
	String pw;
	String name;
	Account[] accList;
	
	Client (int c, String id, String pw, String name) {
		this.clientNo = c;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	String saveData() {
		return "%d%s/%s/%d\n".formatted(clientNo, id, pw, name);
	}
	
}
