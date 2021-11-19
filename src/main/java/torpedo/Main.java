package torpedo;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        Scanner input = new Scanner(System.in);

        String player1 ="";
        String player2 ="";
        int torpedo;

        System.out.print("#1: Adja meg az első játékos nevét: ");
        player1 = input.nextLine();

        System.out.print("#2: Adja meg a második játékos nevét: ");
        player2 = input.nextLine();

        System.out.println("Játékosok beolvasva! Üdv " + player1 + " és tomi" +  player2 + ".");
        input.close();
    }
}
