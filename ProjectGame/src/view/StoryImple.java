package view;

import controller.Battle;
import controller.GameOver;

public class StoryImple implements Story{
    @Override
    public void battle() {
//        Battle.battle();
    }

    @Override
    public void stage() {

    }

    @Override
    public void endGame() {
        GameOver.gameOver();
    }
}
