package Main.day17;
/*
1. Создайте Enum “Шахматная фигура” (англ. ChessPiece).
Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ. queen), ладья (англ. rook),
 слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn). В нашей программе, у каждой шахматной
 фигуры есть следующие характеристики:
● Ценность фигуры - вещественное число
● Строковое обозначение фигуры
В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных. Названия фигур в перечислении
должны иметь следующий вид:
KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее
У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое обозначение.
 */

public enum ChessPiece {
    KING_WHITE(100.0, "\u2654"),
    QUEEN_WHITE(9, "\u2655"),
    ROOK_WHITE(5, "\u2656"),
    BISHOP_WHITE(3.5, "\u2657"),
    KNIGHT_WHITE(3, "\u2658"),
    PAWN_WHITE(1, "\u2659"),
    KING_BLACK(100.0, "\u265A"),
    QUEEN_BLACK(9, "\u265B"),
    ROOK_BLACK(5, "\u265C"),
    BISHOP_BLACK(3.5, "\u265D"),
    KNIGHT_BLACK(3, "\u265E"),
    PAWN_BLACK(1, "\u265F"),
    EMPTY(-1, "_");

    private final double value;
    private final String description;

    ChessPiece(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
