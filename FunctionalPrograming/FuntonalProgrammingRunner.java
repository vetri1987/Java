package FunctionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FuntonalProgrammingRunner {
	private static void printBasic(List<String> slist)
	{
		for(String a:slist)
		{
			System.out.println(a);
		}
	}
	
	private static void printBasicWithFP(List<String> slist)
	{
		slist.stream().forEach(
				element -> System.out.println(element) // lambda expression
				);
	}
	private static void printBasicWithFPWithFiltering(List<String> slist)
	{
		slist.stream().filter(element -> element.endsWith("at")).forEach(
				element -> System.out.println("With Filter: - "+element) // lambda expression
				);
	}
	
	private static int printSumWithFP(List<Integer> slist)
	{
		return slist.stream().reduce(0, (number1, number2) -> number1 + number2);
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String[] s = {"Apple", "Banana", "Cat", "Dog"};
		List<String> sl = Arrays.asList(s);
		printBasic(sl);
		printBasicWithFP(sl);
		printBasicWithFPWithFiltering(sl);
		
		Integer[] ilist = {1,4,67,98,23};
		List<Integer> il = Arrays.asList(ilist);
		
		//Sum
		System.out.println(printSumWithFP(il));
		//Sorting
		il.stream().sorted().forEach(e->System.out.println("Sorted value: "+e));
		il.stream().sorted().map(e->e * e).forEach(e->System.out.println("Squared Value"+e));
		System.out.println(il.stream().max((n1,n2) -> Integer.compare(n1,n2)).get());
		il.stream().filter(e -> e%2==1).collect(Collectors.toList()).forEach(e -> System.out.println("odd number"+e));
		System.out.println(IntStream.range(1, 11).map(e-> e * e).boxed().collect(Collectors.toList()));  //Collect it with list
		
		System.out.println(il.stream().max((n1,n2) -> Integer.compare(n1,n2)));  //Optional
		
		Integer[] oddlist = {1,3,67,97,23};
		List<Integer> ilodd = Arrays.asList(oddlist);
		
		System.out.println(ilodd.stream().filter(e -> e%2==0).max((n1,n2) -> Integer.compare(n1,n2)).isPresent());
		System.out.println(ilodd.stream().filter(e -> e%2==0).max((n1,n2) -> Integer.compare(n1,n2)).orElse(0));
	}

}
