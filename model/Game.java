package black_jack.model;

import black_jack.view.Observer;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private Dealer m_dealer;
    private Player m_player;
   private Boolean isDealer = false;
    private List<Observer> observers = new ArrayList<>();

    public Game() {
        m_dealer = new Dealer(new black_jack.model.rules.RulesFactory());
        m_player = new Player();
    }

    public boolean IsGameOver() {
        if(isDealer) {
            return true;
        }
        boolean ret = m_dealer.IsGameOver(m_player);
        //notifyAllObservers();
        return ret;
    }

    public boolean IsDealerWinner() {
        return m_dealer.IsDealerWinner(m_player);
    }

    public boolean NewGame() {
        boolean ret = m_dealer.NewGame(m_player);
        isDealer = false;
        notifyAllObservers();
        return ret;
    }

    public boolean Hit() {
        boolean ret = m_dealer.Hit(m_player);
        isDealer = false;
        notifyAllObservers(); 
        return ret;
    }

    public boolean Stand() {
        // TODO: Implement this according to Game_Stand.sequencediagram

        boolean ret = m_dealer.Stand();
        isDealer = true;
        notifyAllObservers();
        return ret;
    }

    public Iterable<Card> GetDealerHand() {
        return m_dealer.GetHand();
    }

    public Iterable<Card> GetPlayerHand() {
        return m_player.GetHand();
    }

    public int GetDealerScore() {
        return m_dealer.CalcScore();
    }

    public int GetPlayerScore() {
        return m_player.CalcScore();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}