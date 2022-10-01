import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {



    public static void inicio() throws FileNotFoundException, InterruptedException {
        printMenu();
        int option = inputPlayer();
        actions(option);
    }
    public static void printMenu() throws InterruptedException {


        System.out.println((char)27 + "[40m" + "  ___  ___ | | __| (_) ___ _ __ ___ \n" +
                " / __|/ _ \\| |/ _` | |/ _ \\ '__/ __|\n" +
                " \\__ \\ (_) | | (_| | |  __/ |  \\__ \\\n" +
                " |___/\\___/|_|\\__,_|_|\\___|_|  |___/\n\n" + (char)27 + "[0m");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Welcome to SOLDIERS, Commander! \n");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.print(   "Your adventure starts HERE.");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println(" First of all: \n");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("- What's your name?");
        Scanner scannerName = new Scanner((System.in));
        String player1 = scannerName.nextLine();
        System.out.print("\nAHA! Good one! ");
        TimeUnit.MILLISECONDS.sleep(1500);
        System.out.println((char)27 + "[33m" + player1.toUpperCase() + (char)27 + "[0m" +
                " is a name of BRAVE ancestors. \n");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("We need YOU to COMMAND our forces.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("A great war is coming.");
        TimeUnit.MILLISECONDS.sleep(1500);
        System.out.println("COME ON " + (char)27 + "[33m" +
                player1.toUpperCase() + (char)27 + "[0m" +"!! Go and prepare your TEAM for the BATTLE!\n");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("    /\n" +
                "O===[====================-\n" +
                "    \\ \n");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println((char)27 + "[40m" + "Insert 1 to start the fight! I'm gonna choose your team:");// devuelve un muerto
        System.out.println("Insert 2 if you want to create your team importing a CSV:");
        System.out.println("Insert 0 to quit the adventure:\n"+ (char)27 + "[0m");
    }
    public static int inputPlayer() throws InterruptedException {
        Scanner inputScaner = new Scanner(System.in);
        int choice = -1;
        try {
            choice = Integer.parseInt(inputScaner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Not a valid option. Try again:");
            System.out.println((char)27 + "[40m" + "Insert 1 to start the fight! I'm gonna choose your team:");// devuelve un muerto
            System.out.println("Insert 2 if you want to create your team importing a CSV:");
            System.out.println("Insert 0 to quit the adventure:\n"+ (char)27 + "[0m");
            inputPlayer();
        }
        while(choice < 0 || choice > 2){
            System.err.println("Not a valid option. Try again:");
            System.out.println((char)27 + "[40m" + "Insert 1 to start the fight! I'm gonna choose your team:");// devuelve un muerto
            System.out.println("Insert 2 if you want to create your team importing a CSV:");
            System.out.println("Insert 0 to quit the adventure:\n"+ (char)27 + "[0m");
            choice = Integer.parseInt(inputScaner.nextLine());
        }return choice;
    }
    public static void actions(int opc) throws FileNotFoundException, InterruptedException {
        ArrayList<Player> teamA;
        ArrayList<Player> teamB;
        Battle battle = new Battle();
        switch(opc){
            case 0:
                System.out.println((char)27 + "[40m" + "                                                |>>>\n" +
                        "                                                |\n" +
                        "                                            _  _|_  _\n" +
                        "                                           |;|_|;|_|;|\n" +
                        "                                           \\\\.    .  /\n" +
                        "                                            \\\\:  .  /\n" +
                        "                                             ||:   |\n" +
                        "                                             ||:.  |\n" +
                        "                                             ||:  .|\n" +
                        "                                             ||:   |       \\,/\n" +
                        "                                             ||: , |            /`\\\n" +
                        "                                             ||:   |\n" +
                        "                                             ||: . |\n" +
                        "              __                            _||_   |\n" +
                        "     ____--`~    '--~~__            __ ----~    ~`---,              ___\n" +
                        "-~--~                   ~---__ ,--~'                  ~~----_____-~'   `~----~~\n" +
                        (char)27 + "[0m");
                System.out.println((char)27 + "[35m" + "THANK YOU FOR PLAYING.     WE GONNA MISS YOU!!! <3" +
                        "            THE END." + (char)27 + "[0m");
                break;
            case 1:
                teamA = TeamBuilder.createTeam();
                teamB = TeamBuilder.createTeam();
                battle.fightRandom(teamA, teamB);
                end();
                break;
            case 2:
                teamA = TeamBuilder.importTeamCSV();
                teamB = TeamBuilder.createTeam();
                battle.fightRandom(teamA, teamB);
                end();
                break;
            default:
                break;
        }
    }


    public static void end() throws FileNotFoundException, InterruptedException {
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("\n" + (char)27 + "[40m" + "     Not tired?\nDo you want to play again?");
        System.out.println("<---------------------------------------->");
        System.out.println("- Insert 0 to quit the game. (coward)");
        System.out.println("\n- Insert 1 to play another battle!\n" + (char)27 + "[0m");
        Scanner inputScaner = new Scanner(System.in);
        int choice = -1;
        try{
            choice = Integer.parseInt(inputScaner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Not a valid option. Try again:");
            end();
        }

        while(choice < 0 || choice > 1){
            System.err.println("Not a valid option. Try again:");
            end();
        }

        if (choice == 0) {
            System.out.println((char)27 + "[40m" + "                                                |>>>\n" +
                    "                                                |\n" +
                    "                                            _  _|_  _\n" +
                    "                                           |;|_|;|_|;|\n" +
                    "                                           \\\\.    .  /\n" +
                    "                                            \\\\:  .  /\n" +
                    "                                             ||:   |\n" +
                    "                                             ||:.  |\n" +
                    "                                             ||:  .|\n" +
                    "                                             ||:   |       \\,/\n" +
                    "                                             ||: , |            /`\\\n" +
                    "                                             ||:   |\n" +
                    "                                             ||: . |\n" +
                    "              __                            _||_   |\n" +
                    "     ____--`~    '--~~__            __ ----~    ~`---,              ___\n" +
                    "-~--~                   ~---__ ,--~'                  ~~----_____-~'   `~----~~\n" +
                    (char)27 + "[0m");
            System.out.println((char)27 + "[35m" + "THANK YOU FOR PLAYING.     WE GONNA MISS YOU!!! <3" +
                    "            THE END." + (char)27 + "[0m");
        } else if (choice == 1) {
            System.out.println("\nInsert 1 to start the fight! I'm gonna choose your team:");
            System.out.println("Insert 2 if you want to create your team importing a CSV:");
            System.out.println("Insert 0 to quit the adventure:");
            inputPlayer();
        }

    }

}
