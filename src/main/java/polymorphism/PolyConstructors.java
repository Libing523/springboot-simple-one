package polymorphism;

/**
 * 
    * @ClassName: Glyph
    * @Description: 8.3.3 构造器内部的多态方法的行为
    * 描述：被覆盖的方法在对象被完全构造之前就会被调用
    * @author lishuaibing
    * @date 2019年11月7日 下午3:51:06
    *
 */
class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph().radius=" + radius);
	}

	void draw() {
		//redius在RoundGlyph类未初始化之前调用，radius初始化值为0
		System.out.println("RoundGlyph.draw().radius=" + radius);
	}
}

public class PolyConstructors {

	public static void main(String[] args) {
		new RoundGlyph(5);
	}
	
	
	/** 执行结果：
	 *  Glyph() before draw()
		RoundGlyph.draw().radius=0
		Glyph() after draw()
		RoundGlyph.RoundGlyph().radius=5
	 */
}
