package 클래스기본;

public class _09클래스배열이론3 {
	public static void main(String[] args) {
		
		String data = "";
		data += "1001,qwer,1234,김정민,10\n";
		data += "1002,asdf,2345,우충현,3\n";
		data += "1003,zxcv,3456,이만수,30";
		
		String[] arr1 = data.split("\n");
		Student[] stList = new Student[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			String[] arr2 = arr1[i].split(",");
			Student s = new Student();
			stList[i] = s;
			stList[i].number = Integer.parseInt(arr2[0]);
			stList[i].id = arr2[1];
			stList[i].pw = arr2[2];
			stList[i].name = arr2[3];
			stList[i].score = Integer.parseInt(arr2[4]);
			
//			s.number = Integer.parseInt(arr2[0]);
//			s.id = arr2[1];
//			s.pw = arr2[2];
//			s.name = arr2[3];
//			s.score = Integer.parseInt(arr2[4]);
//			
//			stList[i] = s;
		}
		
		for (int i = 0; i < stList.length; i++) {
			System.out.printf("학번 : %d\n", stList[i].number);
			System.out.printf("id : %s\n", stList[i].id);
			System.out.printf("pw : %s\n", stList[i].pw);
			System.out.printf("이름 : %s\n", stList[i].name);
			System.out.printf("점수 : %d\n", stList[i].score);		
			System.out.println("---------------");
		}
		
	}
}
