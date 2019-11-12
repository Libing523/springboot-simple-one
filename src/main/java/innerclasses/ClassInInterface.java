package innerclasses;

/**
 * 
    * @ClassName: Parcel11
    * @Description: 10.7 嵌套类——如果不需要内部类与外围对象之间有联系，可以将内部类声明为static
    *  普通的内部类对象隐式保存了一个引用，指向创建它的外围对象。
    *  嵌套类和普通的内部类还有个区别：
    *          普通内部类的字段和方法，只能放在类的外部层次上，所以普通的内部类不能有static数据和static字段，
    *       也不能包含嵌套类，但是嵌套类可以包含这些东西。
    * @author lishuaibing
    * @date 2019年11月12日 上午10:58:41
    *
 */

public interface ClassInInterface {
	/**
	 * 10.7.1 正常情况下，不能在接口中放置任何代码，但是嵌套类可以作为接口中的一部分。
	 */
	void howdy();
	class Test implements ClassInInterface{

		@Override
		public void howdy() {
		System.out.println("howdy...");
			
		}
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
	
	/**执行结果：
	 * howdy...
	 */
}
