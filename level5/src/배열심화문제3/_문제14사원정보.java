package 배열심화문제3;

public class _문제14사원정보 {
	public static void main(String[] args) {
		
		// [부서정보]
        // [부서번호,부서명,지역]
		
		/*
		 [문제]
		 	1 DALLAS 에서 근무하는 사원의 이름, 직급, 부서번호, 부서명을 조회
		 	
		 	2 ALLEN 과 같은 부서에 근무하는 사원의 이름, 부서번호 조회
		 	
		 	3 부서별최대 급여와 최소 급여
		 	
		 	4 부서별 급여 평균 (2000 이상만 출력)
		 	
		 	5 부서번호가 30인 이름 직급 부서번호 부서위치 조회
		 	
		 	6 이름에 A 가 들어가는 사원의 이름, 부서명 조회
		 	
		 	7 사원명 JONES 가 속한 부서명 조회
		 	
		 	8 10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명 조회
		 	
		 	9 1987년생 사원의 이름과 직책과 부서위치 조회
		 	
		 */
		
		String[][] deData = { { "10", "ACCOUNTING", "NEW YORK" }, { "20", "RESEARCH", "DALLAS" },
				{ "30", "SALES", "CHICAGO" }, { "40", "OPERATIONS", "BOSTON" }, };
				// 번호, 이름, 직책, 상사번호, 입사일, 급여, 커미션, 부서번호
		String[][] emData = { { "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },
				{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },
				{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },
				{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },
				{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },
				{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },
				{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10" },
				{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },
				{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },
				{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },
				{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },
				{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" } 
			};
		//문제1
		String area = "SALES";
		System.out.printf("%-10s\t %-10s\t %-10s\t %s\n", "이름", "직급", "부서번호", "부서명");
		for (String[] deD : deData) {
			if (area.equals(deD[1])) {
				for (String[] emD : emData) {
					if (deD[0].equals(emD[7])) {
						System.out.printf("%-10s\t %-10s\t %-10s\t %s\n", emD[1], emD[2], emD[7], deD[1]);
					}
				}
			}
		}
		System.out.println();
		//문제2
		String name = "ALLEN";
		int idx = 0;
		for (int i = 0; i < emData.length; i++) {
			if (emData[i][1].equals(name)) {
				idx = i;
				break;
			}
		}
		System.out.printf("%-10s\t %-10s\t\n", "이름", "부서번호");
		for (String[] emD : emData) {
			if (emD[7].equals(emData[idx][7]) && !emD[1].equals(name)) {
				System.out.printf("%-10s\t %-10s\t\n", emD[1], emD[7]);
			}
		}
		
		System.out.println();
		// 문제3
		System.out.printf("%-10s\t %-10s\t %-10s\t%n", "부서명", "최대 급여", "최소 급여");
		int max = 0;
		int min = 0;		
		for (int i = 0; i < deData.length; i++) {
			max = 0;
			int cnt = 0;
			for (String[] emD : emData) {
				if (deData[i][0].equals(emD[7])) {
					cnt++;
					if (cnt == 1) {
						min = Integer.parseInt(emD[5]);
					}
					if (max < Integer.parseInt(emD[5])) {
						max = Integer.parseInt(emD[5]);
					}
					if (min > Integer.parseInt(emD[5])) {
						min = Integer.parseInt(emD[5]);
					}
				}
			}
			if (cnt > 0) {
			System.out.printf("%-10s\t %-10d\t %-10d\t%n", deData[i][1],max, min);
			} else {
				System.out.printf("%-10s\t %-10s\t %-10s\t%n", deData[i][1],"no data", "no data");
			}
		}
		
		System.out.println();
		//문제4
		System.out.printf("%-10s\t %-10s\t%n", "부서명", "평균 급여");
		for (int i = 0; i < deData.length; i++) {
			int cnt = 0;
			int sum = 0;
			double avg = 0;
			for (String[] emD : emData) {
				if (deData[i][0].equals(emD[7])) {
					cnt++;
					sum += Integer.parseInt(emD[5]);
				}
			}
			avg = 1.0 * sum / cnt;
			if (avg >= 2000) {
				System.out.printf("%-10s\t %-10.2f\t\n", deData[i][1], avg);
			}
		}
		System.out.println();
		//문제5
		String num = "30";
		int idx2 = 0;
		System.out.printf("%-10s\t %-10s\t %-10s\t %-10s\t%n", "이름", "직급", "부서번호", "부서위치");
		for (int k = 0; k < deData.length; k++) {
			if (deData[k][0].equals(num)) {
				idx2 = k;
				break;
			}
		}
		for (String[] emD : emData) {
			if (emD[7].equals(num)) {
				System.out.printf("%-10s\t %-10s\t %-10s\t %-10s\t%n", emD[1], emD[2], deData[idx2][0], deData[idx2][2]);
			}
		}
		System.out.println();
		//문제6
		int idx3 = 0;
		System.out.printf("%-10s\t %-10s\t%n", "이름", "부서명");
		for (String[] emD : emData) {
			idx = -1;
			for (int j = 0; j < emD[1].length(); j++) {
				if (emD[1].charAt(j) == 'A') {
					idx = j;
				}
			}
			for (int k = 0 ; k < deData.length; k++) {
				if (emD[7].equals(deData[k][0])) {
					idx3 = k;
				}
			}
			if (idx != -1) {
				System.out.printf("%-10s\t %-10s\t%n", emD[1], deData[idx3][1]);
			}
		}
		System.out.println();
		//문제7
		String name2 = "JONES";
		idx = 0;
		for (String[] emD : emData) {
			if (emD[1].equals(name2)) {
				for (int k = 0; k < deData.length; k++) {
					if (emD[7].equals(deData[k][0])) {
						idx = k;
					}
				}
			}
		}
		System.out.printf("%-10s\t %-10s\t%n", "이름", "부서명");
		System.out.printf("%-10s\t %-10s\t%n", name2, deData[idx][1]);
		System.out.println();
		//문제8
		String num1 = "10";
		System.out.printf("%-10s\t %-10s\t\n", "이름", "부서명");
		for (String[] deD : deData) {
			if (num1.equals(deD[0])) {
				for (String[] emD : emData) {
					if (deD[0].equals(emD[7])) {
						System.out.printf("%-10s\t %-10s\t\n", emD[1], deD[1]);
					}
				}
			}
		}
		System.out.println();
		
		//문제9
		String year = "1987";
		int idx4 = 0;
		System.out.printf("%-10s\t %-10s\t %-10s\n", "이름", "직책", "부서위치");
		for (String[] emD : emData) {
			idx = 0;
			String[] emD2 = emD[4].split("-");
			if (emD2[2].equals(year)) {
				idx = -1;
				for (int j = 0; j < deData.length; j++) {
					if (emD[7].equals(deData[j][0])) {
						idx4 = j;
						break;
					}
				}
			}			
			if (idx == -1) {
				System.out.printf("%-10s\t %-10s\t %-10s\n", emD[1], emD[2], deData[idx4][2]);
			}
		}
	}
}
