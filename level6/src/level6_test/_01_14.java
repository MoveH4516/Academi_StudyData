package level6_test;

public class _01_14 {
	public static void main(String[] args) {
		
		String[][] deData = { { "10", "ACCOUNTING", "NEW YORK" }, { "20", "RESEARCH", "DALLAS" },
				{ "30", "SALES", "CHICAGO" }, { "40", "OPERATIONS", "BOSTON" }, };

		String[][] emData = { 
				{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },
				{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },
				{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },
				{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },
				{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },
				{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },
				{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "1000", "10" },
				{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },
				{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },
				{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },
				{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },
				{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" } };

		
        // 급여는 커미션을 제외해서 걔산한다 
		Employee[] eList = new Employee[emData.length];
		Department[] dList = new Department[deData.length];
		
		int idx = 0;
		for (String[] d : deData) {
			Department dd = new Department();
			dd.no = Integer.parseInt(d[0]);;
			dd.name = d[1];
			dd.location = d[2];
			dList[idx++] = dd;
		}
		idx = 0;
		for (String[] e : emData) {
			Employee ee = new Employee();
			ee.no = Integer.parseInt(e[0]);
			ee.name = e[1];
			ee.title = e[2];
			if (e[3] != "NULL") {
				ee.supNo = Integer.parseInt(e[3]);
			} 
			ee.date = e[4];
			ee.salary = Integer.parseInt(e[5]);
			ee.com = Integer.parseInt(e[6]);
			ee.deNo = Integer.parseInt(e[7]);
			eList[idx++] = ee;
		}
		// [문제 1] 부서별 평균월급여 
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		System.out.println("[문제 1] 부서별 평균월급여 ");
		System.out.println("   부서명\t        평균 급여");
		for (int i = 0; i < dList.length; i++) {
			sum = 0;
			cnt = 0;
			for (int j = 0; j < eList.length; j++) {
				if (dList[i].no == eList[j].deNo) {
					sum += eList[j].salary;
					cnt++;
				}
			}
			avg = 1.0 * sum / cnt;
			if (cnt == 0) {
				System.out.printf("%10s\t%s\n", dList[i].name, "no data");
			} else {
				System.out.printf("%10s\t%.2f\n", dList[i].name, avg);
			}
		}
		System.out.println();
		// [문제 2]  부서별 전체 사원수와 커미션을 받는 사원들의 수
		cnt = 0;
		System.out.println("[문제 2]  부서별 전체 사원수와 커미션을 받는 사원들의 수");
		System.out.println("   부서명\t    전체 사원 수\t  커미션 받은 사원 수");
		for (int i = 0; i < dList.length; i++) {
			cnt = 0;
			int count = 0;
			for (int j = 0; j < eList.length; j++) {
				if (dList[i].no == eList[j].deNo) {
					cnt++;
					if (eList[j].com != 0) {
						count++;
					}
				}
			}
			System.out.printf("%10s\t%d명\t    %d\n", dList[i].name, cnt, count);
		}
		System.out.println();
		// [문제 3]  부서별 최대 급여와 최소 급여
		int min = 0;
		System.out.println("[문제 3]  부서별 최대 급여와 최소 급여");
		System.out.println("   부서명\t        최대 급여\t  최소 급여");
		for (int i = 0; i < dList.length; i++) {
			int max = 0;
			for (int j = 0; j < eList.length; j++) {
				if (dList[i].no == eList[j].deNo) {
					min = eList[j].salary;
					break;
				}
			}
			for (int j = 0; j < eList.length; j++) {
				if (dList[i].no == eList[j].deNo) {
					if (max < eList[j].salary) {
						max = eList[j].salary;
					}
					if (min > eList[j].salary) {
						min = eList[j].salary;
					}
				}
			}
			if (max == 0) {
				System.out.printf("%10s\t%s\t  %s\n", dList[i].name, "no data", "no data");
			} else {
				System.out.printf("%10s\t%d\t  %d\n", dList[i].name, max, min);
			}
		}
		System.out.println();
		// [문제 4]  부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회하시오.
		System.out.println("[문제 4]  부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회");
		System.out.println("  이름\t   직급\t   부서코드  부서위치");
		for (int i = 0; i < dList.length; i++) {
			if (dList[i].no == 30) {
				for (int j = 0; j < eList.length; j++) {
					if (dList[i].no == eList[j].deNo)
					System.out.printf("%7s %10s   %d %10s\n", eList[j].name, eList[j].title, eList[j].deNo, dList[i].location);
				}
			}
		}
		System.out.println();
		// [문제 5]  커미션을 받는 사원의 이름, 커미션, 부서이름,부서위치를 조회하시오.
		System.out.println("[문제 5]  커미션을 받는 사원의 이름, 커미션, 부서이름,부서위치를 조회");
		System.out.println("  이름\t 커미션\t   부서이름      부서위치");
		for (int i = dList.length - 1; i >= 0; i--) {
			for (int j = 0; j < eList.length; j++) {
				if (eList[j].com != 0 && dList[i].no == eList[j].deNo)
				System.out.printf("%-7s %5d   %10s %10s\n", eList[j].name, eList[j].com, dList[i].name, dList[i].location);
			}
		}
		System.out.println();
		// [문제 6]  급여가 높은 순으로 조회하되 급여가 같을 경우 이름의 철자가 빠른 사원순으로 사번,이름,월급여를 조회하시오.
		System.out.println("[문제 6]  급여가 높은 순으로 조회하되 급여가 같을 경우 이름의 철자가 빠른 사원순으로 사번,이름,월급여를 조회");
		System.out.println("  이름\t 급여");
		int[] sal = new int[eList.length];
		String[] na = new String[eList.length];
		for (int i = 0; i < eList.length; i++) {
			sal[i] = eList[i].salary;
			na[i] = eList[i].name;
		}
		idx = 0;
		for (int i = 0; i < sal.length; i++) {
			for (int j = i + 1; j < sal.length; j++) {
				if (sal[i] < sal[j]) {
					int temp = sal[j];
					sal[j] = sal[i];
					sal[i] = temp;
					
					String tempp = na[j];
					na[j] = na[i];
					na[i] = tempp;
				}
				if (sal[i] == sal[j]) {
					if (na[i].compareTo(na[j]) > 0) {
						String tempp = na[j];
						na[j] = na[i];
						na[i] = tempp;
					}
				}
			}
		}
		for (int i = 0; i < sal.length; i++) {
			System.out.printf("%-7s\t%d\n", na[i], sal[i]);
		}
		System.out.println();
		// [문제 7]  DALLAS에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오.
		System.out.println("[문제 7]  DALLAS에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회");
		System.out.println("  이름\t  직급\t  부서코드  부서명");
		for (int i = 0; i < dList.length; i++) {
			if (dList[i].location.equals("DALLAS")) {
				for (int j = 0; j < eList.length; j++) {
					if (dList[i].no == eList[j].deNo) {
						System.out.printf("%-7s %5s\t    %d %10s\n", eList[j].name, eList[j].title, dList[i].no,dList[i].name);
					}
				}
			}
		}
		System.out.println();
		// [문제 8]  이름에 A 가 들어가는 사원의 이름,부서명을 조회하시오.
		System.out.println("[문제 8]  이름에 A 가 들어가는 사원의 이름,부서명을 조회");
		System.out.println("  이름\t  부서명");
		for (int i = 0; i < eList.length; i++) {
			for (int j = 0; j < eList[i].name.length(); j++) {
				if (eList[i].name.charAt(j) == 'A') {
					for (int k = 0; k < dList.length; k++) {
						if (eList[i].deNo == dList[k].no) {
							System.out.printf("%s\t %s\n", eList[i].name, dList[k].name);
						}
					}
					break;
				}
			}
		}
		System.out.println();
		// [문제 9]  ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
		System.out.println("[문제 9]  ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회");
		System.out.println(" 이름\t부서번호");
		idx = 0;
		for (int i = 0; i < eList.length; i++) {
			if (eList[i].name.equals("ALLEN")) {
				idx = i;
			}
		}
		for (int i = 0; i < eList.length; i++) {
			if (i != idx && eList[i].deNo == eList[idx].deNo) {
				System.out.printf("%s\t %d\n", eList[i].name, eList[i].deNo);
			}
		}
		System.out.println();
		// [문제 10]  10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회하시오.
		System.out.println("[문제 10]  10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회");
		System.out.println(" 이름\t부서명");
		for (int i = 0; i < dList.length; i++) {
			if (dList[i].no == 10) {
				for (int j = 0; j < eList.length; j++) {
					if (dList[i].no == eList[j].deNo) {
						System.out.printf("%s\t%s\n", eList[j].name, dList[i].name);
					}
				}
			}
		}
		System.out.println();
		// [문제 11]  전체 평균 월급여보다 더 많은 월급여를 받은 사원의 사원번호,이름,월급여 조회하시오.
		System.out.println("[문제 11]  전체 평균 월급여보다 더 많은 월급여를 받은 사원의 사원번호,이름,월급여 조회");
		System.out.println("사원번호\t이름\t월급여");
		sum = 0;
		for (int i = 0; i < eList.length; i++) {
			sum += eList[i].salary;
		}
		avg = 1.0 * sum / eList.length;
		for (int i = 0; i < eList.length; i++) {
			if (eList[i].salary > avg) {
				System.out.printf("%-7d %s\t%d\n",eList[i].no, eList[i].name, eList[i].salary);
			}
		}
		System.out.println();
		// [문제 12]  부서번호가 20인 사원중에서 최대급여를 받는 사원과 동일한 급여를 받는 사원의 사원번호, 이름을 조회하시오.
		System.out.println("[문제 12]  부서번호가 20인 사원중에서 최대급여를 받는 사원과 동일한 급여를 받는 사원의 사원번호, 이름을 조회");
		System.out.println("사원번호\t이름");
		int max = 0;
		for (int i = 0; i < eList.length; i++) {
			if (eList[i].deNo == 20) {
				if (max < eList[i].salary) {
					max = eList[i].salary;
				}
			}
		}
		for (int i = 0; i < eList.length; i++) {
			if (eList[i].salary == max) {
				System.out.printf("%d\t%s\n", eList[i].no, eList[i].name);
			}
		}
		System.out.println();
		// [문제 13]  사원 테이블에서 사원명과 해당 사원의 관리자명을 검색하시오
		System.out.println("[문제 13]  사원 테이블에서 사원명과 해당 사원의 관리자명을 검색");
		System.out.println("사원이름\t관리자 이름");
		for (int i = 0; i < eList.length; i++) {
			for (int j = 0; j < eList.length; j++) {
				if (eList[i].supNo == eList[j].no) {
					System.out.printf("%s\t%s\n",eList[i].name, eList[j].name);
				}
			}
		}
		// [문제 14]  사원 테이블에서 부서별 최대 급여를 받는 사원들의 사번, 이름, 부서코드, 급여를 검색하시오.
		System.out.println("[문제 14]  사원 테이블에서 부서별 최대 급여를 받는 사원들의 사번, 이름, 부서코드, 급여를 검색");
		System.out.println("사원번호\t이름\t부서코드\t급여");
		idx = 0;
		for (int i = 0; i < dList.length; i++) {
			max = 0;
			for (int j = 0; j < eList.length; j++) {
				if (dList[i].no == eList[j].deNo) {
					if (max < eList[j].salary) {
						max = eList[j].salary;
						idx = j;
					}
				}
			}
			if (max != 0) {
			System.out.printf("%d\t%s\t%d\t%d\n", eList[idx].no, eList[idx].name, eList[idx].deNo, eList[idx].salary);
			}
		}
	}
}
