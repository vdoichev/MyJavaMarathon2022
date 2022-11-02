package Main.MarineBattle;

import Main.MarineBattle.Ships.*;

import java.util.ArrayList;

public class Player {
    private final String name;
    private final MarineBoard ownBoard;
    private final MarineBoard opponentBoard;
    public ArrayList<Ship> ships = new ArrayList<>();

    public Player(String name) {

        this.name = name;
        this.ownBoard = new MarineBoard();
        this.opponentBoard = new MarineBoard();
        for (int i = 0; i<SingleDeck.getCount(); i++){
            this.ships.add(new SingleDeck());
        }
        for (int i = 0; i< DoubleDeck.getCount(); i++){
            this.ships.add(new DoubleDeck());
        }
        for (int i = 0; i< ThreeDeck.getCount(); i++){
            this.ships.add(new ThreeDeck());
        }
        for (int i = 0; i< FourDeck.getCount(); i++){
            this.ships.add(new FourDeck());
        }
    }

    public String getName() {
        return name;
    }

    public MarineBoard getOwnBoard() {
        return ownBoard;
    }

    public MarineBoard getOpponentBoard() {
        return opponentBoard;
    }
}
