package interfaces.classprocessor;

import java.util.Arrays;

/**
 * 
 * @ClassName: Apply
 * @Description: 9.3 完全解耦
 * 策略设计模型：
 *     创建一个能够根据所传递的参数对象的不同而具有不同行为的方法
 * @author lishuaibing
 * @date 2019年11月8日 下午2:48:27
 *
 */

class Processor {
	//相当于策略
	public String name() {
		return getClass().getSimpleName();
	}

	Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor {
	String process(Object input) {
		return ((String) input).toUpperCase();
	}
}

class Downcase extends Processor {
	String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends Processor {
	String process(Object input) {

		return Arrays.toString(((String) input).split(" "));
	}
}

public class Apply {
	public static void process(Processor p, Object s) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}

	public static String s = "Disagreement with beliefs is by definition incorrect";

	public static void main(String[] args) {
		//有三种不同的类型的策略应用到String s 上
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}

	/**
	 *  Using Processor Upcase
		DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT
		Using Processor Downcase
		disagreement with beliefs is by definition incorrect
		Using Processor Splitter
		[Disagreement, with, beliefs, is, by, definition, incorrect]

	 */
}
