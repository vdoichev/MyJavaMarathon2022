package Main.day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] pieces = new ChessPiece[8];
        for (int i = 0; i < pieces.length; i++) {
            pieces[i] = (i < 4) ? ChessPiece.PAWN_BLACK : ChessPiece.ROOK_WHITE;
        }
        for (ChessPiece piece : pieces) {
            System.out.print(piece.getDescription() + " ");
        }
    }
}
