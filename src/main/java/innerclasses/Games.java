package innerclasses;

/**
 * 
 * @ClassName: Games
 * @Description: 10.6.1 内部类采用工厂模式 在相同的棋盘上下国际象棋和西洋跳棋
 * @author lishuaibing
 * @date 2019年11月11日 下午4:15:49
 *
 */
interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

// Checkers checkersFactory Chess ChessFactory playGame
class Checkers implements Game {

	private int moves = 0;
	private static final int MOVES = 3;

	@Override
	public boolean move() {
		System.out.println("Checkers move..." + moves);
		return ++moves != MOVES;
	}

	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new Checkers();
		}
	};

}

class Chess implements Game {

	private int moves = 0;
	private static final int MOVES = 4;

	@Override
	public boolean move() {
		System.out.println("Chess move..." + moves);
		return ++moves != MOVES;
	}

	public static GameFactory factory = new GameFactory() {

		@Override
		public Game getGame() {

			return new Chess();
		}

	};
}

public class Games {

	public static void playGame(GameFactory factory) {
		Game g = factory.getGame();
		while (g.move())
			;
	}

	public static void main(String[] args) {
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}
	/**执行结果：
	 *  Checkers move...0
		Checkers move...1
		Checkers move...2
		Chess move...0
		Chess move...1
		Chess move...2
		Chess move...3

	 */
}