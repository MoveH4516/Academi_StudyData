package 기초4문제;
/*
[문제]
	자동차는 154km의 거리를 1시간 18분에 달린다.
	트럭은 215km의 거리를 2시간 17분에 달린다.
	자동차가 트럭보다 빠른지 여부를 출력해라
	
	자동차가 더 빠르다
	트럭이 더 빠르다를 출력 
	
	정답은 자동차가 더빠르다 출력하시오 

*/
public class _문제05자동차경주 {
	public static void main(String[] args) {
		
		int carDis = 154;
		int truckDis = 215;
		int cartime = 78;
		int trucktime = 137;
		
		double carVelocity = 1.0 * carDis / cartime;
		double truckVelocity = 1.0 * truckDis / trucktime;
		
		if (carVelocity > truckVelocity) {
			System.out.println("자동차가 더 빠르다.");
		}
		if (truckVelocity > carVelocity) {
			System.out.println("트럭이 더 빠르다.");
		}
		if (carVelocity == truckVelocity) {
			System.out.println("속도가 같다.");
		}
		
	}
}
