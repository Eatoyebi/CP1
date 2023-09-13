public class Lab_05_02_BirthMonth {
    public static void main(String[] args) {
        //Declarations
         int birthMonth;
        System.out.println("What is your birth month?");
        birthMonth = 1000;
        if (birthMonth <= 12 && birthMonth >= 1)
        {
            System.out.println("Your birth month is " + birthMonth);
        }
        else {
            System.out.println("Your input is out of range");
        }
    }
}
