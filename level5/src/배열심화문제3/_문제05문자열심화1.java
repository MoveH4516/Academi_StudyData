package 배열심화문제3;

public class _문제05문자열심화1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	moneyData 와 nameData 를 조합해서 아래와 같이 만들어야 한다.
		 	번호/이름/돈
		 	
		 	moneyData 에 있는 인원만 가능.
		 	nameData 에 있지만 moneyData 에 없다면 결과에 출력되지 않는다.
		 */
		
		String nameData = "";
		nameData+=	"100001/이만수";nameData += "\n";		
		nameData += "100002/이영희";nameData += "\n";
		nameData += "100003/유재석";nameData += "\n";
		nameData += "100004/박명수";nameData += "\n";
		nameData += "100005/차은우";nameData += "\n";
		nameData += "100006/박연미";
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
		
		String data = "";
		
		String[] namearr = nameData.split("\n");
		String[] moneyarr = moneyData.split("\n");
	
		for (String money : moneyarr) {			
			for (String name : namearr) {
				if (money.substring(0, 6).equals(name.substring(0, 6))) {
					data += name + money.substring(6) +"\n";
				}
			}
		}
		System.out.println(data);
	}
}
