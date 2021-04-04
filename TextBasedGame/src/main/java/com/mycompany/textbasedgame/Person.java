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
public abstract class Person {
    private String name;
    private String nickname;
    private int age;
    private String gender;
    private int health; 

    public Person(String name, String nickname, int age, String gender, int health) {
        this.name = name;
        this.nickname =  nickname;
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
    
    public String getNickanme(){
        return nickname;
    }
    
    public void setNickname(String newNickname){
        nickname = newNickname;
    }
    
    public int getAge(){
      return age;
    }
    
    public void setAge(int newAge){
      age =  newAge;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public void setGender(String newGender){
        gender = newGender;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHhealth(int newAge){
       age = newAge;
    }
    
    public abstract void move();
    
    public abstract void attack();
}
