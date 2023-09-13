public class Lab_05_03_PartyAffiliation {
    public static void main(String[] args) {
        System.out.println("What party are you affiliated with?");
       String affl = "O";
       if ( affl.equals ("D"))
       {
           System.out.println("You get a Democratic Donkey");
       } else if (affl.equals ("R")) {
           System.out.println("You get a Republican Elephant");
       }

       else if (affl.equals ("I"))
       {
           System.out.println("You get a Independant Man");
       }
       else {
           System.out.println("You get an Other");
       }
    }
}
