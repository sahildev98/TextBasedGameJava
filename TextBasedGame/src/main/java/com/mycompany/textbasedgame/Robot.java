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
public class Robot {
    private String name;
    private String gender;
    private int serialNum;
    private int health; 

    public Robot(String name, String gender, int health) {
        this.name = name;
        this.gender = gender;
        this.health = health;
    }
    
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
}
