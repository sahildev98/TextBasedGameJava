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
public abstract class Animal {
    /*Task 1 Question b)
    Private variables are created to only allow classes that inherits this class alone. 
     Also to achieve escapsluation.
    */
    private String name;
    private int age;
    private String gender;
    private int health; 
    
    // Task 1 Question b)
    // Constructor is a method used to initiaise objects i.e the characters with specfieid attributes.
    public Animal(String name, int age, String gender, int health) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.health = health;
    }
    
    /* 
    Task 1 Question b) and quesstion e)
    Getters and Setters to allow access from private varibles 
    so that it can be used in classes that inherits this class.
    */
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
    // Task 2 Question b)
    // Methods that are very useful for the game to achieve certain element of the game.  
    public void reduceHealth(){
        health-=10;
    }
    
    public void increaseHealth(){
        health=+10;
    }
    
    /*Task 1 Question a)
    Abstract methods ususally are created for fundamenetals tasks, 
     for all classes that inherits this class. 
    */
    public abstract void makeNoise();
    
    public abstract void eat();
}
