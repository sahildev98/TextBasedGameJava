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
public class Adult extends Person{
    String job;
    public Adult(String name, int age, String gender, int health, String job) {
        super(name, age, gender, health);
        this.job = job;
    }
    
    public void groundChild(String child){
        System.out.println("You're grounded!");
        System.out.println("Game Over!");
    }
    
}
