package 기초4문제;
/*
[문제]
	고속버스를 타고 여행을 떠나려한다.
	출발시간까지 1시간 여유가 있다.
	고속버스역과 상점을 시속 3km를 걸어서 왕복을 하고
	10분 동안 물건을 산다고 하면
	역에서 1.3km 떨어진 상점을 다녀올 수 있는지 여부를 판단해서
	
	물건 살수 있음 
	물건 살수 없음을 출력하시오 
	
	*/
public class _문제06여행 {
	public static void main(String[] args) {
		
		int restTime = 1;
		int velocity = 3;
		double purTime = 10.0 / 60;
		double distance = 1.3 * 2;
		
		boolean posible = restTime >= purTime + distance / velocity;
		System.out.println(String.format("%.0f",(purTime + distance / velocity) * 60) + "분");
		if (posible) {
			System.out.println("물건 살 수 있음.");
		}
		if (!posible) {
			System.out.println("물건 살 수 없음.");
		}
	}
}
