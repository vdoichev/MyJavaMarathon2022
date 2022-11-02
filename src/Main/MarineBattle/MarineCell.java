package Main.MarineBattle;

public class MarineCell {
    private final Cell cell;
    private final int x;
    private final int y;

    public MarineCell(Cell cell, int x, int y) {
        this.cell = cell;
        this.x = x;
        this.y = y;
    }

    public Cell getCell() {
        return cell;
    }
}
