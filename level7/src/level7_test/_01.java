package level7_test;

class Node4 {
	int number;
	String name;
	String address;
	int[] scoreList = new int[3];
	int total;
	double avg;
	int rank;
	
	void init(int num, String name, String add, int[] score, int total, double avg, int rank) {
		this.number = num;
		this.name =name;
		this.address = add;
		this.scoreList = score;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}
	
	void print() {
		System.out.printf(" %d %s %s %3d  %3d  %3d  %3d  %.2f  %d\n", number, name, address, scoreList[0], scoreList[1], scoreList[2], total, avg, rank);
	}
	
}

class Return4 {
	
	Node4[] node(String[][] student, String[][] score) {
		Node4[] n = new Node4[student.length];
		int[][] sco = new int[student.length][3];
		
		for (int i = 0; i < sco.length; i++) {
			for (int j = 0; j < 3; j++) {
				sco[i][j] = Integer.parseInt(score[i][j + 1]);
			}
		}
		for (int i = 0; i < n.length; i++) {
			n[i] = new Node4();
			n[i].init(Integer.parseInt(student[i][2]), student[i][0], student[i][1], sco[i], total(score)[i], avg(score)[i], rank(score)[i]);
		}
		return n;
	}
	
	int[] total(String[][] score) {
		int[] t = new int[score.length];
		for (int i = 0; i < t.length; i++) {
			for (int j = 1; j < score[i].length; j++) {
				t[i] += Integer.parseInt(score[i][j]);
			}
		}
		return t;
	}
	
	double[] avg (String[][] score) {
		total(score);
		double[] a = new double[total(score).length];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = 1.0 * total(score)[i] / 3;
		}
		
		return a;
	}
	
	int[] rank (String[][] score) {
		avg(score);
		int[] r = new int[avg(score).length];
		for (int i = 0; i < r.length; i++) {
			int num = 1;
			for (int j = 0; j < r.length; j++) {
				if (avg(score)[i] < avg(score)[j]) {
					num++;
				}
			}
			r[i] = num;
		}
		return r;
	}
	
}

public class _01 {
	public static void main(String[] args) {

		String[][] student = {
				{ "이만수", "신촌", "1001" }, 
				{ "김철민", "강남", "1002" },
				{ "심장호", "대치", "1003" },
				{ "유재석", "강동", "1004" } 
				};
		String[][] score = {
				{ "1001", "10", "60", "60" },
				{ "1002", "100", "20", "30"},
				{ "1003", "23", "63", "31" },
				{ "1004", "45", "30", "35" },
				};

		Return4 re = new Return4();
		Node4[] nodeList = re.node(student, score);
		System.out.println("[번호][이름][지역][국어][수학][영어][총합][평균][등수]");
		for (Node4 n : nodeList) {
			n.print();
		}
		
	}
}
