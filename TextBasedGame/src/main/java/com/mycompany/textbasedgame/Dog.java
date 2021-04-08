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
public class Dog extends Animal implements Character{
     /*
    Task 1 Question b)
    Dog class inherits superclass Animal.
    Dog class also implements interface character which was some methods. 
    The class now has access to all methods and instances.*/
    public Dog(String name, int age, String gender, int health) {
        super(name, age, gender, health);
    }
    
    // Task 1 question C
    // Interface methods that are implemented from character class. 
    @Override
    public String bite() {
        String bite = getName()+ " bites ";
        return bite;
    }

    @Override
    public String move() {
        String move =  getName() + " is moving towards ";
        return move;
    }
    
    //Task 1 Question b)
    @Override
    public void makeNoise() {
        System.out.println(getName()+ " says GNASH GNASH");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating his food");
        increaseHealth();
    }
    
}
