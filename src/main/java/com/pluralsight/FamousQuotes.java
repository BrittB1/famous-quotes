package com.pluralsight;

import java.util.Scanner;
import java.util.Random;

public class FamousQuotes {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        Random randomChoice = new Random();

        String[] famousQuotes = {"\"I can accept failure, everyone fails at something. But I can't accept not trying.\" — Michael Jordan ",
                "\"Do not let making a living prevent you from making a life.\" — John Wooden",
                "“Always forgive your enemies; nothing annoys them so much.”\n" +
                        "― Oscar Wilde",
                "“Yesterday is history, tomorrow is a mystery, today is a gift of God, which is why we call it the present.”\n" +
                        "― Bill Keane", "“I have not failed. I've just found 10,000 ways that won't work.”\n" +
                "― Thomas A. Edison", "“A day without sunshine is like, you know, night.”\n" +
                "― Steve Martin",
                "“I love deadlines. I love the whooshing noise they make as they go by.”\n" +
                "― Douglas Adams, The Salmon of Doubt: Hitchhiking the Galaxy One Last Time",
                "“Do what you can, with what you have, where you are.”\n" +
                "― Theodore Roosevelt","“A children's story that can only be enjoyed by children is not a good children's story in the slightest.”\n" +
                "― C.S. Lewis"
                ,"“Let us not seek to satisfy our thirst for freedom by drinking from the cup of bitterness and hatred.”\n" +
                "― Martin Luther King Jr."};

        boolean continueProgram = true;

        do {
            try {
                System.out.println("Select a number 1 - 10 to select a quote OR 0 for a random quote: ");
                int userChoice = keyboard.nextInt();

                int index;

                if (userChoice == 0) {
                    index = randomChoice.nextInt(10);
                } else {
                    index = userChoice - 1;

                }
                System.out.println(famousQuotes[index]);
            } catch (Exception e) {

                System.out.println("Sorry, that's out of range. Please choose a number 1 - 10");
                keyboard.nextLine();
            }
            keyboard.nextLine();
            System.out.print("Would you like another quote? (Y/N): ");
            String choice = keyboard.nextLine().toUpperCase();


            if (choice.equals("Y")) { //.equals() compares the content of strings
                continueProgram = true;

            } else {
                System.out.println("Thank you for using the quote generator. Goodbye! \uD83D\uDC4B ");
                continueProgram = false;
            }

        } while (continueProgram);
    }
}