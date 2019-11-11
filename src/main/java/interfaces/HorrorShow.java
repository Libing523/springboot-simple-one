package interfaces;

/**
 * 
 * @ClassName: HorrorShow
 * @Description: 9.5通过继承来扩展接口
 * @author lishuaibing
 * @date 2019年11月11日 下午1:33:39
 *
 */

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destory();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {
	}

	public void destory() {
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {

	@Override
	public void destory() {
	}

	@Override
	public void menace() {
	}

	@Override
	public void kill() {
	}

	@Override
	public void drinkBlood() {
	}

}

public class HorrorShow {

	static void u(Monster b) {
		b.menace();
	}

	static void v(DangerousMonster d) {
		d.menace();
		d.destory();
	}

	static void w(Lethal l) {
		l.kill();
	}

	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}

}
