package interfaces;

/**
 * 
 * @ClassName: Games
 * @Description: 9.9 接口和工厂采用工厂模式 在相同的棋盘上下国际象棋和西洋跳棋
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
		System.out.println("Checkers move..."+moves);
		return ++moves != MOVES;
	}

}

class CheckersFactory implements GameFactory {

	@Override
	public Game getGame() {

		return new Checkers();
	}

}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;

	@Override
	public boolean move() {
		System.out.println("Chess move..."+moves);
		return ++moves != MOVES;
	}

}

class ChessFactory implements GameFactory {

	@Override
	public Game getGame() {

		return new Chess();
	}

}




public class Games {

	public static void playGame(GameFactory factory) {
		Game g = factory.getGame();
		while(g.move()) ;
	}
	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}
}
