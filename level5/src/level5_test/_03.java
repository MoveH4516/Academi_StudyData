package level5_test;


public class _03 {
	public static void main(String[] args) {
		
		// 위 숫자에 한글단위명을 추가 해서 출력 
		// 예) 1234만5천6백7십8
		// 예) 4천5
		// 예) 23만5십5
		// 예) 1
		// 예) 2백	
		
		int[][] data = {
				{12345678},
				{4005},
				{230055},
				{1},
				{200}
		};
		
		for (int i = 0; i < data.length; i++) {
			if (data[i][0] / 10000 != 0) {
				System.out.print(data[i][0] / 10000	+ "만");
				data[i][0] %= 10000;
			}
			if (data[i][0] / 1000 != 0) {
				System.out.print(data[i][0] / 1000 + "천");
				data[i][0] %= 1000;
			}
			if (data[i][0] / 100 != 0) {
				System.out.print(data[i][0] / 100 + "백");
				data[i][0] %= 100;
			}
			if (data[i][0] / 10 != 0) {
				System.out.print(data[i][0] / 10 + "십");
				data[i][0] %= 10;
			}
			if (data[i][0] != 0) {
				System.out.println(data[i][0]);
			}
		}
		
	}
}
