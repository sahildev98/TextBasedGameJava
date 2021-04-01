/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.textbasedgame;

/**
 *
 * @author Sahil
 */
public class Child extends Person {
    private String attack;
    public Child(String name, int age, String gender, int health) {
        super(name, age, gender, health);
    }
    
    public void attack(){
        String attack_Msg = "Attack!!!";
        System.out.println(attack_Msg);
        System.out.println(" is attacking ");
    }
}
