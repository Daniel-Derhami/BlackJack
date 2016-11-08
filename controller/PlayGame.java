package black_jack.controller;

import black_jack.view.IView;
import black_jack.model.Game;
import black_jack.view.Observer;

public class PlayGame extends Observer {

    private Game a_game;
    private IView a_view;

    public PlayGame(Game a_game, IView a_view) {
        this.a_game = a_game;
        this.a_view = a_view;
        this.a_game.attach(this);
        a_view.DisplayWelcomeMessage();

        a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
        a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());
    }

    public boolean Play() {

        int input = a_view.GetInput();
        if (input == 'p') {
            a_game.NewGame();
        } else if (input == 'h') {
            a_game.Hit();
        } else if (input == 's') {
            a_game.Stand();
        }

        return input != 'q';
    }

    @Override
    public void update() {
        try {
            Thread.sleep(5000);
            a_view.DisplayWelcomeMessage();

            a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
            a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());

            if (a_game.IsGameOver()) {
                a_view.DisplayGameOver(a_game.IsDealerWinner());
            }

        } catch (Exception ex) {
        }
    }
}