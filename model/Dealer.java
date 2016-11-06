package black_jack.model;

import black_jack.model.rules.*;

public class Dealer extends Player {

    private Deck m_deck;
    private INewGameStrategy m_newGameRule;
    private IHitStrategy m_hitPlayerRule;
    private IHitStrategy m_hitDelaerRule;
    private IWinStrategy m_winRule;
    

    public Dealer(RulesFactory a_rulesFactory) {

        m_newGameRule = a_rulesFactory.GetNewGameRule();
        m_hitPlayerRule = a_rulesFactory.GetPlayerHitRule();
        m_hitDelaerRule = a_rulesFactory.GetDealerHitRule();
        m_winRule = a_rulesFactory.GetWinGameRule();

        /*for(Card c : m_deck.GetCards()) {
         c.Show(true);
         System.out.println("" + c.GetValue() + " of " + c.GetColor());
         }    */
    }

    public boolean NewGame(Player a_player) {
        if (m_deck == null || IsGameOver(a_player)) {
            m_deck = new Deck();
            ClearHand();
            a_player.ClearHand();
            return m_newGameRule.NewGame(m_deck, this, a_player);
        }
        return false;
    }

    public boolean Hit(Player a_player) {
        if (m_deck != null && a_player.CalcScore() < g_maxScore && !IsGameOver(a_player)) {
            m_deck.DealCard(true, a_player);
            return true;
        }
        return false;
    }

    public boolean IsDealerWinner(Player a_player) {
        return m_winRule.isDealerWinner(this, a_player, g_maxScore);
    }

    public boolean IsGameOver(Player a_player) {
        if (m_deck != null && m_hitPlayerRule.DoHit(a_player) != true) {
            return true;
        }
        return false;
    }

    public boolean Stand() {
        if(m_deck != null) {
            ShowHand();
            for(Card card : GetHand()) {
                card.Show(true);
            }
            while(true) {
                Card c = m_deck.GetCard(true);
                nextCard  = c;
                if(m_hitDelaerRule.DoHit(this)) {
                     this.DealCard(nextCard);
                } else {
                    nextCard = null;
                    break;
                }
            }
            return true;
        }
        return false;
    }
}