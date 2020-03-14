package FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class oddfilterPredicate implements Predicate<Integer> {	

	@Override
	public boolean test(Integer t) {
		
		return t%2 == 1;
	}
	
}

public class LambdaBehindTheScreenRunner {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] oddlist = {1,3,67,42,97,23,76};
		List<Integer> ilodd = Arrays.asList(oddlist);
		
		ilodd.stream().sorted().
				filter(e -> e%2==1).
				map(e->e * e).
				forEach(e->System.out.println("Squared Value: "+e)
						);
		
		ilodd.stream().sorted().
		filter(new oddfilterPredicate()).
		map(e->e * e).
		forEach(e->System.out.println("Squared Value: "+e)
				);
		
		//Predicate<? super T> predicate
		// boolean test(T t);
	}

}
