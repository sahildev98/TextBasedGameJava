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
        String attack = getForename() + " is attacking ";
        return attack;
          
    }

    @Override
    public String move() {
        String moveMsg = getForename()+ " is moving ";
        return moveMsg;       
    }
    
    @Override
    public String noMovement(){
        String noMovement = getForename() +  " is not moving";
        return noMovement;
    }
}
