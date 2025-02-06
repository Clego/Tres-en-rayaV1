package output;

public class Output {

    public static void showGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static void row() {
        System.out.println("Introduce el numero de la fila : ");
    }

    public static void column() {
        System.out.println("Introduce el numero de la columna : ");
    }

    public static void validate() {
        System.out.println("Introduce un numero valido : ");
    }

    public static void ocupada() {
        System.out.println("Casilla ocupada, elige otra ");
    }

    public static void userTurn() {
        System.out.println("Tu turno ");
    }

    public static void npcTurn() {
        System.out.println("La máquina elige ");
    }

    public static void win() {
        System.out.println("Has ganado!! Felicidades!!");
    }

    public static void loser() {
        System.out.println("Has perdido :(");
    }

    public static void playAgain() {
        System.out.println("¿Quieres volver a jugar? escriba si o no");
    }

    public static void bye() {
        System.out.println("Gracias por jugar!!! hasta la proxima :)");
    }

    public static void draw() {
        System.out.println("Empate");
    }
}
