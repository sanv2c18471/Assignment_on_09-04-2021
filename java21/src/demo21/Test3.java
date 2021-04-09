package demo21;

import java.util.function.Consumer;

public class Test3 {
public static void main(String[] args) {
	Consumer<Integer> conObj= (a)->System.out.println(a);
	//int i = conObj.accept(4);
	conObj.accept(3);
	//System.out.println(i);
}
}
