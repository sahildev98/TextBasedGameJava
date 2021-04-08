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
public class Robot implements Character {
    /* Task 1 Question c
    Private variables are created to only allow objects to use these instances. 
     Also to achieve escapsluation. Robot class also implements Character Class. 
    */
    private String name;
    private String gender;
    private int serialNum;
    private int health; 
    
    // Task 1 Question c
    // Constructor is a method used to initiaise objects i.e the characters with specfieid attributes.
    public Robot(String name, String gender, int serialNum, int health) {
        this.name = name;
        this.gender = gender;
        this.serialNum = serialNum;
        this.health = health;
    }
    
    // Task 1 Question c) and quesstion e) 
    //Getters and Setters to allow access from private varibles 
    public String getName(){
        return name;
    }
    
    public void setName(String getName){
        name = getName;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String newGender){
        gender = newGender;
    }
    
    public int getSerialNum(){
        return serialNum;
    }
    
    public void setSerialNum(int newSerialNum){
        serialNum = newSerialNum;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int newHealth){
        health = newHealth;
    }
    // //Task 2 Question b)
    // Methods that are very useful for the game to achieve certain element of the game.
    public void reduceHealth(){
       health-=10;
    }
    
    public void increaseHealth(){
        health+=10;
    }
    
    //Task 1 Question a)
    // Abstracte methods
    @Override
    public String bite() {
        String bite = getName() +  " is biting ";
        return bite;
    }

    @Override
    public String move() {
        String move = getName() +  " is moving ";
        return move;
    }
}
