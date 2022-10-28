package Main.day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[] pieces1 =
                new ChessPiece[]{
                        ChessPiece.ROOK_BLACK,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.ROOK_BLACK,
                        ChessPiece.KING_BLACK,
                        ChessPiece.EMPTY
                };
        ChessPiece[] pieces2 =
                new ChessPiece[]{
                        ChessPiece.EMPTY,
                        ChessPiece.ROOK_WHITE,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.PAWN_BLACK,
                        ChessPiece.PAWN_BLACK,
                        ChessPiece.EMPTY,
                        ChessPiece.PAWN_BLACK
                };
        ChessPiece[] pieces3 =
                new ChessPiece[]{
                        ChessPiece.PAWN_BLACK,
                        ChessPiece.EMPTY,
                        ChessPiece.KNIGHT_BLACK,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.PAWN_BLACK,
                        ChessPiece.EMPTY
                };
        ChessPiece[] pieces4 =
                new ChessPiece[]{
                        ChessPiece.QUEEN_BLACK,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.BISHOP_WHITE,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY
                };
        ChessPiece[] pieces5 =
                new ChessPiece[]{
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.BISHOP_BLACK,
                        ChessPiece.PAWN_WHITE,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY
                };
        ChessPiece[] pieces6 =
                new ChessPiece[]{
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.BISHOP_WHITE,
                        ChessPiece.PAWN_WHITE,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY
                };
        ChessPiece[] pieces7 =
                new ChessPiece[]{
                        ChessPiece.PAWN_WHITE,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.QUEEN_WHITE,
                        ChessPiece.EMPTY,
                        ChessPiece.PAWN_WHITE,
                        ChessPiece.EMPTY,
                        ChessPiece.PAWN_WHITE
                };
        ChessPiece[] pieces8 =
                new ChessPiece[]{
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.EMPTY,
                        ChessPiece.ROOK_WHITE,
                        ChessPiece.KING_WHITE,
                        ChessPiece.EMPTY
                };
        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{pieces1, pieces2, pieces3, pieces4,
                pieces5, pieces6, pieces7, pieces8});
        chessBoard.print();
    }
}
