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
public class Bird extends Animal implements Character {
     /*
    Task 1 Question b)
    Bird class inherits superclass Animal.
    Bird class also implements interface character which was some methods. 
    Bird class now has access to all methods and instances.*/
    public Bird(String name, int age, String gender, int health) {
        super(name, age, gender, health);
    }
    // Task 1 Question b) 
    // methods from abstract class
    @Override
    public void makeNoise() {
        System.out.println(getName()+ " Kah Kah");
    }
    //Task 1 Question b) and Question c
    @Override
    public void eat() {
        System.out.println(getName()+ " is eating his food");
        increaseHealth();
    }
    //Task 1 Question c)
    // Interface methods that are implemented from character class. 
    @Override
    public String bite() {
        String bite = getName()+ " bites ";
        return bite;
    }
    
    @Override
    public String move() {
        String move =  getName()+ " is moving towards ";
        return move;
    }
    
    
    
}
