/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.textbasedgame;

import java.util.Scanner;

/**
 *
 * @author Sahil
 */
public class Child extends Person {
    // Scannner is implemeneted user input
    static Scanner in = new Scanner(System.in);
    //Task 1 Question a)
     /* Child class inherits superclass Person.  
    The class now has access to all methods and instances.*/
    public Child(String forename, String surname, String nickname, int age, String gender, int health) {
        super(forename, surname, nickname, age, gender, health);
    }
    //Task 1 Question a)
    // Abstract methods inherited from person class. 
    @Override
    public void attack(Person theEnemy) {
        System.out.println(getForename() + " is attacking " + theEnemy.getForename());
        theEnemy.reduceHealth();
        System.out.println(theEnemy.getForename() + " now has a health of " + theEnemy.getHealth());
    }

    @Override
    public String move() {
        String moveMsg = getForename() + " is moving ";
        return moveMsg;
    }

    @Override
    public String noMovement() {
        String noMovement = getForename() + " is not moving";
        return noMovement;
    }
    
    //Task 1 Question a)
    // prank methods created to use in the game. 
    public void prank(Adult theEnemy) {
        System.out.println("Do you want to prank " + theEnemy.getForename() + "?");
        String askPrank = in.nextLine();
        if (askPrank.equals("Yes") || askPrank.equals("yes") || askPrank.equals("YES")) {
            System.out.println("What prank do you want to do?");
            String pranks = in.nextLine();
            System.out.println(getForename() + pranks + " at " + theEnemy.getForename());
            System.out.println(theEnemy.getForename()+ " health is " + theEnemy.getHealth());
        } else {
            System.out.println(getForename() + " does not want to prank right now.");
        }
    }
    
    public void prank(Child theEnemy) {
        System.out.println("Do you want to prank " + theEnemy.getForename() + "?");
        String askPrank = in.nextLine();
        if (askPrank.equals("Yes") || askPrank.equals("yes") || askPrank.equals("YES")) {
            System.out.println("What prank do you want to do?");
            String pranks = in.nextLine();
            System.out.println(getForename() + pranks + " at " + theEnemy.getForename());
        } else {
            System.out.println(getForename() + " does not want to prank right now.");
        }
    }
}
