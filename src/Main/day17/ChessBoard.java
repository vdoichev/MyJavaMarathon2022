package Main.day17;

public class ChessBoard {
    private final ChessPiece[][] pieces;

    ChessBoard(ChessPiece[][] pieces) {
        this.pieces = pieces;
    }

    public void print() {
        for (ChessPiece[] pieceOuter : pieces) {
            for (ChessPiece piece : pieceOuter) {
                System.out.print(piece.getDescription());
            }
            System.out.println();
        }
    }
}
