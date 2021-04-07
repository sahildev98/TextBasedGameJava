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
    
    public Dog(String name, int age, String gender, int health) {
        super(name, age, gender, health);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eating");
    }

    @Override
    public void bite() {
        System.out.println(getName()+ " bites ");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving towards ");
    }
    
}
