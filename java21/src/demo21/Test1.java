package demo21;

import java.util.function.Function;

public class Test1 {
	public static void main(String[] args) {
		Function<String, Integer> s =name->name.length();
		System.out.println(s.apply("VeeTechnologies"));
		int i = s.apply("Sankari");
		System.out.println(i);
		Function<Integer, Integer> fun= a->a*a;
		System.out.println(fun.apply(7));
	}
}
