package typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @ClassName: Shapes
 * @Description: 14.1 类型信息
 * @author lishuaibing
 * @date 2019年11月14日 上午9:28:42
 *
 */
abstract class Shape {
	void draw() {
		System.out.println(this + ".draw()");
	}

	abstract public String toString();
}

// Circle Square Triangle
class Circle extends Shape {

	@Override
	public String toString() {

		return "Circle";
	}

}

class Square extends Shape {

	@Override
	public String toString() {

		return "Square";
	}

}

class Triangle extends Shape {

	@Override
	public String toString() {

		return "Triangle";
	}

}

public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		for (Shape shape : shapeList) {
			shape.draw();
		}
	}
	/**执行结果：
	 *  Circle.draw()
		Square.draw()
		Triangle.draw()
	 */
}
