package impl;

import main.GameState;
import main.ScoreMapper;

public class UnEvenGameState implements GameState {

  private final int pointsPlayer1;
  private final int pointsPlayer2;
  private final ScoreMapper scoreMapper;

  public UnEvenGameState(int player1, int player2) {
    this.pointsPlayer1 = player1;
    this.pointsPlayer2 = player2;
    this.scoreMapper = new ScoreMapper();
  }

  @Override
  public String asString(String namePlayer1, String name) {
    return String.format("%s-%s", scoreMapper.mapScore(pointsPlayer1), scoreMapper.mapScore(pointsPlayer2));
  }

  @Override
  public GameState playerOneScored() {
    return null;
  }

  @Override
  public GameState playerTwoScored() {
    return null;
  }
}
