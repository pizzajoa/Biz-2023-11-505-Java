package jjh.exec;

import jjh.service.GameService;

public class JjhBlackJackExec {
	public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
