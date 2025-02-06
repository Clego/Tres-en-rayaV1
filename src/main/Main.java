package main;

import input.Input;
import output.Output;
import rules.Rules;
import java.util.Random;
import static input.Input.askContinue;
import static validador.Validator.validateColumn;
import static validador.Validator.validateRow;
import validador.Validator;

public class Main {
    final static char[][] gameBoard = new char[3][3];
    static boolean userWantsToPlay = true;
    static boolean userTurn = true;
    static boolean winCondition = false;
    static boolean drawCondition = false;

    public static void main(String[] args) {
        Rules.resetGameBoard(gameBoard);
        Output.showGameBoard(gameBoard);

        while (userWantsToPlay) {

            playTicTacToe();
            playAgain();
        }
    }

    private static void playTicTacToe() {
        while (!winCondition && !drawCondition) {
            if (userTurn) {
                Output.userTurn();
                userTurn();
                Output.showGameBoard(gameBoard);
                winCondition = Rules.winConditionUser(gameBoard);
                if (winCondition) {
                    Output.win();
                }
                userTurn = false;
            } else {
                Output.npcTurn();
                npcTurn();
                Output.showGameBoard(gameBoard);
                winCondition = Rules.winConditionNPC(gameBoard);
                if (winCondition) {
                    Output.loser();
                }
                userTurn = true;
            }
            if (!winCondition) {
                drawCondition = Rules.isDraw(gameBoard);
                if (drawCondition) {
                    Output.draw();
                }
            }
        }
    }

    private static void playAgain() {
        Output.playAgain();
        String wantToPlay = askContinue();

        if (wantToPlay.equalsIgnoreCase("si")) {
            Rules.resetGameBoard(gameBoard);
            winCondition = false;
            drawCondition = false;
            userTurn = true;
            Output.showGameBoard(gameBoard);
        } else {
            userWantsToPlay = false;
            Output.bye();
            System.exit(0);
        }
    }

    public static void userTurn() {
        int row;
        int column;
        boolean rowIsValid;
        boolean columnIsValid;

        do {
            Output.row();
            row = Input.getUserInput();
            rowIsValid = validateRow(row);
            if (!rowIsValid) {
                Output.validate();
            }
        } while (!rowIsValid);

        do {
            Output.column();
            column = Input.getUserInput();
            columnIsValid = validateColumn(column);
            if (!columnIsValid) {
                Output.validate();
            } else if (!Validator.isCellEmpty(gameBoard, row - 1, column - 1)) {
                Output.ocupada();
                columnIsValid = false;
            }
        } while (!columnIsValid);

        gameBoard[row - 1][column - 1] = 'X';
    }

    public static void npcTurn() {
        Random random = new Random();
        int row;
        int column;
        do {
            row = random.nextInt(3);
            column = random.nextInt(3);
        } while (!Validator.isCellEmpty(gameBoard, row, column));
        gameBoard[row][column] = 'O';
    }


}