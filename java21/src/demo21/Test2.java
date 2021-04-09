package demo21;

import java.util.function.Function;

public class Test2 {
public static void main(String[] args) {
	Function<Integer, Integer> fun1= a-> a*2;
	Function<Integer, Integer> fun2= a-> a*a*a;
	Function<Integer, Integer> fun3= fun1.andThen(fun2);
	System.out.println(fun3.apply(2));
	System.out.println(fun1.compose(fun2).apply(2));
}
}
