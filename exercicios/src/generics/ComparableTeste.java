package generics;

import java.util.TreeSet;

public class ComparableTeste {

	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(125);
		nums.add(16);
		nums.add(281);
		nums.add(-14);
		
		for(Integer i: nums) {
			System.out.println(i);
		}
	}
}
