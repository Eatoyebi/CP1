import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Player A select your character?");
        String playerA;
        playerA = in.next();

        System.out.println("Player B select your character?");
        String playerB;
        playerB = in.next();

        if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P"))
        {
            System.out.println("Rock v Paper...Player B wins!");
        }
        else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("R"))
        {
            System.out.println("Rock v Rock...It's a tie!");
        }
        else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S"))
        {
            System.out.println("Rock v Scissors...Player A wins!");
        }
        else if (playerA.equalsIgnoreCase("P")&& playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper v Paper...It's a tie!");
            }
        else if (playerA.equalsIgnoreCase("P")&& playerB.equalsIgnoreCase("R"))
        {
            System.out.println("Paper v Rock...Player A wins!");
        }
        else if (playerA.equalsIgnoreCase("P")&& playerB.equalsIgnoreCase("S"))
        {
            System.out.println("Paper v Scissors...Player B wins!");
        }

        else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))
        {
                System.out.println("Scissors v Paper...Player A wins!");
            }
        else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R"))
        {
            System.out.println("Scissors v Rock...Player B wins!");
        }
        else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("S"))
        {
            System.out.println("Scissors v Scissors...It's a tie!");
    } else {
                System.exit(0);
            }
        }

    }
