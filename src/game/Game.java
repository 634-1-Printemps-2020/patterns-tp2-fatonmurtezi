package game;

import materials.Coin;
import materials.CoinState;
import player.Player;
import utils.Statistics;

import javax.swing.*;
import java.util.*;

public class Game {

    private Rules rules;
    private Coin coin;
    private Map<Player, List<CoinState>> history;
    private Map<Player, List<CoinState>> listPrevious;


    public Game() {
        history = new HashMap<>();
    }

    /**
     * Ajouter un nouveau joueur au jeu
     *
     * @param player le nouveau joueur
     */
    public void addPlayer(Player player) {
      // TODO: Votre code ici
        List<CoinState> list = new ArrayList<>();
        history.put(player,list);
    }

    /**
     * Faire joueur tous les joueurs et stocker chaque partie dans history
     */
    public void play() {
        for (Map.Entry<Player,List<CoinState>> listJoueurs : history.entrySet()){

            coin = Coin.getInstance();
            listJoueurs.getKey().play(coin);
            List<CoinState> list = new ArrayList<>();
            list.add(coin.getState());

            history.put(listJoueurs.getKey(),list);
            rules = new Rules();
            while (!rules.checkWin(list)){

                listJoueurs.getKey().play(coin);
                list = listJoueurs.getValue();
                list.add(coin.getState());
                history.put(listJoueurs.getKey(),list);
            }


        }
      // TODO: Votre code ici
    }

    /**
     * Calculer des statistiques de la partie précédente
     *
     * @return Statistics
     */
    public Statistics getStatistics() {
      // TODO: Votre code ici
      return null;
    }

    /**
     * Obtenir l'historique de tous les joueurs de la partie précédente
     *
     * @return Map contenant chaque joueur et la liste des ses lancers
     */
    public Map<Player, List<CoinState>> getHistory() {
      // TODO: Votre code ici
        

        listPrevious = history;
      return listPrevious;
    }


    /**
     * Obtenir l'historique d'un joueur spécifique
     *
     * @param player instance du joueur pour lequel on veut avoir l'historique
     * @return la liste des lancers d'un joueur
     */
    public List<CoinState> getSpecificHistory(Player player) {
      // TODO: Votre code ici
      return null;
    }

}
