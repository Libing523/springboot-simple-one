package interfaces;

/**
 * 
    * @ClassName: CanFight
    * @Description: 9.4 Java中的多重继承，具体类组合数个接口之后产生了一个新类
    * @author lishuaibing
    * @date 2019年11月11日 上午9:52:25
    *
 */
interface CanFight {void fight();}

interface CanSwim {void swim();}

interface CanFly {void fly();}

class ActionCharacter {
	public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

	@Override
	public void swim() {}

	@Override
	public void fly() {}

}

public class Adventure {

	public static void t(CanFight x) {x.fight();}
	public static void u(CanSwim x) {x.swim();}
	public static void v(CanFly x) {x.fly();}
	public static void w(ActionCharacter x) {x.fight();}
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
