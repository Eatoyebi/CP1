import java.util.Scanner;

public class SafeInput {
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean gotAValue = false;
        do
        {
// show the prompt
            System.out.print(prompt + ": ");
// input the data
            value = pipe.nextLine();
// test to see if it is correct
            if(value.matches(regExPattern))
            {
// We have a match this String passes!
                gotAValue = true;
            }
            else
            {
                System.out.println("\nInvalid input: " + value);
            }
        }while(!gotAValue);
        return value;
    }
}


