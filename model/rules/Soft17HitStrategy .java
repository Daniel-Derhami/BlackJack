package black_jack.model.rules;

import black_jack.model.Card;

import black_jack.model.Player;

public class Soft17HitStrategy implements IHitStrategy {

    private final int g_hitLimit = 17;

    @Override
    public boolean DoHit(Player a_dealer) {
        
        Card c = a_dealer.nextCard;
        
        if ((a_dealer.CalcScore() + c.GetValue().ordinal()) < g_hitLimit) {
            return true;
        } else {
            if (c.GetValue().ordinal() == 10) {
                boolean flag = false;
                for (Card card : a_dealer.GetHand()) {
                    if (card.GetValue() == Card.Value.Ace) {
                        flag = true;
                        break;
                    }
                }
                if (flag && a_dealer.CalcScore() == g_hitLimit) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
