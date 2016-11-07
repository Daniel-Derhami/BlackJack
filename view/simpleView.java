package black_jack.view;

public class SimpleView implements IView {

    @Override
    public void DisplayWelcomeMessage() {}

    @Override
    public int GetInput() {}

    @Override
    public void DisplayCard(BlackJack.model.Card a_card) {}

    @Override
    public void DisplayPlayerHand(Iterable<BlackJack.model.Card> a_hand, int a_score) {}

    @Override
    public void DisplayDealerHand(Iterable<BlackJack.model.Card> a_hand, int a_score) {}

    private void DisplayHand(String a_name, Iterable<BlackJack.model.Card> a_hand, int a_score) {}

    @Override
    public void DisplayGameOver(boolean a_dealerIsWinner) {}

    
}