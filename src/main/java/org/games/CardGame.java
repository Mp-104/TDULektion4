package org.games;

import org.controller.GameController;
import org.model.Deck;
import org.view.View;

public class CardGame {

    public static void main (String [] args) {
        GameController gc = new GameController(new View(), new Deck());

        gc.run();
    }
}
