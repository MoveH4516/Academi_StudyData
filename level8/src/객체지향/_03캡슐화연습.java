package 객체지향;

import java.util.ArrayList;

class Member {
	private int custno;				// 회원번호
	private String custname;		// 회원성명
	private String phone;			// 회원전화
	private String address;			// 통신사
	private String joindate;		// 가입일자
	private String grade;			// 고객등급
	private String city;			// 거주도시
	
	public Member(int custno, String custname, String phone, String address, String joindate, String grade, String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}

	public int getCustno() {
		return custno;
	}

	public String getCustname() {
		return custname;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public String getJoindate() {
		return joindate;
	}

	public String getGrade() {
		return grade;
	}

	public String getCity() {
		return city;
	}
	
}

class Money{
	 private int custno;			// 회원번호
	 private int saleno; 			// 판매번호
	 private int pcost;				// 단가
	 private int amount;			// 수량
	 private int price;				// 가격(매출)
	 private String pcode;			// 상품코드
	 private String sdate;			// 판매일자
	 public Money() {}
	 
	 public Money(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
		this.custno = custno;
		this.saleno = saleno;
		this.pcost = pcost;
		this.amount = amount;
		this.price = price;
		this.pcode = pcode;
		this.sdate = sdate;
	 }

	public int getCustno() {
		return custno;
	}

	public int getSaleno() {
		return saleno;
	}

	public int getPcost() {
		return pcost;
	}

	public int getAmount() {
		return amount;
	}

	public int getPrice() {
		return price;
	}

	public String getPcode() {
		return pcode;
	}

	public String getSdate() {
		return sdate;
	}
	 
}

class Manager{
	private ArrayList<Member> memberList = new ArrayList<Member>();
	private ArrayList<Money> moneyList = new ArrayList<Money>(); 	
	
	public void init() {
		memberList.add(new Member(100001, "김행복", "010-1111-2222", "SK", "20151202", "A", "01"));
		memberList.add(new Member(100002, "이축복", "010-1111-3333", "SK", "20151206", "B", "01"));
		memberList.add(new Member(100003, "장믿음", "010-1111-4444", "SK", "20151001", "B", "30"));
		memberList.add(new Member(100004, "최사랑", "010-1111-5555", "SK", "20151113", "A", "30"));
		memberList.add(new Member(100005, "진평화", "010-1111-6666", "SK", "20151225", "B", "60"));
		memberList.add(new Member(100006, "차공단", "010-1111-7777", "SK", "20151211", "C", "60"));
		
		moneyList.add(new Money(100001, 20160001, 500, 5, 2500, "A001", "20160101"));
		moneyList.add(new Money(100001, 20160002, 1000, 4, 4000, "A002", "20160101"));
		moneyList.add(new Money(100001, 20160003, 500, 3, 1500, "A008", "20160101"));
		moneyList.add(new Money(100002, 20160004, 2000, 1, 2000, "A004", "20160102"));
		moneyList.add(new Money(100002, 20160005, 500, 1, 500, "A001", "20160103"));
		moneyList.add(new Money(100003, 20160006, 1500, 2, 3000, "A003", "20160103"));
		moneyList.add(new Money(100004, 20160007, 500, 2, 1000, "A001", "20160104"));
		moneyList.add(new Money(100004, 20160008, 300, 1, 300, "A005", "20160104"));
		moneyList.add(new Money(100004, 20160009, 600, 1, 600, "A006", "20160104"));
		moneyList.add(new Money(100004, 20160010, 3000, 1, 3000, "A007", "20160106"));
	}
	
	void run() {
		init();
		ArrayList<Member> tempMem = new ArrayList<Member>();
		ArrayList<Money> tempMon = new ArrayList<Money>();
		for (int i = 0; i < memberList.size(); i++) {
			tempMem.add(memberList.get(i));
		}
		for (int i = 0; i < moneyList.size(); i++) {
			tempMon.add(moneyList.get(i));
		}
		int[] sum = new int[tempMon.size()];
		for (int i = 0; i < tempMem.size(); i++) {
			for (int j = 0; j < tempMon.size(); j++) {
				if (tempMem.get(i).getCustno() == tempMon.get(j).getCustno()) {
					sum[i] += tempMon.get(j).getPrice();
				}
			}
		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = i + 1; j < sum.length; j++) {
				if (sum[i] < sum[j]) {
					int temp = sum[i];
					sum[i] = sum[j];
					sum[j] = temp;
					
					Member temp2 = tempMem.get(i);
					tempMem.set(i, tempMem.get(j));
					tempMem.set(j, temp2);
				}
			}
		}
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] != 0) {
				System.out.printf("%d  %s \t %d\n", tempMem.get(i).getCustno(), tempMem.get(i).getCustname(), sum[i]);
				System.out.println("---------------------");
			}
		}
	}
}

public class _03캡슐화연습 {
	public static void main(String[] args) {
		
		Manager mg = new Manager();
		mg.run();
	}
}
