package polymorphism;

/**
 * 
    * @ClassName: Actor
    * @Description: 8.5用继承进行设计
    * @author lishuaibing
    * @date 2019年11月8日 上午9:10:56
    *
 */
class Actor {
	public void act() {
	}
}

class HappyActor extends Actor {
	public void act() {
		System.out.println("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		System.out.println("SadActor");
	}
}

class Stage {
	private Actor actor = new HappyActor();

	public void change() {
		actor = new SadActor();
	}

	public void performPlay() {
		actor.act();
	}
}

public class Transmogrify {

	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
	/**执行结果：
	 *  HappyActor
		SadActor
	 */
}
