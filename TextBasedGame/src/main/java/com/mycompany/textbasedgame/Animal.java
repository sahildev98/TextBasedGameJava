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
public class Animal {
    private String name;
    private int age;
    private String gender;
    private int health; 

    public Animal(String name, int age, String gender, int health) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.health = health;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String newGender){
        gender = newGender;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int newAge){
        age = newAge;
    }
}
