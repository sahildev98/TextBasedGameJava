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
public class Adult extends Person{
    // Scannner is implemeneted user input
    static Scanner in = new Scanner(System.in);
    
    /* Task 1 Question a) 
    Adult class inherits superclass Person.  
    The class now has access to all methods and instances.*/
    private String job;
    public Adult(String forename, String surname,String nickname, int age, String gender, int health, String job) {
        super(forename, surname, nickname, age, gender, health);
        this.job = job;
    }
    
    // Task 1 Question a)
    // Issueban method that is used to ban children. 
    public void issueBan(){
        String grounded = " you're grounded! ";
        System.out.println(grounded);
        System.out.println("Do you want to make up for this?" + "\n" + "Enter yes or no");
        String chance = in.nextLine();
        if(chance.equals ("Yes")|| chance.equals("yes")){
            System.out.println("Clean all the house for three days and your ban is off!");
            System.out.println("Three days latere...");
            System.out.println("Your ban is off now you can do what you wish!");
        } else {
            System.out.println("Still Grounded" + "\n" + "GAME OVER!!!" + "\n" + "START GAME AGAIN");
            System.exit(0);
        }   
    }
    
    //Task 1 Question a) and Question e)
    // getters and setters to allow access to private job variable. 
    public String getJob() {
        return job;
    }
    
    public void setJob(String newJob){
       job = newJob;
    }
    
    // //Task 1 Question a)
    // methods for adults to use for their professtion. 
    public void jobAttack(Child theEnemyChild){
        System.out.println(getForename()+ getJob() + " grabs " + theEnemyChild.getForename());
        System.out.println("YOU HAVE BEEN CAUGHT!" + "\n"+  "GAME OVER" + "START AGAIN TO PLAY");
        System.exit(0);
    }
    
    // //Task 1 Question a)
    // abstract methods that have been inherited from person class and have been altered in thier own way. 
    @Override
    public String move() {
        String move = " is moving ";
        return move;
    }
    
    @Override
    public String noMovement(){
        String noMovement = getForename() +  " is not moving";
        return noMovement;
    }

    @Override
    public void attack(Person theEnemy) {
        System.out.println(getForename() + " is attacking " + theEnemy.getForename());
        theEnemy.reduceHealth();
        System.out.println(theEnemy.getForename() + " now has a health of " + theEnemy.getHealth());
        
    }
}
