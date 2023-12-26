package member;

public class Member {
	String id;
	String pw;
	String name;
	
	void init(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	void printinfo() {
		System.out.printf("%s \t %s \t %s \n", id, pw ,name);
	}
}
