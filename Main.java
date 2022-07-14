package com.guessthenumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber= 0;
        System.out.println("I have number in my mind,can you guess it?");
        do {

            int UserNumber = sc.nextInt();
            if (UserNumber == myNumber) {
                System.out.println("Wow you got the right number ");
                break;
            } else if (UserNumber > myNumber) {
                System.out.println("YourNumber is Greater");
            } else {
                System.out.println("Your number is Smaller");
            }


        }
        while(userNumber>=0);
        System.out.println("My Number was :"+ myNumber);




    }
}

