import java.util.Scanner;

public class GreetingPage
{
    public static void main(String[] args) 
    {
        Scanner infoScanner = new Scanner(System.in);
        System.out.println("Hello and welcome to the program. Before we start, lets collect some data about you.");

        System.out.println("What is your first name?");
        String forename = infoScanner.nextLine();

        System.out.println("What is your surname");
        String surname = infoScanner.nextLine();

        System.out.println("Where do you work?");
        String workPlace = infoScanner.nextLine();

        System.out.println("How many years have you worked for " +workPlace + "?");
        int employmentDuration = infoScanner.nextInt();
        infoScanner.nextLine();

        System.out.println("Ok, all information has been gathered");
        System.out.println("Welcome to the programme " +forename+ " " +surname + ". Congratulations on working for " +workPlace +" for " +employmentDuration + " years.\n" + "Now lets begin...");

        System.out.println("In this programme you have 4 choices: \n" + "Option 1: See your full name \n" + "Option 2: Remember where you work \n" + "Option 3: See how many years you have left until retirement \n" +"Option 4: Hear some personalised words of encouragement\n" +"Please select (1-4)");
        int option = infoScanner.nextInt();

        while (!(option>=1 && option <=4))
        {
            System.out.println("Enter a valid option");
            option = infoScanner.nextInt();
        }

        switch (option)
        {
            case 1: 
                System.out.println("Forgot your name " + (forename) + "? You picked option " + (option) + ".\n" +"Your full name is " +(forename) + " " +(surname) + "\n" + "The programme will exit now. Goodbye!" );
                break;

            case 2:
                System.out.println("You need a little refresher of where you work " + (forename) + "? You picked option " + (option) + ".\n" +"You work at " +(workPlace) +"\n" + "The programme will exit now. Goodbye!");
                break;
            case 3:
                System.out.println("Great job " + (forename) + " you picked option " + (option) + "\n" +"Most people work for 35 years, so you have " +(35-employmentDuration) + " to go. \n" + "The programme will exit now. Goodbye!");
                break;
            case 4:
                System.out.println("You need a few words of encouragement " + (forename) + " you picked option " + (option));
                if (employmentDuration < 2)
                {
                    System.out.println("You have just started your career at " + (workPlace) + ".\n" + "Things may seem uncertain and you may not be fully acclimatised to your workplace yet. \n" +  "You may even be new to the world of work " +(forename) +". \n" + "But remember you are here for a reason and you have plenty of time to learn and grow so have an open mind and embrace every opportunity. \n" + "You got this!");

                }
                else if (employmentDuration <5)
                {
                    System.out.println("Even though you have been at " + (workPlace) + " for some time, you are still developing and learning. \n" + "Take a moment to appreciate all of the amazing opportunities you have had " +(forename) + ", and how far you have already come. \n" +  "Its onwards and upwards from here!");

                }
                else 
                {
                    System.out.println("A seasoned worker and senior at " + (workPlace) + ".\n" + "You have had a strong career journey so far, yet there is still an ocean of knowledge and many life experiences for you " + (forename) + ".\n" + "It has been an enjoyable journey so far and many more moments and memories will be made!");

                }
                break;
        }   
        infoScanner.close();
    }
     
}

