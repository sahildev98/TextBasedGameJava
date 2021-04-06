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
    public void attack(){
        System.out.println("Do you want to attack?");
        String attack = in.nextLine();
        if(attack.equals("Yes")|| attack.equals("yes")){
        String attack_Msg = "Attack!!!";
        System.out.println(attack_Msg);
        System.out.println(" is attacking ");
        } else {
            System.out.println(" is not attacking");
        }
        
    }

    @Override
    public void move() {
        System.out.println("Do you want to move to another location?" + "\n"  + "Enter yes or no.");
        String move = in.nextLine();
        if(move.equals("Yes") || move.equals("Yes")){
            System.out.println(" is moving ");
        } else {
            System.out.println(" is not moving.");
        }
    }
}
