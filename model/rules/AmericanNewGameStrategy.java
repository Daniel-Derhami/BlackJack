package black_jack.model.rules;

import black_jack.model.*;

class AmericanNewGameStrategy implements INewGameStrategy {

    @Override
    public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
        Card c;

        a_deck.DealCard(true, a_player);
        a_deck.DealCard(true, a_dealer);
        a_deck.DealCard(true, a_player);
        a_deck.DealCard(true, a_dealer);
       
        return true;
    }
}