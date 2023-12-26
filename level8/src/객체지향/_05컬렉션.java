package 객체지향;

import java.util.ArrayList;

public class _05컬렉션 {
	public static void main(String[] args) {
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		list.add(new int[4]);
		
		System.out.println(list.get(0)[2]);
		
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		list2.add(new ArrayList<Integer>());
		
		list2.get(0).add(3);
		
		System.out.println(list2.get(0).get(0));
	}
}
