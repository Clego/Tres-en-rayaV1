package input;

import java.util.Scanner;

public class Input {

public static int getUserInput() {
    Scanner sc = new Scanner(System.in);
    return  sc.nextInt();
}
public static String askContinue() {
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();
    }

}
