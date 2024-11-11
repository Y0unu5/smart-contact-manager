package java8;

import java.util.function.IntPredicate;

public class PredicateEx {
   public static void main(String[] args) {
	int[] x= {0,5,10,15,20,25};
	IntPredicate predicate= i -> i%2==0;
	
	for(int y: x) {
		if(predicate.test(y)) {
			System.out.println(y);
		}
	}
}
}
