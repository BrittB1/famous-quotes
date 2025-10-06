package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        String[] famousQuotes = {"\"I can accept failure, everyone fails at something. But I can't accept not trying.\" — Michael Jordan ",
                "\"Do not let making a living prevent you from making a life.\" — John Wooden",
                "“Always forgive your enemies; nothing annoys them so much.”\n" +
                        "― Oscar Wilde",
                "“Yesterday is history, tomorrow is a mystery, today is a gift of God, which is why we call it the present.”\n" +
                        "― Bill Keane", "“I have not failed. I've just found 10,000 ways that won't work.”\n" +
                "― Thomas A. Edison", "“A day without sunshine is like, you know, night.”\n" +
                "― Steve Martin"};

        boolean continueProgram = true;

        do {
            try {


                System.out.println("Select a number 1 - 10 to generate a quote: ");

                int index = keyboard.nextInt();


                System.out.println(famousQuotes[index]);
            } catch (Exception e) {

                System.out.println("Sorry, that's out of range. Please choose a number 1 - 10");
            }
            keyboard.nextLine();
            System.out.print("Would you like another quote? (Y/N)");
            String choice = keyboard.nextLine();

        } while (continueProgram == true);

    }
}
