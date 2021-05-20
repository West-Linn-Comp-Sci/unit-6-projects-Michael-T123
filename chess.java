
/**
 * Write a description of class chess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class chess
{
     public static void main(String[] args)
    {
        String[][] chessBoard = {{"Rook", " ", "Knight", " ", "Bishop", " ", "King", " ", "Queen", " ", "Bishop", " ", "Knight", " ", "Rook"},
                                 {"Pawn", " ", "Pawn", " ", "  Pawn", " ", "  Pawn", " ", "Pawn", " ", " Pawn", " ", "  Pawn", " ", "  Pawn"},
                                 {"  -  ", " ", " -  ", " ", "  -  ", " ", "   -  ", " ", " -  ", " ", "  -  ", " ", "   -  ", " ", "   -", },
                                 {"  -  ", " ", " -  ", " ", "  -  ", " ", "   -  ", " ", " -  ", " ", "  -  ", " ", "   -  ", " ", "   -", },
                                 {"  -  ", " ", " -  ", " ", "  -  ", " ", "   -  ", " ", " -  ", " ", "  -  ", " ", "   -  ", " ", "   -", },
                                 {"  -  ", " ", " -  ", " ", "  -  ", " ", "   -  ", " ", " -  ", " ", "  -  ", " ", "   -  ", " ", "   -", },
                                 {"Pawn", " ", "Pawn", " ", "  Pawn", " ", "  Pawn", " ", "Pawn", " ", " Pawn", " ", "  Pawn", " ", "  Pawn"},
                                 {"Rook", " ", "Knight", " ", "Bishop", " ", "King", " ", "Queen", " ", "Bishop", " ", "Knight", " ", "Rook"},
                                };
        for (int row = 0; row < 8; row++){
            for (int column = 0; column < 15; column++){
                System.out.print(chessBoard[row][column]);
       
             }
           System.out.println();
          }
        }
    }