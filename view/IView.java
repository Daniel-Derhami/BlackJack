package black_jack.view;

public interface IView
{
  void DisplayWelcomeMessage();
  int GetInput();
  void DisplayCard(BlackJack.model.Card a_card);
  void DisplayPlayerHand(Iterable<black_jack.model.Card> a_hand, int a_score);
  void DisplayDealerHand(Iterable<black_jack.model.Card> a_hand, int a_score);
  void DisplayGameOver(boolean a_dealerIsWinner);
}