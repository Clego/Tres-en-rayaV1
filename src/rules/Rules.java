package rules;

public class Rules {

    public static boolean winConditionUser(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][0] == 'X' && gameBoard[i][1] == 'X' && gameBoard[i][2] == 'X') {
                return true;
            }
            if (gameBoard[0][i] == 'X' && gameBoard[1][i] == 'X' && gameBoard[2][i] == 'X') {
                return true;
            }
        }
        if (gameBoard[0][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][2] == 'X') {
            return true;
        }
        if (gameBoard[0][2] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][0] == 'X') {
            return true;
        }
        return false;
    }

    public static boolean winConditionNPC(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][0] == 'O' && gameBoard[i][1] == 'O' && gameBoard[i][2] == 'O') {
                return true;
            }
            if (gameBoard[0][i] == 'O' && gameBoard[1][i] == 'O' && gameBoard[2][i] == 'O') {
                return true;
            }
        }
        if (gameBoard[0][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][2] == 'O') {
            return true;
        }
        if (gameBoard[0][2] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][0] == 'O') {
            return true;
        }
        return false;
    }

    public static boolean isDraw(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    public static void resetGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = '-';
            }
        }
    }
}