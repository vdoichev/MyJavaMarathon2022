package Main.MarineBattle.Ships;

public class SingleDeck extends Ship {
    public SingleDeck() {
        super(1);
    }
    public static int getCount() {
        return 4;
    }

    @Override
    public String getSizeStr() {
        return "однопалубного";
    }

    @Override
    public String getFormat() {
        return "x,y";
    }
}
