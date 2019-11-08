package interfaces.music4;

import polymorphism.music.Note;

/**
 * 
 * @ClassName: Music4
 * @Description: 9.1抽象类与抽象方法 
 * 1、如果一个类包含一个或者多个抽象方法，该类必须被限定为抽象的
 * 2、如果从一个抽象类继承，并想创建该新类的对象，那么就必须为基类中的所有抽象方法提供方法的定义。
 *   如果不这样做，那么导出类便也是抽象类，编译器将会强制我们用abstract关键字限定这个类
 * 3、抽象类中可以定义变量，非抽象方法可以有方法体(方法的实现)，抽象方法不需要方法体，扩展类继承抽象类必须继承抽象方法
 *               
 * 
 * @author lishuaibing
 * @date 2019年11月8日 上午9:50:54
 *
 */

abstract class Instrument {
	private int i;

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();

}

class Wind extends Instrument {

	@Override
	public void play(Note n) {
		System.out.println("Wind.play()" + n);
	}

	public String what() {
		return "Wind";
	}

	@Override
	public void adjust() {

	}
}

class Percussion extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Percussion.play()" + n);
	}

	public String what() {
		return "Percussion";
	}

	@Override
	public void adjust() {

	}
}

class Stringed extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Stringed.play()" + n);
	}

	public String what() {
		return "Stringed";
	}

	@Override
	public void adjust() {

	}
}

class Brass extends Wind {
	@Override
	public void play(Note n) {
		System.out.println("Brass.play()" + n);
	}

	@Override
	public void adjust() {
		System.out.println("Brass.adjust()");
	}
}

class Woodwind extends Wind {
	@Override
	public void play(Note n) {
		System.out.println("Woodwind.play()" + n);
	}

	public String what() {
		return "Woodwind";
	}
}

public class Music4 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
		}
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), };
		tuneAll(orchestra);
	}

	/**执行结果：
	 *  Wind.play()MIDDLE_C
		Percussion.play()MIDDLE_C
		Stringed.play()MIDDLE_C
		Brass.play()MIDDLE_C
		Woodwind.play()MIDDLE_C

	 */
}
