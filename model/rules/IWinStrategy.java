
package black_jack.model.rules;

import black_jack.model.Dealer;
import black_jack.model.Player;

public interface IWinStrategy {
    boolean isDealerWinner(Dealer a_dealer, Player a_player, int g_maxScore);
}
