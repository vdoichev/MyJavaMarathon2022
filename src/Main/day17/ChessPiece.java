package Main.day17;

public enum ChessPiece {
    KING_BLACK(100.0,"\u2654"),
    QUEEN_BLACK(9,"\u2655"),
    ROOK_BLACK(5,"\u2656"),
    BISHOP_BLACK(3.5,"\u2657"),
    KNIGHT_BLACK(3,"\u2658"),
    PAWN_BLACK(1,"\u2659"),

    KING_WHITE(100.0,"\u265A"),
    QUEEN_WHITE(9,"\u265B"),
    ROOK_WHITE(5,"\u265C"),
    BISHOP_WHITE(3.5,"\u265D"),
    KNIGHT_WHITE(3,"\u265E"),
    PAWN_WHITE(1,"\u265F")
    ;

    private double value;
    private String description;

    ChessPiece(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
