package black_jack.model.rules;

import black_jack.model.Player;

class BasicHitStrategy implements IHitStrategy {
    private final int g_hitLimit = 21;
   
    @Override
    public boolean DoHit(Player a_player) {
        int score = a_player.CalcScore();
        if(score < g_hitLimit) {
            return true;
        } else {
            return false;
        }
    }
}