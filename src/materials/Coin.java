package materials;

import java.util.Random;

public class Coin {

  private static Coin coinState = new Coin();
  private CoinState pileOuFace ;


  /**
   * Change l'état de la pièce.
   * 50% de probabilité d'obtenir HEADS, 50% de probabilité d'obtenir TAILS
   */
  public void throwCoin() {
    // TODO : Votre code ici
    Random random = new Random();
    int pileFace = random.nextInt(2);
    if (pileFace == 0) {
      pileOuFace = CoinState.HEADS;
    } else {
      pileOuFace = CoinState.TAILS;
    }
  }

  private Coin() {

  }

  public static Coin getInstance() {
    return coinState;
  }


  public CoinState getState() {

    return pileOuFace;
  }


}
