package black_jack.view;

public class SimpleView implements IView {

    @Override
    public void DisplayWelcomeMessage() {
        for (int i = 0; i < 50; i++) {
            System.out.print("\n");
        };
        System.out.println("Hello Black Jack World");
        System.out.println("Type 'p' to Play, 'h' to Hit, 's' to Stand or 'q' to Quit\n");
    }

    @Override
     public int GetInput() {
        try {
            return System.in.read();
        } catch (java.io.IOException e) {
            System.out.println("" + e);
            return 0;
        }
    }

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