package impl;

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
        return validateConditions(points);
    }

    @Override
    public GameState playerTwoScored() {
        return validateConditions(points);
    }

    private GameState validateConditions(int points) {
        int incrementPoints = points + 1;
        if (incrementPoints == 4) {
            return new AdvantageGameState();
        }
        return new UnEvenGameState(points, incrementPoints);
    }




}
