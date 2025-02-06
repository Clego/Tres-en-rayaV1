package validador;

public class Validator {

    public static boolean validateRow(int fila) {
        return fila >= 1 && fila <= 3;
    }

    public static boolean validateColumn(int column) {
        return column >= 1 && column <= 3;
    }

    public static boolean isCellEmpty(char[][] board, int row, int column) {
        if (row < 0 || row >= board.length || column < 0 || column >= board[row].length) {
            return false;
        }
        return board[row][column] == '-';
    }
}