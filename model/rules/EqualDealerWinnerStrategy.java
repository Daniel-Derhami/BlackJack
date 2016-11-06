package black_jack.model.rules;

import black_jack.model.Dealer;
import black_jack.model.Player;

public class EqualDealerWinnerStrategy implements IWinStrategy{

    @Override
    public boolean isDealerWinner(Dealer a_dealer, Player a_player,int g_maxScore) {
        if (a_player.CalcScore() > g_maxScore) {
            return true;
        } else if (a_dealer.CalcScore() > g_maxScore) {
            return false;
        }
        return a_dealer.CalcScore() >= a_player.CalcScore();
    }
    
}
