package black_jack.controller;

import black_jack.view.IView;
import black_jack.model.Game;
import black_jack.view.Observer;

public class PlayGame extends Observer {

    private Game a_game;
    private IView a_view;

    public PlayGame(Game a_game, IView a_view) {}

    public boolean Play() {}

    @Override
    public void update() {}
}