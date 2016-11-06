package black_jack.model.rules;

import black_jack.model.Player;

public interface IHitStrategy {
    boolean DoHit(Player a_dealer);
}