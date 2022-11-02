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

        for (int i = 0; i < SingleDeck.getCount(); i++) {
            this.ships.add(new SingleDeck());
        }
        for (int i = 0; i < DoubleDeck.getCount(); i++) {
            this.ships.add(new DoubleDeck());
        }
        for (int i = 0; i < ThreeDeck.getCount(); i++) {
            this.ships.add(new ThreeDeck());
        }
        for (int i = 0; i < FourDeck.getCount(); i++) {
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

    public void refreshOwnMarineBoard() {

        for (int i = 0; i < this.ships.toArray().length; i++) {
            if (!this.ships.get(i).isEmptyShip()) {
                for (int j = 0; j < this.ships.get(i).getSize(); j++) {
                    int x = this.ships.get(i).shipCell[j].getX();
                    int y = this.ships.get(i).shipCell[j].getY();
                    this.ownBoard.cells[x][y] = this.ships.get(i).shipCell[j];
                }
            }
        }
    }
}
