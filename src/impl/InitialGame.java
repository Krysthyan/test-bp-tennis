package impl;

import main.GameState;

public class InitialGame implements GameState {

  @Override
  public String asString(String namePlayer1, String name) {
    return "love-all";
  }

  @Override
  public GameState playerOneScored() {
    return new UnEvenGameState(1,0);
  }

  @Override
  public GameState playerTwoScored() {
    return null;
  }
}
