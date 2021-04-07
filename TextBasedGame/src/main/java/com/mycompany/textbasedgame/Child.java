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
    static Scanner in = new Scanner(System.in);
    public Child(String forename,String surname,String nickname, int age, String gender, int health) {
        super(forename, surname, nickname, age, gender, health);
    }
    
    @Override
    public String attack(){
        String noAttack = getForename() + " is attacking ";
        return noAttack;
          
    }

    @Override
    public String move() {
        System.out.println("Do you want to move to another location?" + "\n"  + "Enter yes or no.");
        String move = in.nextLine();
        if(move.equals("Yes") || move.equals("yes")){
            String moveMsg = getForename()+ " is moving";
            return moveMsg;
        } else {
            String noMove = " is not moving.";
            return noMove;
        }
        
    }
}
