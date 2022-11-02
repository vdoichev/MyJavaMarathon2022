package Main.MarineBattle.Ships;

import Main.MarineBattle.Cell;
import Main.MarineBattle.MarineCell;

public abstract class Ship {
    private final int size;
    private final MarineCell[] shipCell;
    public Ship(int size) {
        this.size = size;
        this.shipCell = new MarineCell[this.size];
    }

    public void addCell(int i, int x, int y) {
        shipCell[i] = new MarineCell(Cell.WHOLE_SHIP, x, y);
    }

    public int getSize() {
        return size;
    }
    public abstract String getSizeStr();
    public abstract String getFormat();
}
