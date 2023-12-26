package 클래스문제;

public class _문제10클래스배열기본문제 {
	 public static void main(String[] args) {
		
		 /*
		  [문제]
		  	1. data 에 있는 내용을 잘라서 stuList 에 저장 후 출력
		  	
		  	2. 꼴등 삭제 후 다시 data 에 저장
		  */
		 
		 String data = "";
		 data += "김영희/38\n";
		 data += "이민수/40\n";
		 data += "이철민/60";
		 System.out.println(data);
		 System.out.println("-----------------");
		 String[] datas = data.split("\n");
		 String[][] d = new String[datas.length][];
		 Student[] stuList = new Student[datas.length];
		 for (int i = 0; i < d.length; i++) {
			 d[i] = datas[i].split("/");
		 }
		 for (int i = 0; i < datas.length; i++) {
			 Student s = new Student();
			 s.name = d[i][0];
			 s.score = Integer.parseInt(d[i][1]);
			 stuList[i] = s;
		 }
		 for (int i = 0; i < stuList.length; i++) {
			 System.out.printf("%s %d\n", stuList[i].name, stuList[i].score);
		 }
		 System.out.println("-----------------");
		 int min = stuList[0].score;
		 int idx = 0;
		 for (int i = 0; i < stuList.length; i++) {
			 if (min > stuList[i].score) {
				 min = stuList[i].score;
				 idx = i;
			 }
		 }
		 for (int i = idx; i < stuList.length - 1; i++) {
			 stuList[i] = stuList[i + 1];
		 }
		 stuList[stuList.length - 1] = null;
		 data = "";
		 for (int i = 0; i < stuList.length; i++) {
			 if (stuList[i] != null) {
				 data += stuList[i].name + "/" + stuList[i].score;
				 if (stuList[i + 1] != null) {
					 data += "\n";
				 }
			 }
		 }
		 System.out.println(data);
	}
}
