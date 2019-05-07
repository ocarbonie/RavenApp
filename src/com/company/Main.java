package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NatureOf convo = new NatureOf();
        String answer;
        String answer1;


        System.out.println("Morning, what's going on?(Press Q to quit!)");
        answer = input.nextLine();

        while (!answer.equalsIgnoreCase("Q")) {

            convo.analyzeThis(answer);
            answer = input.nextLine();

        }

        System.out.println("Would you like a copy of the transcript?");
        answer1 = input.nextLine();

        if (answer1.equalsIgnoreCase("Y")) {
            System.out.println( convo.getConvo());

        }

    }
}

