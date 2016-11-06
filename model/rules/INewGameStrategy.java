package black_jack.model.rules;

import black_jack.model.Deck;
import black_jack.model.Dealer;
import black_jack.model.Player;

public interface INewGameStrategy {
    boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player);
}