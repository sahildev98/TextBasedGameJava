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
public abstract class Character {
    private String name;
    private String age;
    private String gender;
    private int health; 

    public Character(String name, String age, String gender, int health) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.health = health;
    } 
}
