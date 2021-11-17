package impl;

import main.GameState;
import main.Player;

public class AdvantageGameState implements GameState {

  final Player player;

  public AdvantageGameState(Player player) {
    this.player = player;
  }

  @Override
  public String asString(String namePlayer1, String name) {
    return null;
  }

  @Override
  public GameState playerOneScored() {
    if (this.player == Player.ONE) {
            return new WinPlayerGameState();
    }

    return new DeuceGameState();
  }

  @Override
  public GameState playerTwoScored() {
    if(this.player == Player.TWO) {
      return new WinPlayerGameState();
    }

    return new DeuceGameState();
  }

}
