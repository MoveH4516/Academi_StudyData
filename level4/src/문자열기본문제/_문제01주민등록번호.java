package 문자열기본문제;

public class _문제01주민등록번호 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	각각 만 나이와 성별을 출력
		 */
		
		String jumin1 = "890101-2012932";
		String jumin2 = "020101-3012932";
		String[] jumin = {jumin1, jumin2};
		String[] gender = new String[jumin.length];
		int[] age = new int[jumin.length];
		int year = 23;
		for (int i = 0; i < jumin.length; i++) {
			age[i] = Integer.parseInt(jumin[i].substring(0,2));
			if (jumin[i].substring(7,8).equals("3") || jumin[i].substring(7,8).equals("4")) {
				age[i] = year - age[i];
			} else {
				age[i] = 100 - age[i] + year;
			}			
			if (jumin[i].substring(7,8).equals("2") || jumin[i].substring(7,8).equals("4")) {
				gender[i] = "여성";
			} else if (jumin[i].substring(7,8).equals("1") || jumin[i].substring(7,8).equals("3")) {
				gender[i] = "남성";
			}
			System.out.printf("주민번호 %d번 %s %d세\n", i + 1, gender[i], age[i]);
		}
		
	}
}
