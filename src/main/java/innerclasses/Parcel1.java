package innerclasses;

/**
 * 
 * @ClassName: Parcel1
 * @Description: 10.1 创建内部类
 * @author lishuaibing
 * @date 2019年11月12日 上午8:47:32
 *
 */

public class Parcel1 {

	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			this.label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Tasmania");
	}
	/**执行结果：
	 * Tasmania
	 */
}
