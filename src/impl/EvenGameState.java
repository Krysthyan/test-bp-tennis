package impl;

import main.Player;
import main.ScoreMapper;
import main.GameState;

public class EvenGameState implements GameState {

    final int points;
    final ScoreMapper mapper;

    public EvenGameState(int points) {
        this.points = points;
        this.mapper = new ScoreMapper();
    }

    @Override
    public String asString(String namePlayer1, String NamePlayer2) {
        return mapper.mapScore(points) + "-all";
    }

    @Override
    public GameState playerOneScored() {
        return validateConditions(points, Player.ONE);
    }

    @Override
    public GameState playerTwoScored() {
        return validateConditions(points, Player.TWO);
    }

    private GameState validateConditions(int points, Player player) {
        int incrementPoints = points + 1;
        if (incrementPoints == 4) {
            return new AdvantageGameState(player);
        }
        return new UnEvenGameState(points, incrementPoints);
    }
}
