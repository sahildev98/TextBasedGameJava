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
    static Scanner in = new Scanner(System.in);
    private String job;
    public Adult(String forename, String surname,String nickname, int age, String gender, int health, String job) {
        super(forename, surname, nickname, age, gender, health);
        this.job = job;
    }
    
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
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String newJob){
       job = newJob;
    }
          
    
    public void jobAttack(){
        System.out.println(getJob() + " attacks ");
    }

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
    public String attack() {
        String attack = getForename() + " is attacking ";
        return attack;
    }
}
