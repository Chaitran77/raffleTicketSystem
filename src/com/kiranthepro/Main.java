package com.kiranthepro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;

public class Main {

    static HashMap<String, Integer> tickets = new HashMap<>();

    public static void main(String[] args) {
	// write your code here


        while (true) {
            processOption(getInput("Would you like to <purchase> or <check> a ticket?"));
        }
    }

    public static String getInput(String prompt) {
        try {
            System.out.println(prompt);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        } catch (Exception e) {
            return "";
        }
    }

    public static void purchaseTicket() {
        Random random = new Random();
        String name = getInput("What is your name?");
        tickets.put(name, random.nextInt()*100);

    }

    public static boolean checkTicket(String name) {
//        check if ticket number under name is prime
        return false;
    }

    public static void processOption(String option) {
        switch (option) {
            case "purchase":
                purchaseTicket();
                return;
            case "check":
                checkTicket("bob");
                return;
            default:
                System.out.println("Please type either 'purchase' or 'check' when trying again:");
                return;
        }
    }
}
