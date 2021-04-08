/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.textbasedgame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sahil
 */
public class TestGame {
    // user input for users to enter the responses
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // Task 2 Quesiton a)
        // Objects intialsied from their respective classes. 
        Child dennis = new Child("Dennis", "Menance","The Menance", 10, "Male", 30);
        Adult sandra =  new Adult ("Sandra", "Menance", "Dennis's Mum", 38, "Female", 30, "parent");
        Adult dennisSnr = new Adult("Dennis Snr","Menance", "Dennis's Dad", 42, "Male", 20, "Stationary Worksman");
        Child bea =  new Child ("Beatrice","Menance", "Bea", 3, "Female", 20);
        Adult granny = new Adult("Granny","Menance", "Granny", 80, "Female", 20, "GrandParent");
        Child walter = new Child ("Walter","Brown", "The softy", 12, "Male", 30);
        Adult wilbur = new Adult("Wilbur", "Brown","Walter's Dad", 49, "Male", 20, "Mayor");
        Adult carol = new Adult("Carol","Creecher","The Creecher", 40, "Female", 20, "Teacher");
        Child peter = new Child("Peter", "Shepherd","PiePace", 10, "Male", 20);
        Adult slipper = new Adult("Sergeant Slipper","Slipper", "Slipper", 20, "Male", 30, "Police Officer");
        Adult godfrey = new Adult("Godfrey", "Colonel", "Colonel", 40, "Male", 30, "Miltary Ventran");
        Dog gnasher = new Dog ("Gnasher", 3, "Male", 30);
        Bird joe = new Bird("joe", 5, "Male", 30);
        Dog gnipper = new Dog("Gnipper", 3, "Male", 30);
        Pig rasher = new Pig("Rasher", 4, "Male", 20);
        Robot gnashinator = new Robot("Gnashinator", "Male", 566789, 20);
        Robot biternator = new Robot("Biternator", "Machine", 999999, 20);
        
       
        // Task 1 question d)
        // Arraylists created for locations and items. 
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("The front room");
        locations.add("The treehouse");
        locations.add("The park");
        locations.add("MI 13 secret service headquarters");
        locations.add("Bash street school");
        
        // Task 1 question d)
        // Arraylists created for locations and items. 
        ArrayList<String> items = new ArrayList<String>();
        items.add("Catapults");
        items.add("Pies");
        items.add("Skateboards");
        items.add("Sausages");
        items.add("Hats");
        items.add("Masks");
        items.add("Fake beard");
        items.add("TV");
        
        // Main game operation
        System.out.println("Welcome to Dennis The meneance Text Editior Game!");
        System.out.println("Do you want to start the game?"  + "\n" +  "Enter yes or no.");
        String start = in.nextLine();
        if(start.equals("Yes") || start.equals("yes") || start.equals("YES")){
            System.out.println("You have entered the Menance World!");
        } else{
            System.out.println("Game over!" + "\n" + "Start again");
            System.exit(0);
        }
        System.out.println("Choose which animal do you want play the game with?" + "\n" + "Enter any of the following Animals as (STATED)? " + "\n" 
        + gnasher.getName() + "\n" + joe.getName() + "\n" + gnipper.getName() + "\n" + rasher.getName() );
        String chooseAnimal = in.nextLine();
        if(chooseAnimal.equals("Gnasher") || chooseAnimal.equals("gnipper") || chooseAnimal.equals("rasher")){
            System.out.println(dennis.getForename() + " is with " + chooseAnimal);
        } else{
            System.out.println("Enter name of animal again");
            chooseAnimal = in.nextLine();
        }
        System.out.println("Where do you want to enter first with " + dennis.getForename() + " and " + chooseAnimal + "?" + "\n" + "Enter any of the following locations: ");
        for (String i : locations) {
            System.out.println(i);
        }
        String enter = in.nextLine();
        boolean needAnswer;
        do {
            needAnswer = false;
            switch (enter) {
                case "The front room":
                case "the front room":
                    dennis.prank(dennisSnr);
                    dennis.prank(sandra);
                    System.out.println("Do you want to run or hide?" + "Enter run or escape");
                    String escape = in.nextLine();
                    if (escape.equals("run") || escape.equals("Run") || escape.equals("RUN")) {
                        System.out.println(dennis.getForename() + " has escaped");
                    } else {
                        sandra.issueBan();
                        boolean tv;
                        System.out.println("Do you want to watch " + items.get(7) + "?" + "\n" + " Enter yes or no");
                        tv = false;
                        String watchTV = in.nextLine();
                        if (watchTV.equals("yes") || watchTV.equals("Yes") || watchTV.equals("YES")) {
                            tv = true;
                            System.out.println(dennis.getForename() + " is watching football on " + items.get(7));
                        } else {
                            System.out.println(dennis.getForename() + " does not want to watch " + items.get(7));
                            break;
                        }
                    }

                case "The treehouse":
                case "the treehouse":
                    System.out.println(dennis.getForename() + " and " + chooseAnimal + " are in " + locations.get(1));
                    System.out.println("Do you want to attack anyone?");
                    String askAttack = in.nextLine();
                    if (askAttack.equals("yes") || askAttack.equals("Yes") || askAttack.equals("YES")) {
                        System.out.println("Who do you want to attack from the following?" + "\n"
                                + walter.getForename() + "\n"
                                + wilbur.getForename() + "\n"
                                + slipper.getForename() + "\n"
                                + godfrey.getForename());
                        String attackWho = in.nextLine();
                        switch (attackWho) {
                            case "Walter":
                            case "walter":
                            case "WALTER":
                                System.out.println("Do you want to use " + items.get(1) + " to attack" + walter.getForename() + "?");
                                String itemUse = in.nextLine();
                                if (itemUse.equals("Yes") || itemUse.equals("yes") || itemUse.equals("YES")) {
                                    System.out.println(dennis.getForename() + " is throwing " + items.get(1) + ".");
                                    dennis.attack(walter);
                                    System.out.println("Do you want to attack again?" + "\n" + "Enter yes or no");
                                    String attackAgain = in.nextLine();
                                    if (attackAgain.equals("Yes") || attackAgain.equals("yes") || attackAgain.equals("YES")) {
                                        System.out.println(dennis.getForename() + " is throwing two more" + items.get(1) + ".");
                                        dennis.attack(walter);
                                        dennis.attack(walter);
                                        System.out.println("YOU HAVE WON THE GAME! CONGRATULATIONS YOU REALLY ARE A MENANCE!");
                                    } else {
                                        System.out.println(biternator.bite() + dennis.getForename());
                                        dennis.reduceHealth();
                                        System.out.println(biternator.bite() + dennis.getForename());
                                        dennis.reduceHealth();
                                        System.out.println(biternator.bite() + dennis.getForename());
                                        dennis.reduceHealth();
                                        System.out.println("GAME OVER! YOU HAVE LOST THE GAME" + "\n" + "START AGAIN TO PLAY");
                                    }
                                } else {
                                    System.out.println(gnasher.move() + walter.getForename());
                                    gnasher.makeNoise();
                                    System.out.println(gnasher.bite() + walter.getForename());
                                    walter.reduceHealth();
                                    System.out.println(walter.getForename() + "now has a health of " + walter.getHealth());
                                    System.out.println(gnasher.bite() + walter.getForename());
                                    walter.reduceHealth();
                                    System.out.println(walter.getForename() + "now has a health of " + walter.getHealth());
                                    System.out.println(gnasher.bite() + walter.getForename());
                                    walter.reduceHealth();
                                    System.out.println(walter.getForename() + "has a health of " + walter.getHealth());
                                    gnasher.makeNoise();
                                    System.out.println("YOU HAVE WON THE GAME! CONGRATULATIONS YOU REALLY ARE A MENANCE!");
                                    break;

                                }
                                
                        }

                    }
                case "The park":
                case "the park":
                    System.out.println(dennis.getForename() + " and " + chooseAnimal + " are in " +  locations.get(2));
                    break;
                case "MI 13 Secret Service headquarters":
                case "mi 13 secret service headquarters":
                    System.out.println(dennis.getForename() + " and " + chooseAnimal + " are in " +  locations.get(3));
                    break;
                case "Bash street school":
                case "bash street school":
                    dennis.prank(carol);
                    System.out.println("Do you want to run or hide?" + "Enter run or hide");
                    escape = in.nextLine();
                    if (escape.equals("run") || escape.equals("Run") || escape.equals("RUN")) {
                        System.out.println(dennis.getForename() + " has escaped");
                        System.out.println("YOU HAVE WON THE GAME! CONGRATULATIONS YOU REALLY ARE A MENANCE!");
                    } else {
                        carol.jobAttack(dennis);
                    }
                    break;
                default:
                    System.out.println("Enter Location again.");
                    enter = in.nextLine();
                    needAnswer = true;
                    break;
            }
         }
         while (needAnswer);

            boolean requireAnswer;
            do {
                requireAnswer = false;
                for (int i = 0; i < enter.length(); i++) {
                    System.out.println("Do you want to move to another location?" + "\n" + "Enter Yes or no");
                    enter = in.nextLine();
                }
                System.out.println("WARNING: LAST TIME TO ENTER OTHERWISE GAME ENDS!" + "\n" + "Do you want to move to another location now?" + "\n" + "Enter Yes or no");
                enter = in.nextLine();
                if (enter.equals("yes") || enter.equals("Yes") || enter.equals("YES")) {
                    System.out.println("Enter any of the following locations as (STATED)");
                    for (String i : locations) {
                        System.out.println(i);
                    }
                    enter = in.nextLine();
                    if (locations.contains(enter)) {
                        System.out.println(dennis.move() + "with " + chooseAnimal + " to " + enter);
                    } else if (enter.equals("no") || enter.equals("No") || enter.equals("NO")) {
                        System.out.println(dennis.noMovement());
                    } else {
                        System.out.println("Enter location (how its STATED above)");
                        enter = in.nextLine();
                        System.out.println(dennis.move() + "with " + chooseAnimal + " to " + enter);
                    }
                }
            } while (requireAnswer);
        }

}
         
    
